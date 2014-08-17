package org.wso2.carbon.andes.dataAgent.ui;

import java.io.IOException;
import java.rmi.RemoteException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by nipuna on 7/21/14.
 */
@SuppressWarnings("serial")
public class DataAgentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException, RemoteException {

        String enable = "false";
        String button_action = "";
        String publisher_name = "";
        String username = "";
        String password = "";
        String ip = "";
        String port = "";
        String message_stat = "";
        String system_stat = "";
        String MB_stat = "";

        button_action = req.getParameter("saveButton");
        publisher_name = req.getParameter("publisher_name");


        if (button_action.equals("Save")) {

            enable = req.getParameter("enable_check");
            username = req.getParameter("username");
            password = req.getParameter("password");
            ip = req.getParameter("ip_address");
            port = req.getParameter("port_num");
            message_stat = req.getParameter("message_stat_check");
            system_stat = req.getParameter("system_stat_check");
            MB_stat = req.getParameter("MB_stat_check");

        }

        DataAgentClient client;
        String validateResponse;

        try {

            try {
                client = DataAgentClient.getDataAgentClient();

                validateResponse = client.setConfig(enable, publisher_name, username,
                        password, ip, port, message_stat, system_stat, MB_stat);

                if (button_action.equals("Reset")) {

                    validateResponse="Successfully reset";

                }

                req.setAttribute("servlet_resp", validateResponse);


                if(publisher_name.equals("BAM")) {
                    req.getRequestDispatcher("/carbon/publisher/bam_publisher.jsp").forward(req, resp);
                }else{
                    req.getRequestDispatcher("/carbon/publisher/cep_publisher.jsp").forward(req, resp);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {


        }
    }


}
