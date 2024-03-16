package com.comic.common;

import java.io.File;

public class FolderCreate {

	private String path = "C:/upload/webtoon/";
	
	
	//중복된 폴더의 이름 생성에 따라 어떻게 나누어 줄 것인가?
	//1. UUID 이용 		2. 날짜와 시간으로 폴더 생성
	// 웹툰 생성날짜를 통해 같은 제목이어도 생성날짜가 다른 걸 이용
	
	public FolderCreate(String folderName, String pathName) {
		// TODO Auto-generated constructor stub
		
		if(pathName != null && pathName != "") {
			episodeFolderCreate(folderName, pathName);
		}else {
			webtoonFolderCreate(folderName);
		}
	}

	private void webtoonFolderCreate(String folderName) {

		File webtoonFolderPath = new File(path+folderName);

		System.out.println("[ Common/FolderCreate/webtoonFolderCreate ]");

		// 폴더 생성시 생성 경로에 해당 파일이 존재하지 않는 경우 전부 생성
		if (webtoonFolderPath.mkdirs()) {
			System.out.println("Folder creation successful");
		} else {
			System.out.println("Folder Creation Thread");
		}
		
	}
	
	private void episodeFolderCreate(String folderName, String pathName) {
		
		//해당 메소드에 몇화인지 구분해서 폴더를 생성하게 해야함

		File webtoonFolderPath = new File(path+folderName+pathName);

		System.out.println("[ Common/FolderCreate/episodeFolderCreate ]");

		// 폴더 생성시 생성 경로에 해당 파일이 존재하지 않는 경우 전부 생성
		if (webtoonFolderPath.mkdirs()) {
			System.out.println("Folder creation successful");
		} else {
			System.out.println("Folder Creation Thread");
		}
	}
}
