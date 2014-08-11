package org.wso2.carbon.serverStats.publisher;

/**
 * Created by sanjaya on 8/10/14.
 */
import org.wso2.carbon.serverStats.publisher.StatPublisher;
public class StatPublisher {

StatPublisher statPublisher = new StatPublisher();

    public String getHeapMemoryUsage(){

    return statPublisher.getHeapMemoryUsage();


    }
    public String getNonHeapMemoryUsage(){
        return statPublisher.getNonHeapMemoryUsage();
    }
    public String getCPULoadAvg(){

        return statPublisher.getCPULoadAvg();
    }



}
