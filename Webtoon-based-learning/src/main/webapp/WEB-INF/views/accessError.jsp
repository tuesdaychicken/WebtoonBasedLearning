<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>에러에러 에러 페이지</h1>
	
	<h2><c:out value="${SPRING_SECURITY_403_EXCEPTION.getMessage()}"></c:out></h2>
	
	<h3><c:out value="${msg}"></c:out></h3>
	
	<!-- 여기서 로그인에 실패하였습니다 라는 안내문구 나오고 홈 화면으로 이동하게 끔 -->
</body>
</html>