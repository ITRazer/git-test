<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Random" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>choose标签</title>
</head>
<body>
   <%-- 1.域中存储数字
    2.使用choose标签取出数字    -- 相当于switch
    3.使用when标签做数字判断     -- case
    4.otherwise标签做其他情况的声明   -- default--%>

    <%
        List nums = Arrays.asList(1,2,3,4,5,6,7);

        request.setAttribute("nums",10);
    %>

    <c:choose>
        <c:when test="${nums == 1}">星期一</c:when>
        <c:when test="${nums == 2}">星期二</c:when>
        <c:when test="${nums == 3}">星期三</c:when>
        <c:when test="${nums == 4}">星期四</c:when>
        <c:when test="${nums == 5}">星期五</c:when>
        <c:when test="${nums == 6}">星期六</c:when>
        <c:when test="${nums == 7}">星期日</c:when>

        <c:otherwise>error</c:otherwise>
    </c:choose>

</body>
</html>
