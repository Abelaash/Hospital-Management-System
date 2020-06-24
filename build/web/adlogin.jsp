<%-- 
    Document   : adlogin
    Created on : 8-Apr-2020, 2:08:48 PM
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
        <h1>Admin Login Page</h1>
        <form action="Login" method="post">
            Enter username :<input type="text" name="username"><br>
            Enter password :<input type="password" name="password"><br>
            <input type="submit" value="Login">
        </form>
        <br>
        <a href="adregister.jsp">Admin Register Page</a><br>
        <a href="doctorRegister.jsp">Doctor Register Page</a>
    </body>
</html>
