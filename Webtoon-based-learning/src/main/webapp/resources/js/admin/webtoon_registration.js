/**
 * 웹툰 등록에 사용되는 JS 파일
 * registration.jsp 에서 post로 동작 후
 */



const uploadBtn = document.querySelector('.webtoon-upload-btn');

uploadBtn.addEventListener('click', () => {
	
	console.log(document.getElementsByName('week'));
	
	const gender = document.getElementsByName('week');
	var genderChoice; // 여기에 선택된 radio 버튼의 값이 담기게 된다.
	for(var i=0; i<gender.length; i++) {
		 if(gender[i].checked) {
   			 genderChoice = gender[i].value;
		 }
	}
	
	const webtoonVO = {
		webtoonTitle: document.getElementById('webtoonTitle').value,
		webtoonAge: document.getElementById('webtoonAge').value,
		weekDay: genderChoice,
		webtoonInfo: document.getElementById('webtoonInfo').value,
		webtoonCover: document.getElementById('webtoonCover').value
	}
	
	console.log(webtoonVO);
	
	fetch('/admin/registration', {
		method: 'POST',
		headers: {
			'Content-Type' : 'application/json;charset=utf-8'},
		body: JSON.stringify(webtoonVO)
	})
	
	.catch((error) => console.error('에러가 발생했어 = ', error))
		/*.then((response) => response.json())
		.then((data) => console.log(data))*/
	
	/*window.location.href = "adminActivity"*/
	
	
});

//.해서 들어가는 방법은 체이닝 기법이라 한다
//.then은 앞에 url에서 요청이 들어오면 실행


