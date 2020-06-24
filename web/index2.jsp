<%-- 
    Document   : index2
    Created on : 8-Apr-2020, 1:50:52 PM
    Author     : maham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Humber Hospital Management System</title>
    </head>
    <body>
        <h1>Add Doctor</h1>
        <form action="AddDoctor" method="post">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="email" name="email"/></td>
                </tr>
                <tr>
                    <td>Office:</td>
                    <td><input type="text" name="office"/></td>
                </tr>
                <tr>
                    <td>Phone:</td>
                    <td><input type="text" name="phone"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Add Doctor"/>
                    </td>
                </tr>
            </table>
        </form>
        <br/>
        <a href="ViewDoctor">View All Doctor</a><br/>
        <a href="index.jsp">Add Patient</a><br/>
        <a href="adlogin.jsp">Log Out</a>
    </body>
</html>
