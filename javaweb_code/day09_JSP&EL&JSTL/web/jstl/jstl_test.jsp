<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="cn.xulei.domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
    <%
        List list = new ArrayList();
        list.add(new User("张三",20,new Date()));
        list.add(new User("李四",30,new Date()));
        list.add(new User("王五",40,new Date()));
        request.setAttribute("list",list);
    %>

    <table border="1px" width="500" align="center">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>生日</th>
        </tr>
        <c:forEach items="${list}" var="user" varStatus="s">

            <c:if test="${s.count % 2 == 0}">
                <tr bgcolor="red">
                    <td>${s.count}</td>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                    <td>${user.bitStr}</td>
                </tr>
            </c:if>

            <c:if test="${s.count % 2 != 0}">
                <tr bgcolor="green">
                    <td>${s.count}</td>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                    <td>${user.bitStr}</td>
                </tr>
            </c:if>

        </c:forEach>
    </table>
</body>
</html>
