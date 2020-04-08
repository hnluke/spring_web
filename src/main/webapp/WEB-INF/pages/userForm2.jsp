<%--
  Created by IntelliJ IDEA.
  User: Luke
  Date: 2020/4/7
  Time: 20:34
  To change this template use File | Settings | File Templates.
<%--
  Created by IntelliJ IDEA.
  User: Luke
  Date: 2020/4/7
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>User register</title>
    <style type="text/css">
        .formFieldError {
            background-color: #ff9e6a;
        }
    </style>
    <base href="<%=basePath%>">
    <script src="<%=basePath%>js/jquery-3.4.1.js"></script>
    <script src="<%=basePath%>My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript">

    </script>
</head>
<body>
<h2>User Registration</h2>
<form action="result.mvc" method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input name="userName" id="userName" autocomplete="off" /></td>
        </tr>
        <tr>
            <td>LastName</td>
            <td><input name="userLastName" autocomplete="off" /></td>
        </tr>
        <tr>
            <td>Credit Number</td>
            <td><input name="userCredit" autocomplete="off"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password"  name="userPwd"/></td>
        </tr>
        <tr>
            <td>Detail</td>
            <td><textarea rows="5", cols="30" ></textarea></td>

        </tr>
        <tr>
            <td>Birth Date</td>
            <td><input name="userBirthDay" autocomplete="off" onclick="WdatePicker()"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input name="userEmail" autocomplete="off"/></td>
        </tr>
<%--        <tr>--%>
<%--            <td><mvc:label path="userGender">Gender</mvc:label></td>--%>
<%--            <td><input type="raio"radiobuttons path="userGender" items="${genders}"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td><mvc:label path="userCountry">Country</mvc:label></td>--%>
<%--            <td><mvc:select path="userCountry" items="${countries}"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td><mvc:label path="userSmoking">Non Smoking</mvc:label></td>--%>
<%--            <td><mvc:checkbox path="userSmoking"/></td>--%>

<%--        </tr>--%>
        <tr>
            <td colspan="2">
                <input type="submit" value = "Submit"/>
            </td>
        </tr>

    </table>


</form>

</body>
</html>

