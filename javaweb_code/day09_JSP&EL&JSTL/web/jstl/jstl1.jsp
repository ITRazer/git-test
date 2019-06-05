<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if标签</title>
</head>
<body>
    <%--c:if标签
            1.属性
                test 必须属性 接收boolean表达式
                    如果表达式为true，则显示if标签体内容
                    test属性一般结合el表达式
    --%>
    <c:if test="true">
        我是真...
    </c:if>
    <br>

    <%
        List list = new ArrayList();
        list.add("aaa");
        request.setAttribute("list",list);
    %>

    <c:if test="${not empty list}">
        遍历集合...
    </c:if>
</body>
</html>
