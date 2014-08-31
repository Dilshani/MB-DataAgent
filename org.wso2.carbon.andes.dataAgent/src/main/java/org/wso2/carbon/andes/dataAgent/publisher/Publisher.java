package org.wso2.carbon.andes.dataAgent.publisher;

import org.xml.sax.SAXException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.wso2.carbon.andes.dataAgent.configure.*;
import org.wso2.carbon.andes.dataAgent.urlValidator.UrlValidator;

/**
 * Created by nipuna on 7/18/14.
 */

public class Publisher {

    private Dataoutput data_output;
    private Datainput data_input;
    private UrlValidator url_validator;

    public Publisher() {

        data_input = new Datainput();
        url_validator = new UrlValidator();

    }

    public Dataoutput publisherSelector(String publisher)
            throws ParserConfigurationException, SAXException, IOException {

        if (publisher.equals("BAM")) {

            data_output = new Dataoutput("BAM");
        } else {

            data_output = new Dataoutput("CEP");

        }
        return data_output;
    }

    // set configurations
    public boolean setConfig(String enable, String publisher_name,
                             String username, String password, String ip, String port,
                             String message_stat, String system_stat, String MB_stat)
            throws ParserConfigurationException, TransformerException,
            SAXException, IOException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {

        return data_input.writeConfig(enable, publisher_name, username,
                password, ip, port, message_stat, system_stat, MB_stat);

    }

    // get username
    public String getUsername(String publisher)
            throws ParserConfigurationException, SAXException, IOException {
        publisherSelector(publisher);
        return data_output.getUsername();
    }

    // get password
    public String getPassword(String publisher)
            throws ParserConfigurationException, SAXException, IOException {
        publisherSelector(publisher);
        return data_output.getPassword();
    }

    // get IP address
    public String getIP(String publisher) throws ParserConfigurationException,
            SAXException, IOException {
        publisherSelector(publisher);
        return data_output.getIp();
    }

    // get port number
    public String getPort(String publisher)
            throws ParserConfigurationException, SAXException, IOException {
        publisherSelector(publisher);
        return data_output.getPort();
    }

    // get message statistic configuration
    public boolean getMessageStatConfig(String publisher)
            throws ParserConfigurationException, SAXException, IOException {
        publisherSelector(publisher);
        return data_output.getMessageStatConfig();
    }

    // get system statistic configuration
    public boolean getsystemStatConfig(String publisher)
            throws ParserConfigurationException, SAXException, IOException {
        publisherSelector(publisher);
        return data_output.getSystemStatConfig();
    }

    // get message broker statistic configuration
    public boolean getMBStatConfig(String publisher)
            throws ParserConfigurationException, SAXException, IOException {
        publisherSelector(publisher);
        return data_output.getMBStatConfig();
    }

    // get statistic enable configuration
    public boolean getEnable(String publisher)
            throws ParserConfigurationException, SAXException, IOException {
        publisherSelector(publisher);
        return data_output.isEnable();
    }

    // get URL validation result
    public boolean getURLValidation(String IP, int port)
            throws UnknownHostException, IOException, InvocationTargetException {

        return url_validator.validateURL(IP, port);
    }

}
