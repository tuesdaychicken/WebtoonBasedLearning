<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
<!-- 네이버 로그인 페이지로 바꿀것 -->
	<h1>로그인 페이지 입니둥</h1>
	<h2><c:out value="${error}"/></h2>
	<h2><c:out value="${loggout}" /> </h2>
	
	<form method="post" action="/login">
		<div>
			<input type="text" name="user_NAME" value="admin">
		</div>
		
		<div>
			<input type="password" name="password" value="admin">
		</div>
		
		<div>
			<input type="checkbox" name="remember-me"> Remember Me
		</div>
		
		<div>
			<input type="submit">
		</div>
		
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	
	</form>
	
</body>
</html>