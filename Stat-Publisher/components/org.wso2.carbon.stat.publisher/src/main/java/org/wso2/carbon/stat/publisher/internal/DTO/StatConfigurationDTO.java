package org.wso2.carbon.stat.publisher.internal.DTO;

import org.wso2.carbon.stat.publisher.internal.data.StatConfiguration;

/**
 * Created by nipuna on 8/15/14.
 */
public class StatConfigurationDTO {


    //write stat configurations to registry
    public boolean WriteRegistry(StatConfiguration statConfigurationObject) {

       // TODO://if isEnableStatPublisher is false and getPassword ,getUsername and getURL == null That should be update only Stat publisher field
        System.out.println(statConfigurationObject.isEnableStatPublisher());
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

        statConfigurationReadObject.setEnableStatPublisher(false);
        statConfigurationReadObject.setUsername("adminstat");
        statConfigurationReadObject.setPassword("admin");

        statConfigurationReadObject.setMB_statEnable(true);
        statConfigurationReadObject.setMessage_statEnable(false);
        statConfigurationReadObject.setURL("127.0.0.1:9443;127.0.0.1:9443");
        statConfigurationReadObject.setSystem_statEnable(true);

        return statConfigurationReadObject;

    }


}
