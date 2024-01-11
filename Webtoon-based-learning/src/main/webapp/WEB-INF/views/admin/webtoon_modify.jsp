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
	<input type="hidden" name="webtoonNum" value="${webtoon[0].webtoonNum}">

	<span>작품 제목</span>
	<input type="text" name="webtoon_TITLE" value="${webtoon[0].webtoonTitle}">
	<br>
	<br> 이용가
	<select name="webtoon_AGE" >
		<option>--선택--</option>
		<option>전체이용가</option>
		<option>12세 이용가</option>
		<option>15세 이용가</option>
		<option>18세 이용가</option>
	</select>



<script type="text/javascript" src="/resources/js/mypage/webtoon_modify.js"></script> 
</html>