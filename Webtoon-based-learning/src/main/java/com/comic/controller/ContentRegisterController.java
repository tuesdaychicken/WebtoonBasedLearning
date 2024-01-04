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
import org.springframework.web.bind.annotation.RestController;

import com.comic.domain.NaverWebtoonVO;
import com.comic.service.ContentRegisterService;

/**
 *@brief 마이페이지 기능 관련 Controller
 *@details 웹툰 CRUD 기능 service 호출
 *@author 황 규 성
 */
@Controller
@RequestMapping(value="/mypage")
public class ContentRegisterController {
	
	@Autowired
	private final ContentRegisterService naverMypageService;
	
	public ContentRegisterController(ContentRegisterService naverMypageService) {
		// TODO Auto-generated constructor stub
		this.naverMypageService = naverMypageService;
	}
	
	/** 
	 *@brief 웹툰을 등록하기 위한 Service 호출
	 *@return 웹툰 등록 페이지로 이동
	 */
	@GetMapping("/registration")
	public String webtoonNewInsert() {
		return "/mypage/mypage_registration";
	}
	
	/** 
	 *@brief 등록하려는 웹툰 Data DB 업로드
	 *@param 웹툰 Data VO
	 *@return 등록 후 마이페이지로 이동
	 */
	@PostMapping("/registration")
	// @ResponseBody -> RestController를 쓰면 생략 가능
	// @ResponseBOdy -> html 형식으로 리턴해 줄 수 있음 쉽게 얘기하면 정보 찾아보셈
	public String webtoonNewInsert(@RequestBody NaverWebtoonVO naverWebtoonVO) {
		System.out.println("[ /mypage/registration webtoonNewInsert ]");
		System.out.println("VO: " + naverWebtoonVO.toString());
		
		naverMypageService.WebtoonRegister(naverWebtoonVO);
		//여기서 넣은 웹툰의 이름을 
		return "redirect:/mypage/myActivity";
	}
	
	
	/** 
	 *@brief 마이 페이지로 이동하는 Service 호출?
	 *@return 마이 페이지로 이동
	 */
	@GetMapping("/myActivity")
	public String myActivity() {
		return "/mypage/mypage_activity";
	}
	
	/** 
	 *@brief 웹툰 수정 service 호출
	 *@param 수정하고자 하는 웹툰 번호
	 *@return 수정 페이지로 이동
	 */
	@GetMapping("/webtoonModify")
	public String webtoonComicModify(int webtoon_NUM, Model model) {
		Map<String, Integer> webtoonKey = Map.of(
				"webtoon_NUM", webtoon_NUM
			);
		
		model.addAttribute("webtoon", naverMypageService.detailWebtoonSerch(webtoonKey));
		
		return "/mypage/webtoon_modify";
	}

	/** 
	 *@brief 웹툰 수정 후
	 *@param 수정된 웹툰 내용
	 *@return 홈페이지로 이동
	 */
	@PostMapping("/webtoonModify")
	public String webtoonComicModify(@RequestParam Map<String, Object> webtoonComicObj) {
		
		naverMypageService.WebtoonModify(webtoonComicObj);
		
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
		
		naverMypageService.WebtoonRemove(webtoonKey);
		
		return "redirect:/naver/";
	}
	
	
	
	
	
	
	
}



















