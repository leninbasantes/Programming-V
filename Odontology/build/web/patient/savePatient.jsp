<%-- 
    Document   : savePatient
    Created on : 26-may-2021, 14:08:29
    Author     : Lenin Basantes The Noders ESPE-DCCO
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saving Patient</title>
    </head>
    <body>
        <h1>Saving Patient!</h1>
        
           <%
            Connection connect = null;
            Statement sqlStatement = null;

            try {
              Class.forName("com.mysql.jdbc.Driver");

                connect = DriverManager.getConnection("jdbc:mysql://localhost:3309/odontology" + "?user=root&password=12345678");
                   String consult = "INSERT INTO employee (firstName,lastName,idNumber,phoneNumber,direction,single,married,widower) VALUES (?,?,?,?,?,?,?,?)";
                
                   String firstName = request.getParameter("firstName") ;
               String lastName =request.getParameter("lastName");
               String idNumber = request.getParameter("idNumber");
               String phone =request.getParameter("phone");
               String direction= request.getParameter("direction") ;
               String single= request.getParameter("single");
               String married =request.getParameter("married");
               String windower = request.getParameter("windower") ;
                   
                   
                   if(single==null){
                       single="null";
                   }
                   if(married==null){
                       married="null";
                   }
                   if(windower==null){
                       windower="null";
                   }
                   
             PreparedStatement sentencia= connect.prepareStatement(consult);
             
                sentencia.setString(1, firstName);
                sentencia.setString(2, lastName);
                sentencia.setString(3, idNumber);
                sentencia.setString(4, phone);
                sentencia.setString(5, direction);
                sentencia.setString(6, single);
                sentencia.setString(7, married);
                sentencia.setString(8, windower);
              
                sentencia.executeUpdate();
                
            } catch (Exception e) {
                out.println(e.getMessage());
                out.println("Stack in the catch -> " + e.toString());
                e.printStackTrace();
            }
            

        %>
        
        We are using de method ->
        <%= request.getMethod() %>
        
        <%
         String method = request.getMethod();
         out.println(method);
        %>
        
       <%-- <ul>
            <li> <p><b> First Name: </b>
                        <%= request.getParameter("firstName") %>
                </p>
            </li>
             <li> <p><b> Last Name: </b>
                        <%= request.getParameter("lastName") %>
                </p>
            </li>
             <li> <p><b> Id Number: </b>
                        <%= request.getParameter("idNumber") %>
                </p>
            </li>
             <li> <p><b> Phone: </b>
                        <%= request.getParameter("phone") %>
                </p>
            </li>
             <li> <p><b> Direction: </b>
                        <%= request.getParameter("direction") %>
                </p>
            </li>
            <li> <p><b> Single: </b>
                        <%= request.getParameter("single") %>
                </p>
            </li>
             <li> <p><b> Married: </b>
                        <%= request.getParameter("married") %>                       
                </p>
            </li>
             <li> <p><b> Windower: </b>
                        <%= request.getParameter("windower") %>
                </p>
            </li>     
        </ul>   
                
                <hr>
                <h2>HTTP param requests, i.e., every value in the form</h2>
                <table width="100%" border="1">
                    <tr bgcolor="#090909">
                        <th>Parameter Name</th>
                        <th>Parameter Value(s)</th>
                    </tr>
                    <%
                        Enumeration paramNames=request.getParameterNames();
                        while (paramNames.hasMoreElements()){
                            String paramName =(String) paramNames.nextElement();
                            out.println("<tr><td>"+paramName+"</td>\n");
                            String paramValue =request.getParameter(paramName);
                            out.println("<td>"+paramValue+"</td></tr>\n");
                        } 
                        %>
                </table>--%>
                
                <a href="../Patient.jsp">View Data</a>
    </body>
</html>
