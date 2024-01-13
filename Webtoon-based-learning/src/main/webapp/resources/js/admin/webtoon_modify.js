/**
 * 
 */
// <input type="button" class="goRegist">
const updateBtn = document.querySelector('.webtoon-update-btn');

updateBtn.addEventListener('click', () => {
	console.log('click upload button!');
	console.log(document.getElementById('webtoonNum').value);
	const webtoonVO = {
		webtoonNum: document.getElementById('webtoonNum').value,
		webtoonTitle: document.getElementById('webtoonTitle').value,
		webtoonAge: document.getElementById('webtoonAge').value,
		webtoonInfo: document.getElementById('webtoonInfo').value,
		webtoonCover: document.getElementById('webtoonCover').value
	}
	
	console.log(webtoonVO);
	
	fetch('/admin/webtoonModify', {
		method: 'POST',
		headers: {
			'Content-Type' : 'application/json;charset=utf-8'},
		body: JSON.stringify(webtoonVO)
	})
	
	.catch((error) => console.error('에러가 발생했어 = ', error))
		/*.then((response) => response.json())
		.then((data) => console.log(data))*/
	
	window.location.href = "/"
	
	
});
