package org.wso2.carbon.stat.publisher.publisher;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by nipuna on 8/18/14.
 */
public class Observer {


    private long timeInterval = 5000; //time interval for scheduled task

    public Observer(){

//todo: initialize variables here


    }


    //timer task
    public void initializeTimerTask() {

        TimerTask taskPublishStat = new TimerTask() {
            @Override
            public void run() {




            }
        };

        Timer timer = new Timer();

        // scheduling the task at fixed rate
        timer.scheduleAtFixedRate(taskPublishStat, new Date(), timeInterval);
    }
}
