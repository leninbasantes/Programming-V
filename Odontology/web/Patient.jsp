<%-- 
    Document   : Patient
    Created on : 28-may-2021, 17:13:31
    Author     : Lenin Basantes The Noders ESPE-DCCO
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reading Patient JSP</title>
    </head>
    <body>
        <%
            Connection connect = null;
            Statement sqlStatement = null;

            try {
              Class.forName("com.mysql.jdbc.Driver");

                connect = DriverManager.getConnection("jdbc:mysql://localhost:3309/odontology" + "?user=root&password=12345678");

                sqlStatement = connect.createStatement();
                String sql = "SELECT * FROM employee";

                ResultSet rec = sqlStatement.executeQuery(sql);
        %>
        <table width="800" border="1">
            <tr>
                <th width="91"><div align="center">ID Patient</div></th>
                <th width="91"><div align="center">First Name</div></th>
                <th width="91"><div align="center">Last Name</div></th>
                <th width="91"><div align="center">Id Number</div></th>
                <th width="91"><div align="center">Phone Number</div></th>
                <th width="91"><div align="center">Direction</div></th>
                <th width="91"><div align="center">Single</div></th>
                <th width="91"><div align="center">Married</div></th>
                <th width="91"><div align="center">Widower</div></th>
            </tr>
            
            <%while ((rec != null) && (rec.next())) {%>
            <tr>
                <td><div align="center"><%=rec.getString("idEmployee")%></div></td>
                <td><div align="center"><%=rec.getString("firstName")%></div></td>
                <td><div align="center"><%=rec.getString("lastName")%></div></td>
                <td><div align="center"><%=rec.getString("idNumber")%></div></td>
                <td><div align="center"><%=rec.getString("phoneNumber")%></div></td>
                <td><div align="center"><%=rec.getString("direction")%></div></td>
                <td><div align="center"><%=rec.getString("single")%></div></td>
                <td><div align="center"><%=rec.getString("married")%></div></td>
                <td><div align="center"><%=rec.getString("widower")%></div></td>

            </tr>
            <%}%>
            
        </table>
        <%
            } catch (Exception e) {
                out.println(e.getMessage());
                out.println("Stack in the catch -> " + e.toString());
                e.printStackTrace();
            }
            try {
                if (sqlStatement != null) {
                    sqlStatement.close();
                }
            } catch (SQLException e) {
                out.println(e.getMessage());
                e.printStackTrace();
            }
        %>
    </body>
</html>
