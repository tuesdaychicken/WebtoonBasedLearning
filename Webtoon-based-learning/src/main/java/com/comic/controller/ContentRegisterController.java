package com.comic.controller;

import java.io.File;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.comic.common.FolderCreate;
import com.comic.domain.WebtoonVO;
import com.comic.service.ContentRegisterService;
import com.comic.service.WebtoonContentService;

import lombok.extern.log4j.Log4j;

/**
 *@brief 마이페이지 기능 관련 Controller
 *@details 웹툰 CRUD 기능 service 호출
 *@author 황 규 성
 */
@Controller
@Log4j
@RequestMapping(value="/admin")
public class ContentRegisterController {
	
	@Autowired
	private final ContentRegisterService contentRegisterService;
	private final WebtoonContentService webtoonContentService;	
	
	public ContentRegisterController(ContentRegisterService contentRegisterService, WebtoonContentService webtoonContentService) {
		// TODO Auto-generated constructor stub
		this.contentRegisterService = contentRegisterService;
		this.webtoonContentService = webtoonContentService;
	}
	
	String fileFinalizeName;
	
	/** 
	 *@brief 관리자 페이지로 이동하는 Service 호출?
	 *@return 관리자 페이지로 이동
	 */
	@GetMapping("/adminActivity")
	public String myActivity() {
		return "/admin/admin_activity";
	}
	
	/** 
	 *@brief 웹툰을 등록하기 위한 Service 호출
	 *@return 웹툰 등록 페이지로 이동
	 */
	@GetMapping("/registration")
	public String webtoonNewInsert() {
		return "/admin/webtoon_registration";
	}
	
	/** 
	 *@brief 등록하려는 웹툰 Data DB 업로드
	 *@param 웹툰 Data VO
	 *@return 등록 후 마이페이지로 이동
	 */
	@PostMapping("/registration")
	// @ResponseBody -> RestController를 쓰면 생략 가능
	// @ResponseBody -> 쉽게 말해서 html 형식으로 리턴해 줄 수 있음
	public String webtoonNewInsert(@RequestBody WebtoonVO webtoonVO) {
		System.out.println("[ Controller/admin/registration webtoonNewInsert ]");
		System.out.println("VO: " + webtoonVO.toString());
		
		//파일명의 유연성을 위해 담아서 보낸다
		fileFinalizeName = webtoonVO.getWebtoonTitle();
		System.out.println("나로 말할거 같은면 앞으로 쓰게 될 몸일 시올시다 : "+fileFinalizeName);
		
		contentRegisterService.WebtoonRegister(webtoonVO);
		return "redirect:/admin/adminActivity";
	}
	
	/**
	 * 파일 업로드와 폴더 생성을 동시에?*/
	@PostMapping("/webtoonFileSave")
	public void webtoonFileUpload(MultipartFile[] uploadFile) {
	
		//
		FolderCreate create = new FolderCreate();
		create.webtoonFolderCreate(fileFinalizeName);
		
		String uploadFolder = "C:/upload/test";
		
		for(MultipartFile multipartFile : uploadFile) {
			System.out.println("Upload File Name : " + multipartFile.getOriginalFilename());
			System.out.println("Upload File Size : " + multipartFile.getSize());
			String uploadFileName = multipartFile.getOriginalFilename();
			
			uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\")+1);
			
			System.out.println("변경된 파일 이름 : "+uploadFileName);
			
			File saveFile = new File(uploadFolder, uploadFileName);
			
//			FileUtils.copyInputStreamToFile(null, saveFile);
			
			try {
				multipartFile.transferTo(saveFile);
			}catch (Exception e) {
				// TODO: handle exception
				log.error(e.getMessage());
			}
		}
		
	}
	
	/** 
	 *@brief 웹툰 수정 service 호출
	 *@param 수정하고자 하는 웹툰 번호
	 *@return 수정 페이지로 이동
	 */
	@GetMapping("/webtoonModify")
	public String webtoonComicModify(int webtoonNum, Model model) {
		
		WebtoonVO webtoonKey = new WebtoonVO();
		
		webtoonKey.setWebtoonNum(webtoonNum);
		
		model.addAttribute("webtoonVO",webtoonContentService.detailWebtoonSerch(webtoonKey));
		return "/admin/webtoon_modify";
	}

	/** 
	 *@brief 웹툰 수정 후
	 *@param 수정된 웹툰 내용
	 *@return 홈페이지로 이동
	 */
	@PostMapping("/webtoonModify")
	public String webtoonComicModify(@RequestBody WebtoonVO webtoonVO) {
		
		contentRegisterService.WebtoonModify(webtoonVO);
		
		return "redirect:/naver/";
	}
	
	/** 
	 *@brief 웹툰 삭제 service 호출
	 *@param 삭제하려는 웹툰 번호
	 *@return 홈페이로 이동
	 */
	@GetMapping("/webtoonRemove")
	public String webtoonComicRemove(int webtoonNum, Model model) {

		WebtoonVO webtoonKey = new WebtoonVO();
		webtoonKey.setWebtoonNum(webtoonNum);
		
		contentRegisterService.WebtoonRemove(webtoonKey);
		
		return "redirect:/naver/";
	}
	
	
	
	
	
	
	
}



















