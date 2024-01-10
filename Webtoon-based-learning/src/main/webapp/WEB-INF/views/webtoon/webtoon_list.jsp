<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../includes/header.jsp" %>


<c:forEach var="webtoon" items="${webtoonVO}">
	
	<br>
	<br>
	<a href="/admin/webtoonModify?webtoonNum=${webtoon.webtoonNum}">웹툰수정</a>
	
	<br>
	<br>
	<a href="/admin/webtoonRemove?webtoonNum=${webtoon.webtoonNum}">웹툰삭제</a>
	<br>
	<br>
	
	<a href="/admin/episode?webtoonNum=${webtoon.webtoonNum}">에피소드 등록</a>
	<br>
	<br>
	<br>
	<br>
	
	제목 : ${webtoon.webtoonTitle}
	<br>
	<br>
	이용가 : ${webtoon.webtoonAge}
	<br>
	<br>
	소개 : ${webtoon.webtoonInfo}
	<br>
	<br>
		<br>
		<br>
</c:forEach>



<c:forEach var="epi" items="${episode}">
	
	에피소드 제목 : <a href="/webtoon/detail?webtoon_NUM=${epi.webtoon_NUM}&episode_NUM=${epi.episode_NUM}">${epi.episode_TITLE}</a>
	<br>
	<br>
</c:forEach>

</body>
</html>