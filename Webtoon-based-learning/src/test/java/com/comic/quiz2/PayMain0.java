package com.comic.quiz2;

import org.junit.Test;

public class PayMain0 {

	@Test
	public void payMain() {

		PayService payService = new PayService();
		
		//kakao 결제
		String payOption1 = "kakao";
		int amount1 = 5000;
		payService.processPay(payOption1, amount1);
		
		//naver 결제
		String payOption2 = "naver";
		int amount2 = 10000;
		payService.processPay(payOption2, amount2);
		
		//잘못된 결제
		String payOption3 = "bad";
		int amount3 = 15000;
		payService.processPay(payOption3, amount3);
		
		String payOption4 = null;
		int amount4 = 15000;
		payService.processPay(payOption4, amount4);
		
	}
	
	
	
}
