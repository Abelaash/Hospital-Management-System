<%-- 
    Document   : adregister
    Created on : 8-Apr-2020, 2:09:05 PM
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
        <h1>Admin Registration Page</h1>
        <form action="Registration" method="post">
            <table style="with: 50%">
                <tr>
                    <td>Full Name:</td>
                    <td><input type="text" name="name" /></td>
                </tr>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" /></td>
                </tr>
            </table>
            <input type="submit" value="submit" name="Register">
            <a href="adlogin.jsp">Admin Login Page</a>
            <a href="doctorLogin.jsp">Doctor Login Page</a>
        </form>
    </body>
</html>
