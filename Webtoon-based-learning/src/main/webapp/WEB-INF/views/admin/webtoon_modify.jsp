<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<%@ include file="../includes/header.jsp"%>

	<br>
	<br>

<form action="/admin/registration" method="post" class="webtoonForm">
	
	<c:forEach var="webtoon" items="${webtoonVO}">
	
	<input type="hidden" name="webtoonNum" value="${webtoon.webtoonNum}">

	<span>작품 제목</span>
	<input type="text" name="webtoonTitle" value="${webtoon.webtoonTitle}">
	여기 아래에 글자
	${webtoon.webtoonTitle}
	<br>
	<br> 이용가
	<select name="webtoonAge" >
		<option>--선택--</option>
		<option>전체이용가</option>
		<option>12세 이용가</option>
		<option>15세 이용가</option>
		<option>18세 이용가</option>
	</select>

	<br>
	<br> 줄거리
	<textarea name="webtoonInfo">${webtoon.webtoonInfo}</textarea>

	<br>
	<br> 
	대표 이미지 등록
	<input type="text" name="webtoonCover" value="${webtoon.webtoonCover}">

	<br>
	<br> 
	
	<br>
	<br> 
	</c:forEach>
	<div>
		<input type="submit" value="웹툰 올리기" class="goRegist" onclick="location.href='/naver/'">
	</div>

</form>

</body>



</html>