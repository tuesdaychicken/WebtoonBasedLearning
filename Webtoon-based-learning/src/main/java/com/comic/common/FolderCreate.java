package com.comic.common;

import java.io.File;

public class FolderCreate {
	
	public void webtoonFolderCreate(String folderName) {
		
		String path = "C:/upload/webtoon/"+folderName;
		
		File webtoonFolderPath = new File(path);
		
		System.out.println("[ Common/FolderCreate/webtoonFolderCreate ]");
		
		//폴더 생성시 생성 경로에 해당 파일이 존재하지 않는 경우 전부 생성
		if(webtoonFolderPath.mkdirs()) {
			System.out.println("Folder creation successful");
		}else {
			System.out.println("Folder Creation Thread");
		}
		
	}
}
