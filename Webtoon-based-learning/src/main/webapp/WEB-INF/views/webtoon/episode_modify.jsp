<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/resources/js/jquery/jquery-3.6.3.min.js"></script>
</head>
<body>

<form action="/webtoon/episodeModify" method="post" class="episodeForm" >
	<input type="hidden" name="webtoon_NUMObj" value="${episode.webtoon_NUM}">
	<input type="hidden" name="episode_NUM" value="${episode.episode_NUM}">


	<span>에피소드 제목</span>
	<input type="text" name="episode_TITLE" value="${episode.episode_TITLE}">

	<br>
	<br> 
	에피소드 표지 등록
	<input type="text" name="episode_COVER" value="${episode.episode_COVER}">

	<br>
	<br> 
	에피소드 등록
	<input type="text" name="episodeContent" value="${episode.EPISODECONTENT}">
	
	<br>
	<br> 
	작가의 말 등록
	<textarea name="episode_TEXT" >${episode.episode_TEXT}</textarea>
	
	<br>
	<br>

	<div>
		<input type="button" value="에피소드 수정하기" class="goRegist" onclick="location.href='/webtoon/list?webtoon_NUM=${episode.webtoon_NUM}'">
	</div>

</form>

</body>

<script type="text/javascript" src="/resources/js/webtoon/episode_modify.js"></script> 

</html>