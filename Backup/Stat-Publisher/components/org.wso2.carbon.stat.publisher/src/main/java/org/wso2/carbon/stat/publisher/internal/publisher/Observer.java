package org.wso2.carbon.stat.publisher.internal.publisher;

import org.wso2.carbon.stat.publisher.internal.DTO.StatConfigurationDTO;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by nipuna on 8/18/14.
 */
public class Observer {


    StatConfigurationDTO statConfigurationDTOObject;

    private long timeInterval = 5000; //time interval for scheduled task


    public Observer() {
        statConfigurationDTOObject = new StatConfigurationDTO();

//todo: initialize variables here


    }


    //timer task
    public void initializeTimerTask(final int TenetID) {

        TimerTask taskPublishStat = new TimerTask() {


            @Override

            public void run() {


                int tenantID = TenetID;
                if (statConfigurationDTOObject.ReadRegistry(tenantID).isEnableStatPublisher()) {

                    Thread thread = new Thread(new Publisher(tenantID));
                    thread.start();


                }



            }
        };

        Timer timer = new Timer();

        // scheduling the task at fixed rate
        timer.scheduleAtFixedRate(taskPublishStat, new Date(), timeInterval);
    }
}
