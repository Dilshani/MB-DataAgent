package org.wso2.carbon.andes.dataAgent.dataAgent;

/**
 * Created by sanjaya on 7/14/14.
 */


        import org.apache.log4j.Logger;
        import org.wso2.andes.configuration.Configuration;
        import org.wso2.andes.kernel.*;
        import org.wso2.carbon.databridge.agent.thrift.Agent;
        import org.wso2.carbon.databridge.agent.thrift.AsyncDataPublisher;
        import org.wso2.carbon.databridge.agent.thrift.conf.AgentConfiguration;
        import org.wso2.carbon.databridge.agent.thrift.exception.AgentException;
        import org.wso2.carbon.databridge.commons.Event;
        import org.wso2.carbon.andes.dataAgent.publisher.Publisher;
        import org.wso2.andes.server.cassandra.CQLConnection;
        import org.xml.sax.SAXException;
        // import org.apache.commons.configuration.Configuration;

        import javax.management.*;
        import javax.xml.parsers.ParserConfigurationException;
        import java.io.IOException;
        import java.util.List;
        import org.wso2.andes.kernel.SubscriptionStore;




public class DataAgent{
    private static Logger logger = Logger.getLogger(DataAgent.class);
    public static final String MB_STATS_STREAM = "MESSAGE_STATISTICS";
    public static final String VERSION_MESSAGE = "1.0.0";
    public static final String VERSION_ACK = "1.0.2";


    //private static byte[] messageMetaData;
    private    long messageID;
    private  String messageDestination;
    private   int messageContentLength;
    private    long expirationTime;
    private   boolean isTopic;
    private int NoOfsubscribers;
    //private  static String messageReceivedTime;

    //for ack
    private  long ackMessageID;
    private    String queueName;

    //common
    private   String ip;
    private   String port;
    private   String username;
    private   String password;

    private  long timeStamp;






    public void dataAgent(AndesMessageMetadata message, String application, int subscribers) throws AndesException, IOException, SAXException, ParserConfigurationException {




        messageID = message.getMessageID();
        messageDestination = message.getDestination();
      //  messageMetaData = message.getMetadata();
        messageContentLength = message.getMessageContentLength();
        expirationTime = message.getExpirationTime();
        isTopic = message.isTopic();
        NoOfsubscribers = subscribers;




        Publisher publisherObject = new Publisher();



            ip = publisherObject.getIP(application);
            port = publisherObject.getPort(application);
            username = publisherObject.getUsername(application);
            password= publisherObject.getPassword(application);



        AgentConfiguration agentConfiguration = new AgentConfiguration();
        System.setProperty("javax.net.ssl.trustStore", "repository/resources/security/client-truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
        Agent agent = new Agent(agentConfiguration);

        //Using Asynchronous data publisher
        AsyncDataPublisher asyncDataPublisherMessage = new AsyncDataPublisher("tcp://"+ip+":"+port, username, password, agent);
        String messageStreamDefinition = "{" +
                "  'name':'" + MB_STATS_STREAM + "'," +
                "  'version':'" + VERSION_MESSAGE + "'," +
                "  'nickName': 'MB stats'," +
                "  'description': 'A message received'," +
                "  'metaData':[" +
                "          {'name':'publisherIP','type':'STRING'}" +
                "  ]," +
                "  'payloadData':[" +

                "          {'name':'Message_id','type':'LONG'}," +
                "          {'name':'Destination','type':'STRING'}," +
                "          {'name':'MessageContentLength','type':'INT'}," +
                "          {'name':'expirationTime','type':'LONG'}," +
                "          {'name':'NoOfSubscriptions','type':'STRING'}," +

                " 			{'name':'timestamp','type':'LONG'}" +
                "  ]" +
                "}";
        asyncDataPublisherMessage.addStreamDefinition(messageStreamDefinition, MB_STATS_STREAM, VERSION_MESSAGE);
        publishEventsForMessage(asyncDataPublisherMessage, VERSION_MESSAGE);

    }


    public void dataAgent(AndesAckData ack, String application) throws IOException, SAXException, ParserConfigurationException {

        ackMessageID = ack.messageID;
        queueName = ack.qName;




        Publisher publisherObject = new Publisher();



        ip = publisherObject.getIP(application);
        port = publisherObject.getPort(application);
        username = publisherObject.getUsername(application);
        password= publisherObject.getPassword(application);



        AgentConfiguration agentConfiguration = new AgentConfiguration();
        System.setProperty("javax.net.ssl.trustStore", "repository/resources/security/client-truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
        Agent agent = new Agent(agentConfiguration);

        //Using Asynchronous data publisher
        AsyncDataPublisher asyncDataPublisher = new AsyncDataPublisher("tcp://"+ip+":"+port, username, password, agent);
        String ackStreamDefinition = "{" +
                "  'name':'" + MB_STATS_STREAM + "'," +
                "  'version':'" + VERSION_ACK + "'," +
                "  'nickName': 'MB stats'," +
                "  'description': 'A ack received'," +
                "  'metaData':[" +
                "          {'name':'publisherIP','type':'STRING'}" +
                "  ]," +
                "  'payloadData':[" +

                "          {'name':'Message_id','type':'LONG'}," +
                " 			{'name':'timestamp','type':'LONG'}," +
                " 			{'name':'queueName','type':'STRING'}" +



                "  ]" +
                "}";
        asyncDataPublisher.addStreamDefinition(ackStreamDefinition, MB_STATS_STREAM, VERSION_ACK);
        publishEventsForACK(asyncDataPublisher , VERSION_ACK);

    }

    private  void publishEventsForMessage(AsyncDataPublisher dataPublisher , String version) {


       timeStamp = getTimeStamp();




        Object[] payload = new Object[]{messageID, messageDestination, messageContentLength, expirationTime, Integer.toString(NoOfsubscribers), timeStamp};
        Event event = eventObject(null, new Object[]{ip}, payload);
        try {

            dataPublisher.publish(MB_STATS_STREAM, version, event);
        } catch (AgentException e) {
            logger.error("Failed to publish event", e);
        }

    }


    private  void publishEventsForACK(AsyncDataPublisher dataPublisher , String version) {


        timeStamp =getTimeStamp();




        Object[] payload = new Object[]{ackMessageID, queueName, timeStamp};
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

    private  long getTimeStamp(){


        long timeStamp = System.currentTimeMillis() / 1000L;

        return timeStamp;

    }
}