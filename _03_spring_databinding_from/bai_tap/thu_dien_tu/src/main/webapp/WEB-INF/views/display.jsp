<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/27/2021
  Time: 5:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>Language: ${email.language}</div>
<div>Page size: ${email.pageSize}</div>
<div>Spam Filter: ${email.spamFilter}</div>
<div>Signature: ${email.signature}</div>
<a href="/edit">
    <button>Edit</button>
</a>
</body>
</html>
