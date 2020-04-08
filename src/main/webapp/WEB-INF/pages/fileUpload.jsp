<%--
  Created by IntelliJ IDEA.
  User: Luke
  Date: 2020/4/7
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<html>
<head>
    <title>User register</title>
</head>
<body>
<h2>User Upload</h2>

<table>
    <tr>
        <td>Name</td>
        <td>${u.userName}</td>
    </tr>
    <tr>
        <td>Last name</td>
        <td>${u.userLastName}</td>
    </tr>
    <tr>
        <td>Password</td>
        <td>${u.userPwd}</td>
    </tr>
    <tr>
        <td>Credit Number</td>
        <td>${u.userCredit}</td>
    </tr>
    <tr>
        <td>File Length</td>
        <td>${fileLength}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${u.userEmail}</td>
    </tr>
    <tr>
        <td>Detail</td>
        <td>${u.userDetail}</td>
    </tr>
    <tr>
        <td>Birth Date</td>
        <td>${u.userBirthDay}</td>
    </tr>
    <tr>
        <td>Gender</td>
        <td>${u.userGender}</td>
    </tr>
    <tr>
        <td>Country</td>
        <td>${u.userCountry}</td>
    </tr>
    <tr>
        <td>Non-Smoking</td>
        <td>${u.userSmoking}</td>
    </tr>

</table>




</body>
</html>
