<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>CreateSuccess</title>
</head>
<c:set var="user" value="${user}"/>
<body>
    恭喜！用户${user.username}创建成功！
</body>
</html>

