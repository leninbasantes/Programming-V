<%-- 
    Document   : serverInformation
    Created on : 28-may-2021, 12:55:53
    Author     : Lenin Basantes The Noders ESPE-DCCO
--%>

<%@page import="ec.edu.espe.controller.PatientController"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@page import="java.util.Map" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h2>HTTP Request Headers</h2>
        <hr>
        <table border = "1">
            <tr bgcolor = "#949494">
                <th>Header Key</th>
                <th>Header Value</th>
            </tr>
            <tr>
                <%
                    PatientController patientController = new PatientController();
                    Map map = patientController.getHeadersInfo(request);

                    Iterator<Integer> itrk = map.keySet().iterator();
                    Iterator<String> itrva = map.values().iterator();
                    while (itrk.hasNext()) {

                        out.println("<tr>");
                        out.println("<td>");
                        out.println(itrk.next());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(itrva.next());
                        out.println("</td>");
                        out.println("</tr>");
                    }
                %>
        </table>
    </body>
</html>