<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 3/20/2024
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Đy là trang home</h1>
<table>
<c:forEach items="${list}" var="item">
    <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.height} m</td>
        <td>${item.weight} kg</td>
        <td><fmt:formatDate value="${item.birthday}" pattern="dd/MM/yyyy"/></td>
        <td>${item.price}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
