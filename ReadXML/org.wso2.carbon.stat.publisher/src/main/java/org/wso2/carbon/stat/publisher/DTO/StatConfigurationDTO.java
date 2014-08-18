package org.wso2.carbon.stat.publisher.DTO;

/**
 * Created by dilshani on 8/13/14.
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.context.CarbonContext;
import org.wso2.carbon.context.RegistryType;
//import org.wso2.carbon.core.RegistryResources;
import org.wso2.carbon.registry.api.Resource;
import org.wso2.carbon.registry.api.Registry;
import org.wso2.carbon.registry.api.RegistryException;
//import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.stat.publisher.data.StatConfiguration;


public class StatConfigurationDTO {
    public static Log log = LogFactory.getLog(StatConfigurationDTO.class);

    public void CreateResource() {
        try {
            CarbonContext carbonContext = CarbonContext.getCurrentContext();
            Registry registry = carbonContext.getRegistry(RegistryType.SYSTEM_CONFIGURATION);
            String registryType = RegistryType.SYSTEM_GOVERNANCE.toString();
            if (registryType != null) {
                registry = carbonContext.getRegistry(RegistryType.valueOf(registryType));
            }

            Resource resource = registry.newResource();
            resource.setContent("Hello");
            String resourcePath = " /StatPublisher/config_Test/users";

            registry.put(resourcePath, resource);
        }catch(RegistryException exception){
            log.error("Can not load Registry!",exception);
        }
        }

    //public static Log log = LogFactory.getLog(CredentialStoreController.class);

    public boolean WriteRegistry(StatConfiguration CredentialStoreWriteObject) {

        StatConfigurationDTO statConfigurationDTO=new StatConfigurationDTO();
        statConfigurationDTO.CreateResource();
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



