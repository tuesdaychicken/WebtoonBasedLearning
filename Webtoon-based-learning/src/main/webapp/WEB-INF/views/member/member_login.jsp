<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/member/member_login.css"/>
</head>
<body>

 
 <div class="main">

		<!--웹페이지 상단-->
		<header>
			<!--language select-->

			<div class="select-lang">
				<select class="selectbox" name="job">
					<option value="">한국어</option>
					<option value="학생">English</option>
					<option value="회사원">中國語</option>
					<option value="기타">日本</option>
				</select>
			</div>

			<!--NAVER LOGO-->
			<div class="logo">
				<a href="https://www.naver.com/" target="_blank" title="네이버 홈페이지"><img src="/resources/img/logo.jpg" class="image"></a>
			</div>
		</header>

		<!--로그인 부분-->
		<section class="login-wrap">

			<form action="/member/login" method="post">
				<div class="login-id-wrap">
					<input name="user_ID" placeholder="아이디" type="text" class="input-id"></input>
				</div>
				<div class="login-pw-wrap">
					<input name="user_PW" placeholder="비밀번호" type="password" class="input-pw"></input>
				</div>
				<div class="login-btn-wrap">
					<input type="submit" class="login-btn" value="로그인">
				</div>
				<div class="under-login">
					<span class="stay-check">
						<input type="checkbox" name="stay-btn" value="stay" class="stay-checkbox">로그인 상태 유지
					</span>
					<span class="ip-check">
						IP 보안 <input type="checkbox" name="stay-btn" value="stay" class="ip-checkbox">
					</span>
				</div>
			</form>

		</section>

		<!--간편한 로그인 부분-->
		<section class="easy-login-wrap">

			<div class="easy-login">
				<p>더욱 간편한 로그인</p>
			</div>

			<div class="easy-login-box">
				<div class="qr-login">
					<a href="https://nclass.naver.com/nclasslogin.login?mode=qrcode" target="_blank" title="QR코드 로그인">QR 코드 로그인</a>
				</div>

				<div class="onetime-login">
					<a href="https://nclass.naver.com/nclasslogin.login?mode=number&url=https%3A%2F%2Fwww.naver.com&locale=ko_KR&svctype=1"
						target="_blank" title="일회용번호 로그인">일회용 번호 로그인</a>
				</div>
			</div>


		</section>

		<!--class,PW 찾기 및 회원가입 부분-->
		<section class="find-signup-wrap">

			<span class="find-id">
				<a href="https://nclass.naver.com/user2/help/classInquiry?lang=ko_KR" target="_blank"
					title="QR코드 로그인">아이디 찾기</a>
			</span>

			<span class="find-pw">
				<a href="https://nclass.naver.com/user2/help/pwInquiry?lang=ko_KR" target="_blank"
					title="일회용번호 로그인">비밀번호 찾기</a>
			</span>

			<span class="sign-up">
				<a href="https://nclass.naver.com/user2/V2Join?m=agree&lang=ko_KR" target="_blank"
					title="일회용번호 로그인">회원가입</a>
			</span>

		</section>

		<!--저작권 정보-->
		<footer>
			<div class="copyright-wrap">
				<span> Copyright © NAVER Corp. All Rights Reserved.</span>
			</div>
		</footer>

	</div>
 
 

</body>
</html>