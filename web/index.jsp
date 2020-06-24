<%-- 
    Document   : index
    Created on : 15-Apr-2020, 6:37:47 PM
    Author     : maham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Humber Hospital Management System</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Add Patient</h1>
        <form action="AddServlet" method="post">
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
                    <td>Address:</td>
                    <td><input type="text" name="address"/></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td><input type="text" name="city"/></td>
                </tr>
                <tr>
                    <td>Doctor Available:</td>
                    <td>  
                        <select name="doctorid" style="width:150px">  
                            <option>Charlie Parks</option>
                            <option>Patricia Hawkins</option>  
                            <option>Marc Williams</option>  
                            <option>Rosalee Loper</option>  
                        </select>  
                    </td>
                </tr>
                <tr>
                    <td>Reason for Visit:</td>
                    <td>  
                        <select name="type" style="width:150px">
                            <option>Common cold</option>
                            <option>Insomnia</option>
                            <option>Food poisoning</option>
                            <option>Coronavirus (COVID-19)</option>  
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Add Patient"/></td>
                </tr>
            </table>
        </form>
        <br/>
        <a href="ViewPatient">View All Patient</a><br>
        <a href="index2.jsp">Add Doctor</a><br/>
        <a href="adlogin.jsp">Log Out</a>
    </body>
</html>