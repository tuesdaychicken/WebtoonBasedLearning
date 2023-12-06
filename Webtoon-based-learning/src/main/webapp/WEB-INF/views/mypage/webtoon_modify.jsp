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
	<%@ include file="../includes/header.jsp"%>

	<br>
	<br>

<form action="/mypage/registration" method="post" class="webtoonForm">
	<input type="hidden" name="webtoon_NUM" value="${webtoon.webtoon_NUM}">

	<span>작품 제목</span>
	<input type="text" name="webtoon_TITLE" value="${webtoon.webtoon_TITLE}">

	<br>
	<br> 이용가
	<select name="webtoon_AGE" >
		<option>--선택--</option>
		<option>전체이용가</option>
		<option>12세 이용가</option>
		<option>15세 이용가</option>
		<option>18세 이용가</option>
	</select>

	<br>
	<br> 줄거리
	<textarea name="webtoon_INFO">${webtoon.webtoon_INFO}</textarea>

	<br>
	<br> 
	대표 이미지 등록
	<input type="text" name="webtoon_COVER" value="${webtoon.webtoon_COVER}">

	<br>
	<br> 
	소개 이미지 등록
	<input type="text" name="webtoon_INTRD_COVER" value="${webtoon.webtoon_INTRD_COVER }">
	
	<br>
	<br> 
	
	<div>
		<input type="button" value="웹툰 올리기" class="goRegist" onclick="location.href='/naver/'">
	</div>

</form>

</body>


<script type="text/javascript" src="/resources/js/mypage/webtoon_modify.js"></script> 
</html>