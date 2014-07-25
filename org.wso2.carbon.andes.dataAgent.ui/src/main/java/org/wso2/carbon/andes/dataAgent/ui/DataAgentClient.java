package org.wso2.carbon.andes.dataAgent.ui;

import org.wso2.carbon.andes.dataAgent.stub.*;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;

import java.rmi.RemoteException;

/**
 * Created by nipuna on 7/20/14.
 */
public class DataAgentClient {

    private PublisherStub stub;
    private static DataAgentClient dataClient;

    public static DataAgentClient getDataAgentClient() throws Exception {

        return dataClient;


    }

    public DataAgentClient(ConfigurationContext configCtx, String backendServerURL, String cookie) throws Exception {
        String serviceURL = backendServerURL + "Publisher";
        stub = new PublisherStub(configCtx, serviceURL);

        ServiceClient client = stub._getServiceClient();
        Options options = client.getOptions();
        options.setManageSession(true);
        options.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING, cookie);
        dataClient = this;


    }


    public boolean IPValidator(String IP, int port) {
        try {
            try {
                return stub.getURLValidation(IP, port);
            } catch (PublisherUnknownHostExceptionException e) {
                e.printStackTrace();
            } catch (PublisherIOExceptionException e) {
                e.printStackTrace();
            }

        } catch (RemoteException e) {


        }
        return false;
    }


    public String setConfig(String enable, String publisher_name,
                            String username, String password, String ip, String port,
                            String message_stat, String system_stat, String MB_stat) {

        String result = "Successfully Created";
        boolean response;
        try {

            response = stub.setConfig(enable, publisher_name, username,
                    password, ip, port, message_stat, system_stat, MB_stat);
        } catch (Exception e) {
            result = e + "";
        }

        return result;
    }


    public boolean getEnable(String publisher_name) {

        boolean response = false;

        try {
            response = stub.getEnable(publisher_name);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (PublisherIOExceptionException e) {
            e.printStackTrace();
        } catch (PublisherSAXExceptionException e) {
            e.printStackTrace();
        } catch (PublisherParserConfigurationExceptionException e) {
            e.printStackTrace();
        }

        return response;
    }

public  String getUsername(String publisher_name){
String response="";


    try {
        response= stub.getUsername(publisher_name);
    } catch (RemoteException e) {
        e.printStackTrace();
    } catch (PublisherIOExceptionException e) {
        e.printStackTrace();
    } catch (PublisherSAXExceptionException e) {
        e.printStackTrace();
    } catch (PublisherParserConfigurationExceptionException e) {
        e.printStackTrace();
    }


    return response;
}

    public  String getPassword(String publisher_name){
        String response="";

        try {
            response= stub.getPassword(publisher_name);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (PublisherIOExceptionException e) {
            e.printStackTrace();
        } catch (PublisherSAXExceptionException e) {
            e.printStackTrace();
        } catch (PublisherParserConfigurationExceptionException e) {
            e.printStackTrace();
        }


        return response;
    }


    public  String getIP(String publisher_name){
        String response="";
        try {
            response= stub.getIP(publisher_name);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (PublisherIOExceptionException e) {
            e.printStackTrace();
        } catch (PublisherSAXExceptionException e) {
            e.printStackTrace();
        } catch (PublisherParserConfigurationExceptionException e) {
            e.printStackTrace();
        }

        return response;
    }

    public  String getPort(String publisher_name){
        String response="";

        try {
            response= stub.getPort(publisher_name);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (PublisherIOExceptionException e) {
            e.printStackTrace();
        } catch (PublisherSAXExceptionException e) {
            e.printStackTrace();
        } catch (PublisherParserConfigurationExceptionException e) {
            e.printStackTrace();
        }


        return response;
    }

    public  boolean getMBStatConfig(String publisher_name){
        boolean response=false;
        try {
            response= stub.getMBStatConfig(publisher_name);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (PublisherIOExceptionException e) {
            e.printStackTrace();
        } catch (PublisherSAXExceptionException e) {
            e.printStackTrace();
        } catch (PublisherParserConfigurationExceptionException e) {
            e.printStackTrace();
        }

        return response;
    }

    public  boolean getMessageStatConfig(String publisher_name){
        boolean response=false;
        try {
            response= stub.getMessageStatConfig(publisher_name);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (PublisherIOExceptionException e) {
            e.printStackTrace();
        } catch (PublisherSAXExceptionException e) {
            e.printStackTrace();
        } catch (PublisherParserConfigurationExceptionException e) {
            e.printStackTrace();
        }

        return response;
    }

    public  boolean getSystemStatConfig(String publisher_name){
        boolean response=false;
        try {
            response= stub.getsystemStatConfig(publisher_name);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (PublisherIOExceptionException e) {
            e.printStackTrace();
        } catch (PublisherSAXExceptionException e) {
            e.printStackTrace();
        } catch (PublisherParserConfigurationExceptionException e) {
            e.printStackTrace();
        }

        return response;
    }
}

