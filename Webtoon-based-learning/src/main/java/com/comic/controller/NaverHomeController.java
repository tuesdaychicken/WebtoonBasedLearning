package com.comic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comic.service.NaverWebtoonService;

/**
*@brief 간략
*@details 상세
*@author Name, Name@tistory.com
*@date 2019-06-09
*@version 0.0.1
*/
/**
 *@brief 간략설명
 *@details 세부설명
 *@author 황 규 성
 */
@Controller
@RequestMapping(value="/")
public class NaverHomeController {

	@Autowired
	private final NaverWebtoonService naverWebtoonService;
	
	public NaverHomeController(NaverWebtoonService naverWebtoonService) {
		// TODO Auto-generated constructor stub
		this.naverWebtoonService = naverWebtoonService;
	}
	/** 
	 *@brief 함수 설명
	 *@param 인자값
	 *@return 리턴값
	 */
	/** 
	 *@brief 함수의 설명
	 *@author 황규성
	 *@date 함수 업데이트 날짜
	 *@param 함수의 인자 설명
	 *@return 리턴값에 대한설명
	 */
	@GetMapping("/naver")
	public String indexPage(Model model) {
		
		model.addAttribute("webtoon", naverWebtoonService.webtoonweek_DAY());
		return "/naver/home";
	}
}
