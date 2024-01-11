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


	<span>작품 제목</span>
	<input type="text" id="webtoonTitle">

	<br>
	<br> 이용가
	<select id="webtoonAge">
		<option>--선택--</option>
		<option>전체이용가</option>
		<option>12세 이용가</option>
		<option>15세 이용가</option>
		<option>18세 이용가</option>
	</select>

	<br>
	<br> 작가
	<input type="text" id="">

	<br>
	<br>

	<span>장르</span>
	<input type="checkbox" class="genreType" value="일상"> 일상
	<input type="checkbox" class="genreType" value="개그"> 개그
	<input type="checkbox" class="genreType" value="판타지"> 판타지
	<input type="checkbox" class="genreType" value="액션"> 액션
	<input type="checkbox" class="genreType" value="드라마"> 드라마
	<input type="checkbox" class="genreType" value="순정"> 순정
	<input type="checkbox" class="genreType" value="감성"> 감성
	<input type="checkbox" class="genreType" value="스릴러"> 스릴러
	<input type="checkbox" class="genreType" value="무협/사극"> 무협/사극
	<input type="checkbox" class="genreType" value="스포츠"> 스포츠

	<br>
	<br> 
	요일
	<input type="radio" id="weekDay" value="월요일"> 월요일
	<input type="radio" id="weekDay" value="화요일"> 화요일
	<input type="radio" id="weekDay" value="수요일"> 수요일
	<input type="radio" id="weekDay" value="목요일"> 목요일
	<input type="radio" id="weekDay" value="금요일"> 금요일
	<input type="radio" id="weekDay" value="토요일"> 토요일
	<input type="radio" id="weekDay" value="일요일"> 일요일

	<br>
	<br> 줄거리
	<textarea id="webtoonInfo"></textarea>

	<br>
	<br> 
	대표 이미지 등록
	<input type="text" id="webtoonCover">

	<br>
	<br> 
	소개 이미지 등록
	<input type="text" id="webtoonIntrdCorver">
	
	<br>
	<br> 
	
	<div>
		<input class="webtoon-upload-btn" type="button" value="웹툰 올리기" class="request">
	</div>

</body>


<script type="text/javascript" src="/resources/js/admin/adminPage_registration.js"></script> 
</html>