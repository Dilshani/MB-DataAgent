package org.wso2.carbon.stat.publisher.DTO;

import org.wso2.carbon.stat.publisher.data.StatConfiguration;
import org.wso2.carbon.stat.publisher.publisher.Observer;

/**
 * Created by nipuna on 8/15/14.
 */
public class StatConfigurationDTO {


    //write stat configurations to registry
    public boolean WriteRegistry(StatConfiguration statConfigurationObject) {


        System.out.println(statConfigurationObject.isEnableStatPublisher()+"yep2");
        System.out.println(statConfigurationObject.getUsername());
        System.out.println(statConfigurationObject.getPassword());
        System.out.println(statConfigurationObject.getURL());
        System.out.println(statConfigurationObject.isMB_statEnable());
        System.out.println(statConfigurationObject.isMessage_statEnable());
        System.out.println(statConfigurationObject.isSystem_statEnable());


        return true;
    }

    //read stat configurations from registry
    public StatConfiguration ReadRegistry() {

        StatConfiguration statConfigurationReadObject = new StatConfiguration();

        statConfigurationReadObject.setEnableStatPublisher(true);
        statConfigurationReadObject.setUsername("admin2");
        statConfigurationReadObject.setPassword("admin");

        statConfigurationReadObject.setMB_statEnable(true);
        statConfigurationReadObject.setMessage_statEnable(true);
        statConfigurationReadObject.setURL("127.0.0.1:9443;127.0.0.1:9443");
        statConfigurationReadObject.setSystem_statEnable(true);
        Observer ob=new Observer();
        ob.initializeTimerTask();
        return statConfigurationReadObject;

    }


}
