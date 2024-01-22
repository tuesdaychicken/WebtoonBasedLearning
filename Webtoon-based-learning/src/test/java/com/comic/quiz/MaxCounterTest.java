package com.comic.quiz;

import org.junit.Test;

public class MaxCounterTest {
	
	@Test
	public void MaxNumTest() {
		
		MaxCounter counter = new MaxCounter(3);
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		int count = counter.getCounter();
		System.out.println(count);
	}
}

 class MaxCounter {
	
	private int count = 0;
	private int max;
	
	public MaxCounter(int num) {
		// TODO Auto-generated constructor stub
		max = num;
	}
	
	//숫자를 하나 증가시키는 메소드
	public void increment() {
		
		if(isCountValid(count)) {
			count ++;
		}else {
			System.out.println("최댓값 넘음");
		}
	}
	
	//값을 꺼내는 메소드
	public int getCounter() {
		return count;
	}
	
	//최댓값 비교 메서드
	public boolean isCountValid(int countNum) {
		return count < max;
	}
}
