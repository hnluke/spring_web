<%--
  Created by IntelliJ IDEA.
  User: Luke
  Date: 2020/4/7
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Spring MVC Internationalization</title>
</head>
<body>
    Language:
    <a href="?lang=en_US">English</a> - <a href="?lang=tr_TR">Turkish</a>
    <h2>
            <%-- 加载这句出错，待解决 --%>
<%--        <spring:message code="welcome"/>--%>
    </h2>
    Locale: ${pageContext.response.locale}


</body>
</html>
