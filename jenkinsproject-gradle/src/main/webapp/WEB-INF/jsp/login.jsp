<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<script src="js/check.js"></script>
</head>
<body>
	<c:import url="/header"/>
	
	<div align="center">
		<h1>로그인 페이지</h1>
			<form action="login" method="post" id="f">
			<table>
				<tr>
					<td>
						<input type="text" name="id" placeholder="아이디" id="id">
					</td>
					<td rowspan="2" >
						<input type="button" value="로그인" onclick="allCheck()" style="height:50px;">
					</td>
				</tr>
				<tr><td>
						<input type="password" name="pw" placeholder="비밀번호" id="pw">
				</td></tr>
			</table>
			</form>
	</div>
	<c:import url="/footer"/>
</body>
</html>

