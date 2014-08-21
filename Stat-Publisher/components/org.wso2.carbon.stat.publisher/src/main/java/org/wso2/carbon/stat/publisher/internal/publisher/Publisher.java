package org.wso2.carbon.stat.publisher.internal.publisher;

/**
 * Created by nipuna on 8/20/14.
 */
public class Publisher implements Runnable {

    private int TID;


    public Publisher(int ID) {

        TID = ID;

    }

    public String Publisher() {


        System.out.println("Data Publishing activated" + TID);

        return "";
    }


    @Override
    public void run() {

        //  synchronized(Publisher()) {
        Publisher();
        //  }

    }
}
