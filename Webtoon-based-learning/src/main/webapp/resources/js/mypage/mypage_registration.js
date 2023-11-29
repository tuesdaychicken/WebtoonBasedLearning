/**
 * 웹툰 등록에 사용되는 JS 파일
 * mypage_registration.jsp 에서 post로 동작 후
 */

var webtoonVO = {
	webtoonTitle: "webtoonTitle",
		webtoonAge: "webtoonAge",
		weekDay: "weekDay",
		webtoonInfo: "webtoonInfo",
		webtoonCover: "webtoonCover",
		webtoonIntrdCorver: "webtoonIntrdCorver"
}

console.log(webtoonVO)

fetch('/mypage/registration', {
	method: "POST",
	
	body: JSON.stringify(webtoonVO)
})
	.then((response) => response.json())
	.then((data) => console.log(data))
	.catch((error) => console.error("에러가 발생했어 = ", error))

//.해서 들어가는 방법은 체이닝 기법이라 한다
//.then은 앞에 url에서 요청이 들어오면 실행


