<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 로그아웃 페이지는 딱히 필요없을거 같은데 함 따라해보자 -->
<h1>로그아웃 페이지</h1>

<form action="/customLogout" method="post">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
<button>로그아웃</button>
</form>

</body>
</html>