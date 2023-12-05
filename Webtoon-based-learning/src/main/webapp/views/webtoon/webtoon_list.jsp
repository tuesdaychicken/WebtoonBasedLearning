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



<br>
<br>
<a href="/mypage/webtoonModify?webtoon_NUM=${webtoon.webtoon_NUM}">웹툰수정</a>

<br>
<br>
<a href="/mypage/webtoonRemove?webtoon_NUM=${webtoon.webtoon_NUM}">웹툰삭제</a>
<br>
<br>

<a href="/webtoon/episode?webtoon_NUM=${webtoon.webtoon_NUM}"> <p>에피소드 등록</p> </a>
<br>
<br>
<br>
<br>


웹툰 제목 : ${webtoon.webtoon_TITLE}
<br>
<br>
이용가 : ${webtoon.webtoon_AGE}
<br>
<br>
소개 : ${webtoon.webtoon_INFO}
<br>
<br>

<c:forEach var="epi" items="${episode}">
	
	에피소드 제목 : <a href="/webtoon/detail?webtoon_NUM=${epi.webtoon_NUM}&episode_NUM=${epi.episode_NUM}">${epi.episode_TITLE}</a>
	<br>
	<br>
</c:forEach>

</body>
</html>