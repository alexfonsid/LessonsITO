<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    Hello from jsp
    <br>
    <%= "Short syntax"%>
    <br>
    <%
        int x = 10;
        int y = 7;
        out.println(x+y);
    %>
    <br>
    <table border="1">
        <tr>
            <td>долбоящер</td>
            <td>строка1 ячейка2</td>
            <td>строка1 ячейка3</td>
        </tr>
        <tr>
            <td>строка2 ячейка1</td>
            <td>строка2 ячейка2</td>
            <td>строка2 ячейка3</td>
        </tr>
        <tr>
            <td>строка3 ячейка1</td>
            <td>строка3 ячейка2</td>
            <td>строка3 ячейка3</td>
        </tr>
    </table>
</body>
</html>