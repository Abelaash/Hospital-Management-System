<%-- 
    Document   : search
    Created on : 8-Apr-2020, 2:29:31 PM
    Author     : maham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
      <title>Humber Hospital Management System</title>
  </head>
  <body>
      <h1>Search Patient</h1>
      <form action="Search" method="post">
      <table border="0" width="300" align="center">
        <tr>
            <td colspan=2 style="font-size:12pt;" align="center">
                
            </td>
        </tr>
        <tr>
            <td><b>City:</b></td>
            <td><input type="text" name="city" id="city"></td>
        </tr>        
        <tr>
            <td colspan=2 align="center">
                <input type="submit" name="submit" value="Search"></td>
        </tr>
      </table>
    </form>
      <br>
      <a href="doctorLogin.jsp">Log out</a>
  </body>
</html>
