/**
 * 
 */
// <input type="button" class="goRegist">
const goRegist = document.querySelector('.goRegist');

goRegist.addEventListener('click', () => {
    const form = document.querySelector('.webtoonForm');
    const formData = new FormData(form);
    
    let webtoonComicObj = {};
    
    for (let [key, value] of formData) {
        // key: Tag name
        webtoonComicObj[key] = value;
    };

    $.ajax({
        url: '/mypage/webtoonModify',
        data: webtoonComicObj,
        type : 'POST',
        success: function() {
            console.log('호출 성공');
        },
        error() {
            console.log('호출 실패');
        }
    });
});

