<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<h1>Các gia vị đã chọn để đi kèm với món Sandwich.</h1>
<c:if test="${requestScope['condiment'] != null}">
        <c:forEach items='${requestScope["condiment"]}' var="choise">
            <h2><c:out value="${choise}"/></h2>
        </c:forEach>

</c:if>

</body>
</html>
