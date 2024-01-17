/**
 * 웹툰 등록에 사용되는 JS 파일
 * registration.jsp 에서 post로 동작 후
 */

const uploadBtn = document.querySelector('.webtoon-upload-btn');

uploadBtn.addEventListener('click', () => {
	
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
	
	/** 웹툰 데이터 업로드 */
	fetch('/admin/registration', {
		method: 'POST',
		headers: {'Content-Type' : 'application/json;charset=utf-8'},
		body: JSON.stringify(webtoonVO)
	})
	
	/** 웹툰 이미지 파일 업로드 */
	fetch('/admin//webtoonFileSave', {
		method: 'POST',
		body: formData
	})
	
	.catch((error) => console.error('에러가 발생했어 = ', error))
		/*.then((response) => response.json())
		.then((data) => console.log(data))*/
	
	/*window.location.href = "adminActivity"*/
	
	
});

//.해서 들어가는 방법은 체이닝 기법이라 한다
//.then은 앞에 url에서 요청이 들어오면 실행


