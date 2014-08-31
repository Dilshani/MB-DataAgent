package org.wso2.carbon.andes.dataAgent.urlValidator;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.net.UnknownHostException;

public class UrlValidator {

    public boolean validateURL(String ip, int port)
            throws UnknownHostException, IOException, InvocationTargetException {
        boolean response = true;
        try {
            Socket server_socket = new Socket(ip, port);
            server_socket.close();
        } catch (Exception e) {
            response = false;
        }


        return response;
    }

}
