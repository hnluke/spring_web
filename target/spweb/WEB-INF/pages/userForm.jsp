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
<%--    <mvc:form modelAttribute="user" action="result.mvc" method="post">--%>
    <mvc:form modelAttribute="user" action="result.mvc" method="post" enctype="multipart/form-data">
        <table>
            <tr>
                <td><mvc:label path="userName">Name</mvc:label></td>
                <td><mvc:input path="userName" id="userName" autocomplete="off" cssErrorClass="formFieldError"/></td>
                <td><mvc:errors path="userName"></mvc:errors></td>
            </tr>
            <tr>
                <td>Choose File</td>
                <td><mvc:input type="file" path="file" /></td>
            </tr>
            <tr>
                <td><mvc:label path="userLastName">LastName</mvc:label></td>
                <td><mvc:input path="userLastName" autocomplete="off" /></td>
            </tr>
            <tr>
                <td><mvc:label path="userCredit">Credit Number</mvc:label></td>
                <td><mvc:input path="userCredit" autocomplete="off"
                cssErrorClass="formFieldError"/></td>
                <td><mvc:errors path="userCredit"></mvc:errors></td>
            </tr>
            <tr>
                <td><mvc:label path="userPwd">Password</mvc:label></td>
                <td><mvc:password path="userPwd" cssErrorClass="formFieldError"/></td>
                <td><mvc:errors path="userPwd"></mvc:errors></td>
            </tr>
            <tr>
                <td><mvc:label path="userDetail">Detail</mvc:label></td>
                <td><mvc:textarea path="userDetail" /></td>
            </tr>
            <tr>
                <td><mvc:label path="userBirthDay">Birth Date</mvc:label></td>
                <td><mvc:input path="userBirthDay" autocomplete="off" onclick="WdatePicker()"/></td>
            </tr>
            <tr>
                <td><mvc:label path="userEmail">Email</mvc:label></td>
                <td><mvc:input path="userEmail" autocomplete="off"
                               cssErrorClass="formFieldError"/></td>
                <td><mvc:errors path="userEmail"></mvc:errors></td>
            </tr>
            <tr>
                <td><mvc:label path="userGender">Gender</mvc:label></td>
                <td><mvc:radiobuttons path="userGender" items="${genders}"/></td>
            </tr>
            <tr>
                <td><mvc:label path="userCountry">Country</mvc:label></td>
                <td><mvc:select path="userCountry" items="${countries}"/></td>
            </tr>
            <tr>
                <td><mvc:label path="userSmoking">Non Smoking</mvc:label></td>
                <td><mvc:checkbox path="userSmoking"/></td>

            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value = "Submit"/>
                </td>
            </tr>

        </table>


    </mvc:form>

</body>
</html>
