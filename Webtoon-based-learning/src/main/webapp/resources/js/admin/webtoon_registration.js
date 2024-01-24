/**
 * 웹툰 등록에 사용되는 JS 파일
 * registration.jsp 에서 post로 동작 후
 */

const uploadBtn = document.querySelector('.webtoon-upload-btn');

uploadBtn.addEventListener('click', async () => {
	
	/* 웹툰 요일 상태가 checked인 요일을 weekChoice에 담아서 넘김*/
	/* const webtoonWeek = document.getElementsByName('week');*/
	const webtoonWeek = document.querySelectorAll(".weekDay")
	var weekChoice;
	for(var i=0; i<webtoonWeek.length; i++) {
		 if(webtoonWeek[i].checked) {
   			 weekChoice = webtoonWeek[i].value;
		 }
	}
	
	/* 파일이 여러개인지 확인 후 넘기는 파일을 위로 전송~ */
	const formData = new FormData();
	const inputFile = $("input[name='uploadFile']");
	const files = inputFile[0].files;
	
	/*파일을 여러개 받는 경우 순차적으로 뒤로 붙으면서 데이터 형성*/
	for(var i = 0; i < files.length; i++){
		formData.append("uploadFile", files[i])
	}
	
	const webtoonVO = {
		webtoonTitle: document.getElementById('webtoonTitle').value,
		webtoonAge: document.getElementById('webtoonAge').value,
		weekDay: weekChoice,
		webtoonInfo: document.getElementById('webtoonInfo').value,
	}
	
	try{
	
	/** 웹툰 데이터 업로드 */
	const response1 = await fetch('/admin/registration', {
		method: 'POST',
		headers: {'Content-Type' : 'application/json;charset=utf-8'},
		body: JSON.stringify(webtoonVO)
	});
	
	/** 웹툰 이미지 파일 업로드 */
	const response2 = await fetch('/admin//webtoonFileSave', {
		method: 'POST',
		body: formData
	});
	
	//window.location.href = "adminActivity";
	
	} catch(error) {
		console.error("에러 발생 비상비상 = ", error);
	}
	
	
});

//.해서 들어가는 방법은 체이닝 기법이라 한다
//.then은 앞에 url에서 요청이 들어오면 실행

// 해당 js에서 값이 한글이면 깨져서 넘어가는걸로 확인
// 받는 부분에서도 UTF-8을 해줘야 하지만
// 자바스크립트 부분에서도 처리해줘ㅏ야 잘 넘어감
// 애시당초 한글이면 null로 찍힘

https://ducks228.tistory.com/entry/ajax-encodeURIComponent%EB%A1%9C-%ED%8C%8C%EB%9D%BC%EB%AF%B8%ED%84%B0-%EB%84%98%EA%B8%B8%EC%8B%9C-%ED%95%9C%EA%B8%80-%EA%B9%A8%EC%A7%90%ED%98%84%EC%83%81


 public void test() throws UnsupportedEncodingException {
  String a = "건강·의학";
  a = URLEncoder.encode(a, "UTF-8");
  a = URLEncoder.encode(a, "UTF-8");
  log.info("encode : " + a); //%25EA%25B1%25B4%25EA%25B0%2595%25C2%25B7%25EC%259D%2598%25ED%2595%2599
  a = URLDecoder.decode(a, "MS949");
  log.info("decode : " + a); //%EA%B1%B4%EA%B0%95%C2%B7%EC%9D%98%ED%95%99
  a = URLDecoder.decode(a, "UTF-8");
  log.info("decode : " + a); //건강·의학
}
출처: https://ducks228.tistory.com/entry/ajax-encodeURIComponent로-파라미터-넘길시-한글-깨짐현상 [블로그:티스토리]




