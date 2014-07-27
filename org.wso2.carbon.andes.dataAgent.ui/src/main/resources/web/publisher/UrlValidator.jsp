<%@ page language="java" contentType="application/json; charset=UTF-8"
         pageEncoding="UTF-8"%>


    <%

        String message=(String)request.getParameter("fname");
      //  response.setContentType("got");
        response.getWriter().write("Hello " + message + "!");



    %>
