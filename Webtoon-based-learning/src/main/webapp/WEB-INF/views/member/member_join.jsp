<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/resources/css/member/member_join.css" />
</head>
<body>
<%@ include file="../includes/header.jsp"%>

	<!-- header -->
	<div id="header">
		<a href="https://nid.naver.com/user2/V2Join.nhn?m=agree#agreeBottom" target="_blank" title="네이버 회원가입 페이지 보러가기">
			<img src="/resources/img/logo.jpg" id="logo">
		</a>
	</div>

	<form action="/member/join" method="post">

		<!-- wrapper -->
		<div id="wrapper">

			<!-- content-->
			<div id="content">

				<!-- ID -->
				<div>
					<h3 class="join_title">
						<label for="id">아이디</label>
					</h3>
					<span class="box int_id"> 
						<input type="text" name="user_ID" id="id" class="int" maxlength="20"> 
						<span class="step_url">@naver.com</span>
					</span> 
					
					<span class="error_next_box"></span>
				</div>

				<!-- PW1 -->
				<div>
					<h3 class="join_title">
						<label for="pswd1">비밀번호</label>
					</h3>
					<span class="box int_pass"> 
						<input type="password" name="user_PW" id="pswd1" class="int" maxlength="20"> 
						<span id="alertTxt">사용불가</span>
						
					</span> 
					
					<span class="error_next_box"></span>
				</div>

				<!-- PW2 -->
				<div>
					<h3 class="join_title">
						<label for="pswd2">비밀번호 재확인</label>
					</h3>
					<span class="box int_pass_check"> 
						<input type="password" name="user_PW2" id="pswd2" class="int" maxlength="20"> 
						
					</span> 
					
					<span class="error_next_box"></span>
				</div>

				<!-- NAME -->
				<div>
					<h3 class="join_title">
						<label for="name">이름</label>
					</h3>
					<span class="box int_name"> 
					<input type="text" name="user_NAME" id="name" class="int" maxlength="20">
					</span> <span class="error_next_box"></span>
				</div>

				<!-- BIRTH -->
				<div>
					<h3 class="join_title">
						<label for="yy">생년월일</label>
					</h3>

					<div id="bir_wrap">
						<!-- BIRTH_YY -->
						<div id="bir_yy">
							<span class="box">
							<input type="text" name="userYY" id="yy" class="int" maxlength="4" placeholder="년(4자)">
							</span>
						</div>

						<!-- BIRTH_MM -->
						<div id="bir_mm">
							<span class="box"> 
								<select name="userMM" id="mm" class="sel">
									<option>월</option>
									<option value="01">1</option>
									<option value="02">2</option>
									<option value="03">3</option>
									<option value="04">4</option>
									<option value="05">5</option>
									<option value="06">6</option>
									<option value="07">7</option>
									<option value="08">8</option>
									<option value="09">9</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
								</select>
							</span>
						</div>

						<!-- BIRTH_DD -->
						<div id="bir_dd">
							<span class="box"> 
								<input type="text" name="userDD" id="dd" class="int" maxlength="2" placeholder="일">
							</span>
						</div>

					</div>
					<span class="error_next_box"></span>
				</div>

				<!-- GENDER -->
				<div>
					<h3 class="join_title">
						<label for="gender">성별</label>
					</h3>
					<span class="box gender_code"> <select name="user_GENDER"
						id="gender" class="sel">
							<option>성별</option>
							<option value="M">남자</option>
							<option value="F">여자</option>
					</select>
					</span> <span class="error_next_box">필수 정보입니다.</span>
				</div>

				<!-- EMAIL -->
				<div>
					<h3 class="join_title">
						<label for="email">본인확인 이메일<span class="optional">(선택)</span></label>
					</h3>
					<span class="box int_email"> <input name="user_EMAIL"
						type="text" id="email" class="int" maxlength="100"
						placeholder="선택입력">
					</span> <span class="error_next_box">이메일 주소를 다시 확인해주세요.</span>
				</div>

				<!-- MOBILE -->
				<div>
					<h3 class="join_title">
						<label for="phoneNo">휴대전화</label>
					</h3>
					<span class="box int_mobile"> 
					<input name="user_PHONE"	type="tel" id="mobile" class="int" maxlength="16"
						placeholder="전화번호 입력">
					</span> <span class="error_next_box"></span>
				</div>


				<!-- JOIN BTN-->
				<div class="btn_area">
						<input type="submit" value="회회원원가가입입" id="btnJoin">
					</button>
				</div>



			</div>
			<!-- content-->

		</div>
		<!-- wrapper -->
	</form>
	<script src="main.js"></script>

</body>
</html>