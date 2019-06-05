<%@ page import="cn.xulei.domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取数据</title>
</head>
<body>
    <%
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setBirthday(new Date());
        request.setAttribute("user",user);

        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add(user);
        request.setAttribute("list",list);

        Map map = new HashMap();
        map.put("sname","lisi");
        map.put("gender","male");
        map.put("user",user);
        request.setAttribute("map",map);
    %>
<h3>el获取对象中的值</h3>
  <%--  通过的是对象的属性来获取
        setter和getter方法，去掉set和get，将剩余部分，首字母变小写
        setName --> Name --> name--%>
    ${requestScope.user.name}
    ${requestScope.user.age}
    ${requestScope.user.bitStr}
<h3>el获取List集合元素</h3>
    ${list}<br>
    ${list[0]}<br>
    ${list[1]}<br>
    ${list[2].name}
<h3>el获取Map集合</h3>
    ${map.gender}<br>
    ${map["gender"]}<br>
    ${map.user.age}
</body>
</html>
