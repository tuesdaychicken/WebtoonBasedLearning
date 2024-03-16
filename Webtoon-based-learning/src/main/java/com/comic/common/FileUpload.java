package com.comic.common;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Log4j
public class FileUpload {
	
	String uploadPath = "C:/upload/webtoon/";
	
	/**
	 * 인스턴스화 하면서 커버이미지 올리는 것인지 에피소드 올리는것인지 판단
	 * */
	public FileUpload(MultipartFile[] uploadFile, String fileName) {
		// TODO Auto-generated constructor stub
		if(uploadFile.length < 2) {
			webtoonCoverUpload(uploadFile, fileName);
		}else {
			episodeFileUpload(uploadFile, fileName);
		}
	}
	
	private void webtoonCoverUpload(MultipartFile[] uploadFile, String fileName) {

/*		String uploadFileName = uploadFile[0].getOriginalFilename();
		//해당 파일의 이름을 꺼냄
		
//		uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\")+1);
		//해당 파일 이름에서 경로 부분을 제거
		//파일의 이름을 출력해본 결과 경로가 나타나지 않지만 언제 쓸지 모르니 냅두자
*/		
		File saveFile = new File(uploadPath+fileName, fileName+".JPG");
		//저장경로와 파일이름
		
//		FileUtils.copyInputStreamToFile(null, saveFile);
		
		try {
			uploadFile[0].transferTo(saveFile);
			//파일 업로드
		}catch (Exception e) {
			// TODO: handle exception
			log.error(e.getMessage());
		}
	}
	
	private void episodeFileUpload(MultipartFile[] uploadFile, String fileName) {
		
		for(MultipartFile multipartFile : uploadFile) {
			System.out.println("Upload File Name : " + multipartFile.getOriginalFilename());
			System.out.println("Upload File Size : " + multipartFile.getSize());
			String uploadFileName = multipartFile.getOriginalFilename();
			
			
			uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\")+1);
			//이부분은 파일의 경로 부분을 제외하고 
			
			System.out.println("변경된 파일 이름 : "+uploadFileName);
			
			File saveFile = new File(uploadPath, uploadFileName);
			
//			FileUtils.copyInputStreamToFile(null, saveFile);
			
			try {
				multipartFile.transferTo(saveFile);
			}catch (Exception e) {
				// TODO: handle exception
				log.error(e.getMessage());
			}
		}
	}
}
