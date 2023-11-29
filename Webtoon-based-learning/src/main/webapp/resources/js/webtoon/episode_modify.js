/**
 * 
 */
// <input type="button" class="goRegist">
const goRegist = document.querySelector('.goRegist');

goRegist.addEventListener('click', () => {
    const form = document.querySelector('.episodeForm');
    const formData = new FormData(form);
    
    let webtoonEpisodeObj = {};
    
    for (let [key, value] of formData) {
        // key: Tag name
        webtoonEpisodeObj[key] = value;
    };

    $.ajax({
        url: '/webtoon/episodeModify',
        data: webtoonEpisodeObj,
        type : 'POST',
        success: function() {
            console.log('호출 성공');
        },
        error() {
            console.log('호출 실패');
        }
    });
});

