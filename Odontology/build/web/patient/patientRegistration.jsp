<%-- 
    Document   : patientRegistration
    Created on : 26-may-2021, 13:19:40
    Author     : Lenin Basantes The Noders ESPE-DCCO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Registration</title>
    </head>
    <body>
        <h1>PATIENT REGISTRATION FORM, FROM JSP</h1>
        <form action="savePatient.jsp" method="POST">
            <table style="with: 50%">
                <tr>
                    <td>First Name </td>
                    <td><input type="text" name="firstName"/></td>
                </tr>
                
                <tr>
                    <td>Last Name </td>
                    <td><input type="text" name="lastName"/></td>
                </tr>
                
                <tr>
                    <td>ID Number </td>
                    <td><input type="numer" name="idNumber"/></td>
                </tr>
                
                <tr>
                    <td>Phone Number </td>
                    <td><input type="number" name="phone"/></td>
                </tr>
                
                <tr>
                    <td>Direction </td>
                    <td><input type="text" name="direction"/></td>
                </tr>
                
                <tr>
                    <td>Civil Status</td>
                    <td>
                        <input type="checkbox" name="single" checked="checked"/>Single<br>
                        <input type="checkbox" name="married"/>Married<br>
                        <input type="checkbox" name="windower" checked="checked"/>Widower<br>
                       
                    </td>
                </tr>
            </table>
            
            <input type="submit" value="Save"/>
            <input type="reset" value="Empty Fields"/>
        </form>
    </body>
</html>
