<%--
  Created by IntelliJ IDEA.
  User: Primary
  Date: 14.05.2021
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
    <h2>Create</h2>
    <form action="create" method="post">
        <p><input type="text" name="name"></p>
        <p><input type="submit" value="Отправить"></p>
    </form>
</body>
</html>
