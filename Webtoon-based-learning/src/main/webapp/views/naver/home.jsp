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
                        <div class="spot_img" style="background-color: blue;"> <img class="spot_img" src="resources/img/img2.JPG"> </div>
                        <p class="title">성희와 예찬</p>
                        <p class="writer">박태준만화회사</p>
                        <p class="line_limit info">껄렁한 겉모습으로 인해 음험한 소문을 몰고 다니는 시골 토박이 전학생 이예찬은 첫눈에 반한 전교 1등  폭격이 시작된다!</p>
                    </li>

                    <li class="spot">
                        <div class="spot_img" style="background-color: aqua;"> <img class="spot_img" src="resources/img/img3.JPG"> </div>
                        <p class="title">원조찐따 이예찬</p>
                        <p class="writer">이말년/주호민</p>
                        <p class="line_limit info">힘없고 가진거 하나 없이 맞고만 살던 이예찬 이였는데... 우연히 비밀의 뉴튜브를 발견하게 되고 갑자기 떼돈을 벌었다.</p>
                    </li>

                    <li class="spot">
                        <div class="spot_img" style="background-color: coral;"> <img class="spot_img" src="resources/img/img1.JPG"> </div>
                        <p class="title">나는 존나쎄다 : 임채리의 등장</p>
                        <p class="writer">기안84</p>
                        <p class="line_limit info">무쇠팔, 무쇠다리, 로켓트 주먹. 목숨이 아깝거든~ 모두모두 비켜라!!!! </p>
                    </li>
                </ul>
            </div>

            <div class="spot_right">
                <a href="https://vibe.naver.com/album/9176758?utm_source=webtoon&utm_medium=bfexp&utm_campaign=peaktime"> <img src="resources/img/ad.png" class="ad_img"></a>
            </div>
        </div>

        <div class="middle_banner">
            <a href="https://vibe.naver.com/album/9176758?utm_source=webtoon&utm_medium=bfexp&utm_campaign=peaktime"><img src="resources/img/ad2.jpg"></a>
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
							<c:if test="${comic.week_DAY eq '월요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}"><img src="resources/img/naver.JPG" alt="" class="poster_img"></a>
                                <div class="col_font"><a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}" class="webtoon_TITLE">${comic.webtoon_TITLE}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col">
                    <h4>화요웹툰</h4>
                    <ul class="col_ul">
                        <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.week_DAY eq '화요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}"><img src="" alt="" class="poster_img"></a>
                                <div class="col_font"><a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}" class="webtoon_TITLE">${comic.webtoon_TITLE}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col">
                    <h4>수요웹툰</h4>
                    <ul class="col_ul">
                       <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.week_DAY eq '수요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}"><img src="" alt="" class="poster_img"></a>
                                <div class="col_font"><a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}" class="webtoon_TITLE">${comic.webtoon_TITLE}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col">
                    <h4>목요웹툰</h4>
                    <ul class="col_ul">
                        <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.week_DAY eq '목요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}"><img src="" alt="" class="poster_img"></a>
                                <div class="col_font"><a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}" class="webtoon_TITLE">${comic.webtoon_TITLE}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col">
                    <h4>금요웹툰</h4>
                    <ul class="col_ul">
                        <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.week_DAY eq '금요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}"><img src="" alt="" class="poster_img"></a>
                                <div class="col_font"><a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}" class="webtoon_TITLE">${comic.webtoon_TITLE}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col">
                    <h4>토요웹툰</h4>
                    <ul class="col_ul">
                       <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.week_DAY eq '토요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}"><img src="" alt="" class="poster_img"></a>
                                <div class="col_font"><a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}" class="webtoon_TITLE">${comic.webtoon_TITLE}</a></div>
                            </li>
							</c:if>
                        </c:forEach>
                    </ul>
                </div>

                <div class="col col2">
                    <h4>일요웹툰</h4>
                    <ul class="col_ul">
                       <c:forEach var="comic" items="${webtoon}">
							<c:if test="${comic.week_DAY eq '일요일'}"> 
                            <li class="col_li">
                                <a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}"><img src="" alt="" class="poster_img"></a>
                                <div class="col_font"><a href="webtoon/list?webtoon_NUM=${comic.webtoon_NUM}" class="webtoon_TITLE">${comic.webtoon_TITLE}</a></div>
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