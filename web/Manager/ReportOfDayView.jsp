<%-- 
    Document   : newjspReportOfDayView
    Created on : Nov 4, 2021, 8:26:57 AM
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
        <label for="birthday">Date start:</label>
        <input type="date" id="birthday" name="birthday"></br></br>
        <label for="birthday">Date end:</label>
        <input type="date" id="birthday" name="birthday"></br></br>
        <input type="submit" value="View Report">

        <table style="width:50%">
            <tr>
                <th>Name Date</th>
                <th>Sum of Ticket</th>
                <th>Income</th>
            </tr>
            <tr>
                <td>Monday</td>
                <td>8600 tickets</td>
                <td>196.000.000 vnđ</td>
            </tr>
            <tr>
                <td>Tuseday</td>
                <td>6500 tickets</td>
                <td>110.000.000 vnđ</td>
            </tr>
        </table>
    </body>
</html>
