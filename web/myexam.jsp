<%-- 
    Document   : myexam
    Created on : Feb 1, 2024, 8:31:40 AM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="add" method="post">
            Code: <input type="text" name="code" required><br/>
            Name: <input type="text" name="name" required><br/>
            Number of carriages: <input type="number" name="carriages" required><br/>
            <input type="submit" value="ADD">
        </form>
        <c:set var="list" value="${sessionScope.list}"/>
        <c:if test="${list.size() >= 0}">
            List of Trains: <br/>
            <table border="1">
                <tr>
                    <th>Code</th>
                    <th>Name</th>
                    <th>Number of carriages</th>
                </tr>
                <c:forEach items="${list}" var="s">
                    <tr>
                        <td>${s.code}</td>
                        <td>${s.name}</td>
                        <td>${s.carriages}</td>
                    </tr> 
                </c:forEach>

            </table>
        </c:if>

    </body>
</html>
