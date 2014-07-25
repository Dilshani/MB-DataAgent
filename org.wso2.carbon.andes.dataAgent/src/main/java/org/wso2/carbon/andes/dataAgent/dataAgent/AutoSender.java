package org.wso2.carbon.andes.dataAgent.dataAgent;


import org.apache.log4j.Logger;
import org.wso2.andes.kernel.AndesAckData;
import org.wso2.andes.kernel.AndesMessageMetadata;
import org.wso2.andes.kernel.SubscriptionStore;
import org.wso2.andes.kernel.Subscrption;
import org.wso2.carbon.databridge.agent.thrift.Agent;
import org.wso2.carbon.databridge.agent.thrift.AsyncDataPublisher;
import org.wso2.carbon.databridge.agent.thrift.conf.AgentConfiguration;
import org.wso2.carbon.databridge.agent.thrift.exception.AgentException;
import org.wso2.carbon.databridge.commons.Event;
import org.wso2.carbon.andes.dataAgent.publisher.Publisher;
import org.wso2.carbon.andes.dataAgent.serverStats.serverStats;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;


public class AutoSender {
    private static Logger logger = Logger.getLogger(DataAgent.class);
    public static final String MB_STATS_STREAM = "MB_stats_10";
    public static final String VERSION_MESSAGE = "2.2.7";



    private String availableProcessors; 	/* Total number of processors or cores available to the JVM */
    private String freeMemory;  /* Total amount of free memory available to the JVM */
    private String totalMemory; /* Total memory currently available to the JVM */



    //common
    private  String ip;
    private  String port;
    private  String username;
    private  String password;

    private  long timeStamp;

    //subscriptions
    private SubscriptionStore subscriptionStore;
    private int subscriptionCount=0;


    public void dataAgent(String application) throws IOException, SAXException, ParserConfigurationException {

        Publisher publisherObject = new Publisher();




        serverStats serverStatsObject = new serverStats();

        serverStatsObject.setAvailableProcessors();
        serverStatsObject.setFreeMemory();
        serverStatsObject.setTotalMemory();;


        availableProcessors =Integer.toString(serverStatsObject.getAvailableProcessors());
        freeMemory = Long.toString(serverStatsObject.getFreeMemory());
        totalMemory = Long.toString(serverStatsObject.getAvailableProcessors());

        System.out.println("available processors: "+availableProcessors);
        System.out.println("free memory: "+freeMemory);
        System.out.println("total memory: "+totalMemory);



        ip = publisherObject.getIP(application);
        port = publisherObject.getPort(application);
        username = publisherObject.getUsername(application);
        password= publisherObject.getPassword(application);






        AgentConfiguration agentConfiguration = new AgentConfiguration();
        System.setProperty("javax.net.ssl.trustStore", "repository/resources/security/client-truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
        Agent agent = new Agent(agentConfiguration);

        //Using Asynchronous data publisher
        AsyncDataPublisher asyncDataPublisherMessage = new AsyncDataPublisher("tcp://" + ip + ":" + port, username, password, agent);
        String messageStreamDefinition = "{" +
                "  'name':'" + MB_STATS_STREAM + "'," +
                "  'version':'" + VERSION_MESSAGE + "'," +
                "  'nickName': 'MB stats'," +
                "  'description': 'Server Stats'," +
                "  'metaData':[" +
                "          {'name':'publisherIP','type':'STRING'}" +
                "  ]," +
                "  'payloadData':[" +

                "          {'name':'availableProcessors','type':'STRING'}," +
                "          {'name':'freeMemory','type':'STRING'}," +
                "          {'name':'totalMemory','type':'STRING'}," +
                " 			{'name':'timestamp','type':'LONG'}" +
                "  ]" +
                "}";
        asyncDataPublisherMessage.addStreamDefinition(messageStreamDefinition, MB_STATS_STREAM, VERSION_MESSAGE);
        publishEventsForMessage(asyncDataPublisherMessage, VERSION_MESSAGE);

    }

    private  void getTotalSubscriptions(){



      //  List<Subscrption> subscriptionList = subscriptionStore.getClusterSubscribersForTopic(message.getDestination());
      // subscriptionCount += subscriptionList.size();




    }

    private void getTopicList(){


    }


    private  void publishEventsForMessage(AsyncDataPublisher dataPublisher, String version) {


        timeStamp = getTimeStamp();


        Object[] payload = new Object[]{availableProcessors,freeMemory,totalMemory,timeStamp};
        Event event = eventObject(null, new Object[]{ip}, payload);
        try {

            dataPublisher.publish(MB_STATS_STREAM, version, event);
        } catch (AgentException e) {
            logger.error("Failed to publish event", e);
        }

    }


    private  Event eventObject(Object[] correlationData, Object[] metaData, Object[] payLoadData) {
        Event event = new Event();
        event.setCorrelationData(correlationData);
        event.setMetaData(metaData);
        event.setPayloadData(payLoadData);
        return event;
    }

    private  long getTimeStamp() {


        long timeStamp = System.currentTimeMillis() / 1000L;

        return timeStamp;

    }
}
