<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>xulei</title>
</head>
<body>
<%
    //1.获取所有cookie
    Cookie[] cookies = request.getCookies();
    boolean flag = false;//没有cookie为lasttime

    if (cookies != null && cookies.length>0){
        for (Cookie cookie : cookies){
            //1.获取cookie的名称
            String name = cookie.getName();
            //2.判断名称是否是lasttime
            if ("lastTime".equals(name))
            {
                //有cookie不是第一次访问
                flag = true;
                //设置Cookie的value
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

                String str_date = sdf.format(date);
                System.out.println("编码前:" + str_date);
                //URL编码
                str_date = URLEncoder.encode(str_date,"utf-8");
                System.out.println("编码后:" + str_date);
                cookie.setValue(str_date);
                //设置cookie的存活时间
                cookie.setMaxAge(60*60*24*30);
                response.addCookie(cookie);

                //响应数据
                //获取Cookie的value,时间
                String value = cookie.getValue();
                System.out.println("解码前:" + value);
                //URL解码
                value = URLDecoder.decode(value,"utf-8");
                System.out.println("解码后:" + value);
                %>
               <h1>欢迎回来，您上次的访问时间为:<%=value%></h1>
<%
                break;
            }
        }
    }
    if (cookies == null || cookies.length ==0||flag==false){
        //没有，第一次访问

        //设置Cookie的value
        //获取当前时间的字符串，重新设置Cookie的值，重新发送cookie
        Date date  = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str_date = sdf.format(date);
        System.out.println("编码前："+str_date);
        //URL编码
        str_date = URLEncoder.encode(str_date,"utf-8");
        System.out.println("编码后："+str_date);

        Cookie cookie = new Cookie("lastTime",str_date);
        //设置cookie的存活时间
        cookie.setMaxAge(60 * 60 * 24 * 30);//一个月
        response.addCookie(cookie);
%>
        <h1>您好，欢迎您首次访问</h1>
<%
    }
%>
</body>
</html>
