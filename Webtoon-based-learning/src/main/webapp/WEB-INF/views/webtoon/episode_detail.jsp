<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


에피소드 제목 : ${episode.episode_TITLE}


<br>
<br>
작가의 말 : ${episode.episode_TEXT}


<a href="/webtoon/episodeModify?webtoon_NUM=${episode.webtoon_NUM}&episode_NUM=${episode.episode_NUM}">수정</a>

<br>
<br>
<a href="/webtoon/episodeRemove?webtoon_NUM=${episode.webtoon_NUM}&episode_NUM=${episode.episode_NUM}">삭제</a>


</body>
</html>