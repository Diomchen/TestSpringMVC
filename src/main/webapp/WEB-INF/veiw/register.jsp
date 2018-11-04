<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Register</title>
    </head>
    <body>
        <form action="<c:url  value="/user.html"/>" method="post">
            Username: <input type="text" name="username"/><br>
            Password: <input type="password" name="password"/><br>
            Register: <input type="submit" value="Register"/><br>
        </form>
    </body>
</html>
