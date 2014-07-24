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

        String enable = req.getParameter("enable_check");
        String publisher_name = req.getParameter("publisher_name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String ip = req.getParameter("ip_address");
        String port = req.getParameter("port_num");
        String message_stat = "true";
        String system_stat = "true";
        String MB_stat = "true";


        DataAgentClient client;
        String validateResponse;

        try {

            try {
                client = DataAgentClient.getDataAgentClient();
                validateResponse = client.setConfig(enable, publisher_name, username,
                        password, ip, port, message_stat, system_stat, MB_stat);
                req.setAttribute("resp", validateResponse);
                req.getRequestDispatcher("/carbon/publisher/bam_publisher.jsp").forward(req, resp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {


        }
    }


}
