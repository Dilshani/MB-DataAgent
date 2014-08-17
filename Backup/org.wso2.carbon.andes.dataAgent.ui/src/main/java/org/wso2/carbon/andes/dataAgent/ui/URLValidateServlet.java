package org.wso2.carbon.andes.dataAgent.ui;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by nipuna on 7/25/14.
 */
public class URLValidateServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException {



        String ip=req.getParameter("ip");
        String port_string=req.getParameter("port");

       int port=Integer.valueOf(port_string);

        DataAgentClient client;
        boolean validateResponse;
        try {
            client = DataAgentClient.getDataAgentClient();
            validateResponse=client.IPValidator(ip,port);
            resp.getWriter().print(String.valueOf(validateResponse));
        } catch (Exception e) {

        }


    }


}
