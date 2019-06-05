<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中数据</title>
</head>
<body>
    <%
        request.setAttribute("name","张三");
        request.setAttribute("age",20);

    %>

    ${requestScope.name}
    ${requestScope.age}<br>
    ${name}
    ${age}
</body>
</html>
