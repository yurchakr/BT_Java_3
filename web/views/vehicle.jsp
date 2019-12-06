<%@ page import="java.util.List" %>
<%@ page import="by.bsuir.autobase.entity.Vehicle" %><%--
  Created by IntelliJ IDEA.
  User: Aleksey
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
    <h1>Super app!</h1>
</div>

<div>
    <div>
        <div>
            <h2>Users</h2>
        </div>
        <%
            List<Vehicle> vehicles = (List<Vehicle>) request.getAttribute("vehicleList");

            if (vehicles != null && !vehicles.isEmpty()) {
                out.println("<ui>");
                for (Vehicle veh : vehicles) {
                    out.println("<li>" + veh.getMake() + "</li>");
                }
                out.println("</ui>");
            } else out.println("<p>There are no vehicles yet!</p>");
        %>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
