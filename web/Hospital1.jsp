<%-- 
    Document   : Final Project Question 3.
    Created on : Apr 12, 2020, 2:56:35 AM
    Author     : Shahroz Alam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hospital</title>

        <style>
            body, html {
                height: 100%;
                margin: 0;
                font-family: Arial, Helvetica, sans-serif;
            }

            .bg-image {
                /* The image used */
                background-image: url("resources/hospital1.png");

                /* Add the blur effect */
                filter: blur(8px);
                -webkit-filter: blur(8px);

                /* Full height */
                height: 100%; 

                /* Center and scale the image nicely */
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
            }

            /* Position text in the middle of the page/image */
            .bg-text {
                color: black;
                border: 3px solid #f1f1f1;
                position: absolute;
                top: 63%;
                left: 50%;
                transform: translate(-50%, -50%);
                z-index: 2;
                width: 80%;
                padding: 20px;
                text-align: center;
            }

            table {
                width:100%;
                margin-bottom: 20px;
            }
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 15px;
                text-align: left;
            }
            td {
                border: 0px;
            }
            table#t01 tr:nth-child(even) {
                background-color: #eee;
            }
            table#t01 tr:nth-child(odd) {
                background-color: #fff;
            }
            table#t01 th {
                background-color: rgb(0, 51, 204);
                color: white;
            }
            .button {
                background-color: rgb(0, 51, 204); /* Blue */
                border: none;
                color: white;
                padding: 10px 32px;
                text-align: center;
                text-decoration: none;
                font-size: 12px;
                margin: 4px 2px;
                cursor: pointer;
            }

        </style>

    </head>
    <body>
        <a href="index_1.jsp">Home Page</a>
        <div class="bg-image"></div>
        <div class="bg-text">


            <table id="t01">
                <tr>
                    <th colspan="2" style="text-align: center">Sunnybrook Health Sciences Centre</th>
                </tr>

            </table>

            <table id="t01">
                <tr> 
                    <th> Location </th> 
                </tr>
                <tr>
                    <td>2075 Bayview Ave, Toronto, ON M4N 3M5</td>
                </tr>
            </table>

            <table id="t01">
                <tr> 
                    <th> Services </th> 
                </tr>

                <tr>
                    <td>Emergency Room </td>
                </tr>
                <tr>
                    <td>General and Specialty Surgical</td>
                </tr>
                <tr>
                    <td>X-Ray/Radiology</td>
                </tr>
                <tr>
                    <td>Genetic Counseling and Testing</td>
                </tr>
            </table>    

            <table id="t01">
                <tr> 
                    <th> Doctors </th> 
                </tr>

                <tr>
                    <td>Vivien Thomas</td>
                </tr>
                <tr>
                    <td>Andrew Taylor Still</td>
                </tr>
                <tr>
                    <td>Joseph Lister</td>
                </tr>
                <tr>
                    <td>Elizabeth Blackwell</td>
                </tr>
            </table>    

        </div>

    </body>
</html>
