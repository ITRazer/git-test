<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script>
        window.onload = function(){
            document.getElementById("yzm").onclick = function () {
                this.src = "/day08/checkCodeServlet?time="+new Date().getTime();
            }
        }
    </script>
    <style>
        div{
            color: red;
        }
    </style>
</head>
<body>
   <form action="${pageContext.request.contextPath}/loginServlet" method="post">
       <table>
           <tr>
               <td>用户名:</td>
               <td><input type="text" name="username"></td>
           </tr>
           <tr>
               <td>密码:</td>
               <td><input type="password" name="password"></td>
           </tr>
           <tr>
               <td>验证码:</td>
               <td><input type="text" name="checkcode"></td>
           </tr>
           <tr>
                <td colspan="2"><img id="yzm" src="/day08/checkCodeServlet"></td>
           </tr>
           <tr>
               <td colspan="2"><input type="submit" value="登录"></td>
           </tr>
       </table>
   </form>

 <%--   <div><%= request.getAttribute("cc_error") == null ? "" : request.getAttribute("cc_error")%></div>
    <div><%= request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error")%></div>--%>

    ${requestScope.cc_error}
    ${requestScope.login_error}
</body>
</html>
