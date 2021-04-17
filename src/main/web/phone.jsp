<%--
  Created by IntelliJ IDEA.
  User: anhtran
  Date: 4/1/21
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<div class="container">
    <div class="row">
        <h2 class="col-8 offset-2 text-center font-weight-bold my-3">Create New Phone</h2>
        <a class="col-2 btn btn-primary align-self-center my-3" href="${pageContext.request.contextPath}/">Back</a>
        <form class="col-12" action="${pageContext.request.contextPath}/phone" method="post">
            <div class="form-group">
                <label>Name :</label>
                <input class="form-control" type="text" name="name">
            </div>

            <div class="form-group">
                <label>Brand :</label>
                <input class="form-control" type="text" name="brand">
            </div>
            <div class="form-group">
                <label>Price :</label>
                <input class="form-control" type="text" name="price">
            </div>
            <div class="form-group">
                <label>Description :</label>
                <input class="form-control" type="text" name="description">
            </div>

            <button type="submit" class="btn btn-primary">Create</button>
        </form>
    </div>
</div>

</body>
</html>
