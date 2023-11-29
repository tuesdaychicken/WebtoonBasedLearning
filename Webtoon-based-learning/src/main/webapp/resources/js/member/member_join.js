/**
 * 뭔지 모르지만 이거를 다음에 접목해보자 총 두가지가 있다
 */

function changeDateForm(date) {
	const dateForm =
		date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate();
	return dateForm;
}

const date = new Date()










Object.values(passengerData).map(object =>
	PassengerDataArr.push({
		first_name: object.first_name,
		last_name: object.last_name,
		gender: object.gender,
		birthday:
			object.year + '-' +
			overTen(object.month) + '-' +
			overTen(object.day),
	})
);
