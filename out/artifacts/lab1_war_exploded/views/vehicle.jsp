<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 06.12.2019
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vehicles</title>
</head>

<body>

<div>
    <div>
        <table border="1">
            <caption>Vehicle info</caption>
            <tr>
                <th>Make</th>
                <th>Model</th>
                <th>Price</th>
                <th>Fuel consumption</th>
                <th>Power</th>
                <th>Year</th>
                <th>Fuel type</th>
            </tr>
            <c:forEach var="vehicle" items="${vehicleList}">
                <tr>
                    <td><c:out value="${vehicle.getMake()}" /></td>
                    <td><c:out value="${vehicle.getModel()}" /></td>
                    <td><c:out value="${vehicle.getPrice()}" /></td>
                    <td><c:out value="${vehicle.getFuelConsumption()}" /></td>
                    <td><c:out value="${vehicle.getPower()}" /></td>
                    <td><c:out value="${vehicle.getYear()}" /></td>
                    <td><c:out value="${vehicle.getFuelType().toString()}" /></td>
                </tr>
            </c:forEach>
        </table>

    </div>
</div>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
