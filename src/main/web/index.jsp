<%--
  Created by IntelliJ IDEA.
  User: anhtran
  Date: 4/3/21
  Time: 6:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Phone</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Brand</th>
        <th>Price</th>
        <th>Description</th>
    </tr>
    <c:forEach var="p" items="${requestScope.phone}">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.brand}</td>
            <td>${p.price}</td>
            <td>${p.description}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>

