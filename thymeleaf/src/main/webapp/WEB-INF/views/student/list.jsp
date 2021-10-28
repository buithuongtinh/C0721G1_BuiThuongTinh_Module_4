<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KILL YOU
  Date: 10/27/2021
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<strong style="color: green">${successMg}</strong>

<table class="table" border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Gender</th>
        <th>Language</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${studentList}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>
                    <c:choose>
                        <c:when test="${student.gender == 1}">Male</c:when>
                        <c:when test="${student.gender == 0}">FeMale</c:when>
                        <c:otherwise>LGBT</c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:forEach items="${student.languages}" var="lang">
                        <span>${lang}</span>
                    </c:forEach>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
