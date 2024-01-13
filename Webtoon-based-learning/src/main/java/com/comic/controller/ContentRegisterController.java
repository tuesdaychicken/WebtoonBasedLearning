package com.comic.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.comic.domain.WebtoonVO;
import com.comic.service.ContentRegisterService;
import com.comic.service.WebtoonContentService;

/**
 *@brief 마이페이지 기능 관련 Controller
 *@details 웹툰 CRUD 기능 service 호출
 *@author 황 규 성
 */
@Controller
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
		System.out.println("[ /admin/registration webtoonNewInsert ]");
		
//		System.out.println("VO: " + webtoonVO.toString());
		
		contentRegisterService.WebtoonRegister(webtoonVO);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(webtoonVO);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		return "redirect:/admin/adminActivity";
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
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(webtoonVO);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		contentRegisterService.WebtoonModify(webtoonVO);
		
		return "redirect:/naver/";
	}
	
	/** 
	 *@brief 웹툰 삭제 service 호출
	 *@param 삭제하려는 웹툰 번호
	 *@return 홈페이로 이동
	 */
	@GetMapping("/webtoonRemove")
	public String webtoonComicRemove(int webtoon_NUM, Model model) {
		
		Map<String, Integer> webtoonKey = Map.of(
				"webtoon_NUM", webtoon_NUM
			);
		
		contentRegisterService.WebtoonRemove(webtoonKey);
		
		return "redirect:/naver/";
	}
	
	
	
	
	
	
	
}



















