<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/webtoon/webtoonHome.css"/>
</head>
<body>
<%@ include file="/WEB-INF/views/includes/header.jsp" %>


    <div class="webtoon">
         <div class="webtoon_spot">
            <div class="spot_left">
                <div>
                    <h2>이달의 신규 웹툰</h2> 
                </div>

                <ul class="ul">
                    <li class="spot">
                        <div class="spot_img" style="background-color: blue;"> <img class="spot_img" src="/resources/img/img2.JPG"> </div>
                        <p class="title">TEST 1</p>
                        <p class="writer">TEST 1</p>
                        <p class="line_limit info">TEST 1</p>
                    </li>

                    <li class="spot">
                        <div class="spot_img" style="background-color: aqua;"> <img class="spot_img" src="/resources/img/img3.JPG" alt=""> </div>
                        <p class="title">TEST 2</p>
                        <p class="writer">TEST 2</p>
                        <p class="line_limit info">TEST 2</p>
                    </li>

                    <li class="spot">
                        <div class="spot_img" style="background-color: coral;"> <img class="spot_img" src="/resources/img/img1.JPG"> </div>
                        <p class="title">TEST 3</p>
                        <p class="writer">TEST 3</p>
                        <p class="line_limit info">TEST 3</p>
                    </li>
                </ul>
            </div>

            <div class="spot_right">
                <a href="https://vibe.naver.com/album/9176758?utm_source=webtoon&utm_medium=bfexp&utm_campaign=peaktime"> <img src="resources/img/ad.png" class="ad_img"> </a>
            </div>
        </div>
          <div class="middle_banner">
            <a href="https://vibe.naver.com/album/9176758?utm_source=webtoon&utm_medium=bfexp&utm_campaign=peaktime"> <img src="resources/img/ad2.jpg"> </a>
        </div> 
        <div>
            <div class="view_type">
                <p class="view_font">요일별 전체 웹툰</p>
                <ul class="type_ul">
                    <li class="type_li"><a href="#">인기순</a></li>
                    <li class="type_li"><a href="#">업데이트순</a></li>
                    <li class="type_li"><a href="#">조회순</a></li>
                    <li class="type_li"><a href="#">별점순</a></li>
                </ul>
            </div>

            <div class="list_area">
                <div class="col">
                    <h4>월요웹툰</h4>
                    <ul class="col_ul">

                        <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.weekDay eq '월요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoonNum=${comic.webtoonNum}"> <img src="resources/img/naver.JPG" alt="" class="poster_img"> </a>
                                <div class="col_font"><a href="webtoon/list?webtoonNum=${comic.webtoonNum}" class="webtoonTitle">${comic.webtoonTitle}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col">
                    <h4>화요웹툰</h4>
                    <ul class="col_ul">
                        <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.weekDay eq '화요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoonNum=${comic.webtoonNum}"> <img src="" alt="" class="poster_img"> </a>
                                <div class="col_font"><a href="webtoon/list?webtoonNum=${comic.webtoonNum}" class="webtoonTitle">${comic.webtoonTitle}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col">
                    <h4>수요웹툰</h4>
                    <ul class="col_ul">
                       <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.weekDay eq '수요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoonNum=${comic.webtoonNum}"> <img src="" alt="" class="poster_img"> </a>
                                <div class="col_font"><a href="webtoon/list?webtoonNum=${comic.webtoonNum}" class="webtoonTitle">${comic.webtoonTitle}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col">
                    <h4>목요웹툰</h4>
                    <ul class="col_ul">
                        <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.weekDay eq '목요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoonNum=${comic.webtoonNum}"> <img src="" alt="" class="poster_img"> </a>
                                <div class="col_font"><a href="webtoon/list?webtoonNum=${comic.webtoonNum}" class="webtoon_TITLE">${comic.webtoonTitle}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col">
                    <h4>금요웹툰</h4>
                    <ul class="col_ul">
                        <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.weekDay eq '금요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoonNum=${comic.webtoonNum}"> <img src="" alt="" class="poster_img"> </a>
                                <div class="col_font"><a href="webtoon/list?webtoonNum=${comic.webtoonNum}" class="webtoon_TITLE">${comic.webtoonTitle}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col">
                    <h4>토요웹툰</h4>
                    <ul class="col_ul">
                       <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.weekDay eq '토요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoonNum=${comic.webtoonNum}"> <img src="" alt="" class="poster_img"> </a>
                                <div class="col_font"><a href="webtoon/list?webtoonNum=${comic.webtoonNum}" class="webtoonTitle">${comic.webtoonTitle}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col col2">
                    <h4>일요웹툰</h4>
                    <ul class="col_ul">
                       <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.weekDay eq '일요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoonNum=${comic.webtoonNum}"> <img src="" alt="" class="poster_img"> </a>
                                <div class="col_font"><a href="webtoon/list?webtoonNum=${comic.webtoonNum}" class="webtoon_TITLE">${comic.webtoonTitle}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
    </div>

</body>
</html>