package org.wso2.carbon.stat.publisher.DTO;

import org.wso2.carbon.stat.publisher.data.StatConfiguration;

/**
 * Created by nipuna on 8/15/14.
 */
public class StatConfigurationDTO {


    public boolean WriteRegistry(StatConfiguration CredentialStoreWriteObject) {


        System.out.println(CredentialStoreWriteObject.isEnableStatPublisher());
        System.out.println(CredentialStoreWriteObject.getUsername());
        System.out.println(CredentialStoreWriteObject.getPassword());
        System.out.println(CredentialStoreWriteObject.getURL());
        System.out.println(CredentialStoreWriteObject.isMB_statEnable());
        System.out.println(CredentialStoreWriteObject.isMessage_statEnable());
        System.out.println(CredentialStoreWriteObject.isSystem_statEnable());


        return true;
    }

    public StatConfiguration ReadRegistry() {

       StatConfiguration statConfigurationReadObject = new StatConfiguration();

        statConfigurationReadObject.setEnableStatPublisher(true);
        statConfigurationReadObject.setUsername("admin");
        statConfigurationReadObject.setPassword("admin");

        statConfigurationReadObject.setMB_statEnable(true);
        statConfigurationReadObject.setMessage_statEnable(true);
        statConfigurationReadObject.setURL("127.0.0.1:9443;127.0.0.1:9443");
        statConfigurationReadObject.setSystem_statEnable(true);

        return statConfigurationReadObject;

    }


}
