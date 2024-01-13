package com.comic.quiz;


import javax.xml.crypto.Data;

import org.junit.Test;


public class DataTest {

	class BigData{
		int count;
		Data data;
	}
	
	
	@Test
	public void DataTest1() {
		BigData bigData = new BigData();
		
		System.out.println(bigData.count);
		System.out.println(bigData.data);
	}
}


