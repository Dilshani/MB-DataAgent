package org.wso2.carbon.andes.dataAgent.dataAgent;

/**
 * Created by sanjaya on 7/14/14.
 */


import org.apache.log4j.Logger;
import org.wso2.andes.kernel.AndesMessageMetadata;
import org.wso2.carbon.databridge.agent.thrift.Agent;
import org.wso2.carbon.databridge.agent.thrift.AsyncDataPublisher;
import org.wso2.carbon.databridge.agent.thrift.conf.AgentConfiguration;
import org.wso2.carbon.databridge.agent.thrift.exception.AgentException;
import org.wso2.carbon.databridge.commons.Event;

public class DataAgent {
    private static Logger logger = Logger.getLogger(DataAgent.class);
    public static final String MB_STATS_STREAM = "MB_stats_2";
    public static final String VERSION = "1.1.1";


    private static long messageID;
    private static String messageDestination;
    private static String messageReceivedTime;
    private static String timeStamp = "1366433587";


    public void dataAgent(AndesMessageMetadata message) {

        messageID = message.getMessageID();
        messageDestination = message.getDestination();
        messageReceivedTime = "00.00.00";

        //to do ---> messageReceived time


        AgentConfiguration agentConfiguration = new AgentConfiguration();
        System.setProperty("javax.net.ssl.trustStore", "repository/resources/security/client-truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
        Agent agent = new Agent(agentConfiguration);

        //Using Asynchronous data publisher
        AsyncDataPublisher asyncDataPublisher = new AsyncDataPublisher("tcp://localhost:7611", "admin", "admin", agent);
        String streamDefinition = "{" +
                "  'name':'" + MB_STATS_STREAM + "'," +
                "  'version':'" + VERSION + "'," +
                "  'nickName': 'MB stats'," +
                "  'description': 'A message received'," +
                "  'metaData':[" +
                "          {'name':'publisherIP','type':'STRING'}" +
                "  ]," +
                "  'payloadData':[" +

                "          {'name':'Message_id','type':'LONG'}," +
                "          {'name':'Destination','type':'STRING'}," +
                "          {'name':'Message_received_time','type':'STRING'}," +
                " 			{'name':'timestamp','type':'LONG'}" +


                "  ]" +
                "}";
        asyncDataPublisher.addStreamDefinition(streamDefinition, MB_STATS_STREAM, VERSION);
        publishEvents(asyncDataPublisher);

    }

    private static void publishEvents(AsyncDataPublisher dataPublisher) {


        Object[] payload = new Object[]{messageID, messageDestination, messageReceivedTime
                , Long.parseLong(timeStamp)};
        Event event = eventObject(null, new Object[]{"localhost"}, payload);
        try {

            dataPublisher.publish(MB_STATS_STREAM, VERSION, event);
        } catch (AgentException e) {
            logger.error("Failed to publish event", e);
        }

    }

    private static Event eventObject(Object[] correlationData, Object[] metaData, Object[] payLoadData) {
        Event event = new Event();
        event.setCorrelationData(correlationData);
        event.setMetaData(metaData);
        event.setPayloadData(payLoadData);
        return event;
    }
}