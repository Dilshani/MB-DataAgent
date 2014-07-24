package org.wso2.carbon.andes.dataAgent.urlValidator;


import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class UrlValidator {

    public boolean validateURL(String ip, int port)
            throws UnknownHostException, IOException {
        boolean response = true;

        Socket Serversockt = new Socket(ip, port);
        Serversockt.close();

        response = false;

        response = false;

        return response;
    }

}
