<%-- 
    Document   : DetailReportView
    Created on : Nov 4, 2021, 8:27:11 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            table, th, td {
                border:1px solid black;
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Manager name: manager1</h1>
        <table style="width:50%">
            <tr>
                <th>Showtime</th>
                <th>Movie name</th>
                <th>Sum of Ticket</th>
                <th>Income</th>
            </tr>
            <tr>
                <th>7h-9h30 ngày 11/1/2021</th>
                <th>Doremon</th>
                <th>500 Tickets</th>
                <th>11.000.000 vnđ</th>
            </tr>
            <tr>
                <th>9h30-11h ngày 11/1/2021</th>
                <th>Doremon</th>
                <th>800 Tickets</th>
                <th>19.000.000 vnđ</th>
            </tr>
        </table>
        </br>
        <input type="submit" value="Return">
    </body>
</html>
