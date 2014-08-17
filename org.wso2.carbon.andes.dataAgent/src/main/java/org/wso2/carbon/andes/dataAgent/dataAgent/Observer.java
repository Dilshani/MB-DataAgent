package org.wso2.carbon.andes.dataAgent.dataAgent;


import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

//this class is called when carbon starts
public class Observer {

    private long timeInterval = 30000; //time interval for scheduled task

    public Observer(){

//todo: initialize variables here
    }


    //timer task
    public void initializeTimerTask() {

        TimerTask tasknew = new TimerTask() {
            @Override
            public void run() {


            }
        };

        Timer timer = new Timer();

        // scheduling the task at fixed rate
        timer.scheduleAtFixedRate(tasknew, new Date(), timeInterval);
    }

}
