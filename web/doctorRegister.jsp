<%-- 
    Document   : doctorRegister
    Created on : 13-Apr-2020, 8:28:12 PM
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
        <h1>Doctor Registration!</h1>
        <form method="post" action="DocRegistration">
        Name:<input type="text" name="name" /><br/>
        Username:<input type="text" name="username" /><br/>
        Password:<input type="password" name="password" /><br/>
        <input type="submit" value="Register" />
        </form>
        <br/>
        <a href="doctorLogin.jsp">Doctor Login</a><br>
        <a href="adlogin.jsp">Admin Login</a>
    </body>
</html>
