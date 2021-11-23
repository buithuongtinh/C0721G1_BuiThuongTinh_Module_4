<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: KILL YOU
  Date: 10/27/2021
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create Student</h1>
<form:form modelAttribute="student" action="/student/create" method="post">
    <table>
        <tr>
            <th>Id:</th>
            <td>
                <form:input path="id"/>
            </td>
        </tr>
        <tr>
            <th>Name:</th>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <th>Gender:</th>
            <td>
                <form:radiobutton path="gender" value="1" label="Male"/>
                <form:radiobutton path="gender" value="0" label="FeMale"/>
                <form:radiobutton path="gender" value="2" label="LGBT"/>
            </td>
        </tr>
        <tr>
            <th>Languages:</th>
            <td>
                <form:checkboxes path="languages" items="${languageList}"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">Create</button>
            </td>
        </tr>
    </table>

</form:form>
</body>
</html>
