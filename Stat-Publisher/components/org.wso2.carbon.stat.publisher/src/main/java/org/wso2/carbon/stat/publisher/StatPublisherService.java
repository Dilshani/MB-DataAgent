package org.wso2.carbon.stat.publisher;

import org.wso2.carbon.stat.publisher.internal.DTO.StatConfigurationDTO;
import org.wso2.carbon.stat.publisher.internal.URL.URLOperations;
import org.wso2.carbon.stat.publisher.internal.data.StatConfiguration;

public class StatPublisherService {


    private StatConfigurationDTO StatConfigurationDTOObject;


    public StatConfiguration getStatConfiguration() {
        StatConfigurationDTOObject = new StatConfigurationDTO();
        return StatConfigurationDTOObject.ReadRegistry();
    }


    //Credential details set method
    public boolean setStatConfiguration(StatConfiguration StatConfigurationData) {
        StatConfigurationDTOObject = new StatConfigurationDTO();
        StatConfigurationDTOObject.WriteRegistry(StatConfigurationData);


        return true;
    }

    //URL validation method
    public boolean URLValidator(String URLS) {

        URLOperations URLValidatorObject = new URLOperations();
        return URLValidatorObject.URLValidator(URLS);


    }
}
