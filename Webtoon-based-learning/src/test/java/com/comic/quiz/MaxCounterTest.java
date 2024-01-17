package com.comic.quiz;

import org.junit.Test;

public class MaxCounterTest {

	int count = 0;
	
	@Test
	public void MaxNumTest() {
		
		MaxCounter counter = new MaxCounter(0);
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		int count = counter.getCounter();
		System.out.println(count);
	}
}

class MaxCounter {
	
	int max;
	
	public MaxCounter(int num) {
		// TODO Auto-generated constructor stub
	}
	
	//숫자를 하나 증가시키는 메소드
	public void increment() {
		
		if(max < 3) {
			max += 1;
		} else {
			System.out.println("최대값은 3입니다 더이상 증가하지 않습ㄴ다");
		}
	}
	
	public int getCounter() {
		
		return max;
	}
}
