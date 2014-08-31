package org.wso2.carbon.andes.dataAgent.dataAgent;


import org.apache.log4j.Logger;
import org.wso2.andes.kernel.AndesException;
import org.wso2.andes.kernel.MessagingEngine;
import org.wso2.andes.kernel.SubscriptionStore;
import org.wso2.andes.kernel.Subscrption;
import org.wso2.carbon.andes.dataAgent.publisher.Publisher;
import org.wso2.carbon.databridge.agent.thrift.Agent;
import org.wso2.carbon.databridge.agent.thrift.AsyncDataPublisher;
import org.wso2.carbon.databridge.agent.thrift.conf.AgentConfiguration;
import org.wso2.carbon.databridge.agent.thrift.exception.AgentException;
import org.wso2.carbon.databridge.commons.Event;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.wso2.carbon.serverStats.mbeans.MbeansStats;
import org.wso2.carbon.serverStats.*;

public class AutoSender {
    private static Logger logger = Logger.getLogger(DataAgent.class);
    public static final String MB_STATS_SYSTEM_STREAM = "SYSTEM_STATISTICS_MB";
    public static final String MB_STATS_MB_STREAM = "MB_STATISTICS";
    public static final String VERSION_MESSAGE = "1.0.0";

//server stats
    private String heapMemoryUsage;
    private String nonHeapMemoryUsage;
    private String CPULoadAverage;



    //common
    private  String ip;
    private  String port;
    private  String username;
    private  String password;

    private  long timeStamp;

    //subscriptions
    private SubscriptionStore subscriptionStore;


    //topic and queue
    private int noOfTopics;
    private int totalSubscribers;



    public void dataAgent(final String application) throws Exception {



        final Publisher publisherObject = new Publisher(); //create publisher object for get BAM or CEP configuration

        //configurations for BAM or CEP
        ip = publisherObject.getIP(application);
        port = publisherObject.getPort(application);
        username = publisherObject.getUsername(application);
        password= publisherObject.getPassword(application);



        // creating timer task, timer
        TimerTask tasknew = new TimerTask() {
            @Override
            public void run() {

                //if publisher is enabled and Queue and Topic Stats enabled



                try {
                    if(publisherObject.getEnable(application) && publisherObject.getMBStatConfig(application)){

                        noOfTopics = getTopicList().size(); //get number of topic in a cluster
                        totalSubscribers = getTotalSubscriptions();

                        sendMbStats(application);


                    }
                } catch (ParserConfigurationException e) {
                    logger.error("ParserConfigurationException caused",e);
                } catch (SAXException e) {
                    logger.error("SAXException caused",e);
                } catch (IOException e) {
                    logger.error("IOException caused",e);
                } catch (AndesException e) {
                    logger.error("IOException caused",e);
                } catch (Exception e) {
                    logger.error("Exception caused",e);
                }

                try {
                    if(publisherObject.getEnable(application) && publisherObject.getsystemStatConfig(application)){


                        //JMX............

                        //get server stats
                        MbeansStats mbeansStats = new MbeansStats("localhost",10000,"admin","admin");

                        heapMemoryUsage = mbeansStats.getHeapMemoryUsage();
                        nonHeapMemoryUsage = mbeansStats.getNonHeapMemoryUsage();
                        CPULoadAverage = mbeansStats.getCPULoadAverage();

                        sendSystemStats(application);




                    }
                } catch (Exception e) {
                    logger.error("Exception caused when getting the server stats",e);
                }


            }
        };
        Timer timer = new Timer();

        // scheduling the task at fixed rate
        timer.scheduleAtFixedRate(tasknew,new Date(),30000);





    }

    private void sendMbStats(String application){


        AgentConfiguration agentConfiguration = new AgentConfiguration();
        System.setProperty("javax.net.ssl.trustStore", "repository/resources/security/client-truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
        Agent agent = new Agent(agentConfiguration);

        //Using Asynchronous data publisher
        AsyncDataPublisher asyncDataPublisherMessage = new AsyncDataPublisher("tcp://" + ip + ":" + port, username, password, agent);
        String messageStreamDefinition = "{" +
                "  'name':'" + MB_STATS_MB_STREAM + "'," +
                "  'version':'" + VERSION_MESSAGE + "'," +
                "  'nickName': 'MB stats'," +
                "  'description': 'Server Stats'," +
                "  'metaData':[" +
                "          {'name':'publisherIP','type':'STRING'}" +
                "  ]," +
                "  'payloadData':[" +


                "          {'name':'NoOfSubscribers','type':'INT'}," +
                "          {'name':'NoOfTopics','type':'INT'}," +
                " 			{'name':'timestamp','type':'LONG'}" +
                "  ]" +
                "}";
        asyncDataPublisherMessage.addStreamDefinition(messageStreamDefinition, MB_STATS_MB_STREAM, VERSION_MESSAGE);
        publishEventsForMBstats(asyncDataPublisherMessage, VERSION_MESSAGE);


    }



    private void sendSystemStats(String application){


        AgentConfiguration agentConfiguration = new AgentConfiguration();
        System.setProperty("javax.net.ssl.trustStore", "repository/resources/security/client-truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
        Agent agent = new Agent(agentConfiguration);

        //Using Asynchronous data publisher
        AsyncDataPublisher asyncDataPublisherMessage = new AsyncDataPublisher("tcp://" + ip + ":" + port, username, password, agent);
        String messageStreamDefinition = "{" +
                "  'name':'" + MB_STATS_SYSTEM_STREAM + "'," +
                "  'version':'" + VERSION_MESSAGE + "'," +
                "  'nickName': 'MB stats'," +
                "  'description': 'Server Stats'," +
                "  'metaData':[" +
                "          {'name':'publisherIP','type':'STRING'}" +
                "  ]," +
                "  'payloadData':[" +

               " {'name':'HeapMemoryUsage','type':'STRING'}," +
                "         {'name':'nonHeapMemoryUsage','type':'STRING'}," +
                "          {'name':'CPULoadAverage','type':'STRING'}," +
                " 			{'name':'timestamp','type':'LONG'}" +
                "  ]" +
                "}";
        asyncDataPublisherMessage.addStreamDefinition(messageStreamDefinition, MB_STATS_SYSTEM_STREAM, VERSION_MESSAGE);
        publishEventsForSystemStats(asyncDataPublisherMessage, VERSION_MESSAGE);


    }


    private  int getTotalSubscriptions() throws Exception {

        List<String> topics = getTopicList();

        MessagingEngine messaginEngine =MessagingEngine.getInstance();
        subscriptionStore =   messaginEngine.getSubscriptionStore();

        for (String topic: topics){


          List<Subscrption> subscrptionsList =  subscriptionStore.getActiveClusterSubscribersForDestination(topic, true);
           totalSubscribers += subscrptionsList.size();


        }


return totalSubscribers;




    }

    private List<String> getTopicList() throws Exception {

        MessagingEngine messaginEngine =MessagingEngine.getInstance();
         subscriptionStore =   messaginEngine.getSubscriptionStore();
         List<String> topics =  subscriptionStore.getTopics();
        noOfTopics = topics.size();



        return topics;




    }


    private  void publishEventsForMBstats(AsyncDataPublisher dataPublisher, String version) {


        timeStamp = getTimeStamp();


        Object[] payload = new Object[]{totalSubscribers,noOfTopics,timeStamp};
        Event event = eventObject(null, new Object[]{ip}, payload);
        try {

            dataPublisher.publish(MB_STATS_MB_STREAM, version, event);
        } catch (AgentException e) {
            logger.error("Failed to publish event", e);
        }

    }

    private  void publishEventsForSystemStats(AsyncDataPublisher dataPublisher, String version) {


        timeStamp = getTimeStamp();


        Object[] payload = new Object[]{heapMemoryUsage,nonHeapMemoryUsage,CPULoadAverage,timeStamp};
        Event event = eventObject(null, new Object[]{ip}, payload);
        try {

            dataPublisher.publish(MB_STATS_SYSTEM_STREAM, version, event);
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
