<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

	
	<c:forEach var="webtoon" items="${webtoonVO}">
	
	<input type="hidden" id="webtoonNum" value="${webtoon.webtoonNum}">

	<span>작품 제목</span>
	<input type="text" id="webtoonTitle" value="${webtoon.webtoonTitle}">
	여기 아래에 글자
	${webtoon.webtoonTitle}
	<br>
	<br> 이용가
	<select id="webtoonAge" >
		<option>--선택--</option>
		<option>전체이용가</option>
		<option>12세 이용가</option>
		<option>15세 이용가</option>
		<option>18세 이용가</option>
	</select>

	<br>
	<br> 줄거리
	<textarea id="webtoonInfo">${webtoon.webtoonInfo}</textarea>

	<br>
	<br> 
	대표 이미지 등록
	<input type="text" id="webtoonCover" value="${webtoon.webtoonCover}">

	<br>
	<br> 
	
	<br>
	<br> 
	</c:forEach>
	<div>
		<input class="webtoon-update-btn" type="button" value="웹툰 올리기">
	</div>


</body>

<script type="text/javascript" src="/resources/js/admin/webtoon_modify.js"></script>

</html>