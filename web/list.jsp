<%-- 
    Document   : list
    Created on : Feb 1, 2024, 9:07:42 AM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function doDelete(id) {
                if (confirm("are u sure to delete suppliers with id = " + id)) {
                    window.location = "delete?id=" + id;
                }
            }
        </script>
    </head>
    <body>
        <form action="show">
            Supplier filter:<br/>
            Supplier name: <input type="text" name="name"><input type="submit" value="Filter by name:"><br/>
            Year of birth <input type="int" name="dob"><input type="submit" value="Filter by year:"><br/>
        </form>
        <br/><br/><br/>
        List of Suppliers:
        <br/><br/>
        <table border="1">
            <tr>
                <th>Code</th>
                <th>Name</th>
                <th>Date of birth</th>
                <th>Gender</th>
                <th>Address</th>    
                <th></th>
            </tr>
            <c:forEach items="${requestScope.list}" var="s">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.name}</td>
                    <td>${s.date}</td>
                    <td>${s.gender}</td>
                    <td>${s.address}</td>
                    <td><a href="#" onclick="doDelete('${s.id}')">Delete</a> &nbsp;&nbsp;&nbsp;&nbsp;
                    </td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
