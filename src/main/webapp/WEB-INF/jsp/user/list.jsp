<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>User Management</h2>
<table border = "1">
<tr><th>ID</th><th>Username</th><th>Password</th></tr>
<c:forEach items="${users}" var="user">
<tr>
   <td>${user.id}</td>
   <td>${user.username}</td>
   <td>${user.password}</td>
</tr>
</c:forEach>
</table>
</body>
</html>