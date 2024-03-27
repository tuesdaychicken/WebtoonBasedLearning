package com.parkinsu.quiz2;

class KakaoPay implements Paymentmethods{
	
	@Override
	public boolean payMethod(int amount) {
		// TODO Auto-generated method stub
		System.out.println("카카오페이 시스템과 연결합니다.");
		System.out.println(amount+"원 결제를 시도합니다");
		return true;
	}
	
}
