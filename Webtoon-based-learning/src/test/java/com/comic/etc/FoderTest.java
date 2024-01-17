package com.comic.etc;

import java.io.File;

import org.junit.Test;

public class FoderTest {

	@Test
	public void 폴더생성테스트() {
		String path = "C:/upload/webtoon/test1";
		
		File Folder1 = new File(path);
		
		//폴더 생성시 생성 경로에 해당 파일이 존재하지 않는 경우 파일을 생성하지 않음
		if(Folder1.mkdir()) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
		
		//폴더 생성시 생성 경로에 해당 파일이 존재하지 않는 경우 전부 생성
		if(Folder1.mkdirs()) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
	}
	
}
