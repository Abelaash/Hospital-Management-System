<%-- 
    Document   : Final Project Question 3.
    Created on : Apr 10, 2020, 2:56:35 AM
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
                background-image: url("resources/frontpage.jpeg");

                /* Add the blur effect */
                filter: blur(5px);
                -webkit-filter: blur(5px);

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
                font-weight: bold;
                border: 3px solid #f1f1f1;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                z-index: 2;
                width: 80%;
                padding: 20px;
                text-align: center;
            }
            
            table {
                width:100%;

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
                display: inline-block;
                font-size: 12px;
                margin: 4px 2px;
                cursor: pointer;
            }

        </style>
    </head>
    <body>
        <a href="adregister.jsp">Admin Registration</a>
        <a href="adlogin.jsp">Admin Login</a>
        <div class="bg-image"></div>   
        <div class="bg-text">
            <h2 style="text-align : center"> Hospitals </h2>

            <form action="HospitalServlet">
                <table id="t01">
                    <tr>
                        <th colspan="2">Name</th>
                    </tr>
                    <tr>
                        <td>Sunnybrook Health Sciences Centre</td>
                        <td><button class="button" name="hospital" value="1"> Visit </button></td>
                    </tr>
                    <tr>
                        <td>Trillium Health Partners - Credit Valley Hospital</td>
                        <td><button class="button" name="hospital" value="2"> Visit </button></td>
                    </tr>
                    <tr>
                        <td>Trillium Health Partners - Mississauga Hospital</td>
                        <td><button class="button" name="hospital" value="3"> Visit </button></td>
                    </tr>
                    <tr>
                        <td>Milton District Hospital</td>
                        <td><button class="button" name="hospital" value="4"> Visit </button></td>
                    </tr>
                </table>
            </form>
        </div>
        
    </body>
</html>
