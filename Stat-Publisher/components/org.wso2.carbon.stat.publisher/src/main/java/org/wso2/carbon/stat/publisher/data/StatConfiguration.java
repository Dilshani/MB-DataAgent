package org.wso2.carbon.stat.publisher.data;

public class StatConfiguration {

    //National Identity Card Number
    //http://en.wikipedia.org/wiki/National_identification_number#Sri_Lanka
    private String username;
    private String password;
    private String URL;
    private boolean enableStatPublisher;

    private boolean message_statEnable;
    private boolean system_statEnable;
    private boolean MB_statEnable;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public boolean isEnableStatPublisher() {
        return enableStatPublisher;
    }

    public void setEnableStatPublisher(boolean enableStatPublisher) {
        this.enableStatPublisher = enableStatPublisher;
    }

    public boolean isMessage_statEnable() {
        return message_statEnable;
    }

    public void setMessage_statEnable(boolean message_statEnable) {
        this.message_statEnable = message_statEnable;
    }

    public boolean isSystem_statEnable() {
        return system_statEnable;
    }

    public void setSystem_statEnable(boolean system_statEnable) {
        this.system_statEnable = system_statEnable;
    }

    public boolean isMB_statEnable() {
        return MB_statEnable;
    }

    public void setMB_statEnable(boolean MB_statEnable) {
        this.MB_statEnable = MB_statEnable;
    }
}
