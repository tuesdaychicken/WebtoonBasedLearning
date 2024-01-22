package com.comic.common;

import java.io.File;

public class FolderCreate {

	String path = "C:/upload/webtoon/";
	
	
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
