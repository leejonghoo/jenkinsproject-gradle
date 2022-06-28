<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
<style type="text/css">
	a {text-decoration: none; color:black;}
	ul {padding: 20px;}
	ul li {display: inline; padding: 15px;}
</style>
</head>
<body>
	<div align="center">
		<h1>CARE LAB</h1>
	</div>
	<c:url var="root" value="/" />
	<div align="center">
		<hr>
		<ul>
			<li><a href="${root }">HOME</a></li>
			<c:choose>
				<c:when test="${empty sessionScope.member.id }">
					<li><a href="login">Login</a></li>
					<li><a href="register">Register</a></li>
					<li><a href="customer">Customer</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="logout">Logout</a></li>
				</c:otherwise>
			</c:choose>
			
			<c:if test="${not empty sessionScope.member.id }">
				<li><a href="members">Members</a></li>
				<li><a href="update">update</a></li>
			</c:if>
		</ul>
		<hr>
	</div>
</body>
</html>






