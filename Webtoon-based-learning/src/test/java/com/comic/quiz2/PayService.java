package com.comic.quiz2;

class PayService {

	public void processPay(String payOption, int amount) {
		boolean check = false;
		
		if(payOption != null) {
			System.out.println("결제를 시작합니다: option = " + payOption + ", amount = " + amount);
			check=payStart(payOption, amount);
		}
		
		if (check) {
			System.out.println("결제에 성공했습니다");
		} else {
			System.out.println("결제에 실패했습니다");
		}
	}
	
	public boolean payStart(String payOption, int amount) {
		
		Paymentmethods pay;
		boolean checkout = false;
		
		switch (payOption) {
		case "kakao":
			pay = new KakaoPay();
			checkout = pay.payMethod(amount);
			break;

		case "naver":
			pay = new NaverPay();
			checkout = pay.payMethod(amount);
			break;

		default:
			System.out.println("결제 수단이 없습니다.");
		}

		return checkout;
	}
	
	//굳이 할 필요 없다
//	public void paySucces(boolean checkout) {
//		if (checkout) {
//			System.out.println("결제에 성공했습니다");
//		} else {
//			System.out.println("결제에 실패했습니다");
//		}
//	}

}
