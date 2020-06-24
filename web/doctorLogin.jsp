<%-- 
    Document   : doctorLogin
    Created on : 13-Apr-2020, 8:27:53 PM
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
        <h1>Doctor Login</h1>
        <form method="post" action="DocLogin">
        Username:<input type="text" name="username" /><br/>
        Password:<input type="password" name="password" /><br/>
        <input type="submit" value="login" />
        </form>
        <br/>
        <a href="doctorRegister.jsp">Doctor Registration</a><br>
        <a href="adregister.jsp">Admin Registration</a>
    </body>
</html>
