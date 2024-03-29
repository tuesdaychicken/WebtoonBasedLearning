package com.comic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comic.service.WebtoonContentService;

/**
 *@brief 간략설명
 *@details 세부설명
 *@author 황 규 성
 */
@Controller
@RequestMapping(value="/")
public class HomeController {

	@Autowired
	private final WebtoonContentService webtoonContentService;
	
	public HomeController(WebtoonContentService webtoonContentService) {
		// TODO Auto-generated constructor stub
		this.webtoonContentService = webtoonContentService;
	}
	/** 
	 *@brief 함수 설명
	 *@param 인자값
	 *@return 리턴값
	 */
	@GetMapping("main")
	public String indexPage(Model model) {
		
		model.addAttribute("webtoon", webtoonContentService.webtoonWeekDay());
		return "/main/home";
	}
}
