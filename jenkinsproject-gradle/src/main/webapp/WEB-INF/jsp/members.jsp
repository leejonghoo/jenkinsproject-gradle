<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>members</title>
</head>
<body>
	<c:import url="/header" />
	
	<div align="center" >
		<table border=1 >
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>주소</th>
				<th>전화번호</th>
			</tr>
			<c:forEach var="member" items="${members }">
				<tr>
					<td>${member.id }</td>
					<td>${member.pw }</td>
					<td>${member.fullName }</td>
					<td>${member.addr }</td>
					<td>${member.tel }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<c:import url="/footer" />
</body>
</html>