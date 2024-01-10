package com.comic.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.comic.domain.WebtoonVO;
import com.comic.service.WebtoonContentService;

/**
 *@brief 에피소드 기능 관련 Controller
 *@details 에피소드 CRUD 기능 service 호출
 *@author 황 규 성
 */
@Controller
@RequestMapping(value="/webtoon")
public class WebtoonContentController {

	@Autowired
	private final WebtoonContentService webtoonContentService;
	
	/** 
	 *@brief 생성자 주입
	 *@param 사용할 메소드가 모여 있는 인터페이스 네이버 웹툰 서비스
	 */
	public WebtoonContentController(WebtoonContentService webtoonContentService) {
		// TODO Auto-generated constructor stub
		this.webtoonContentService = webtoonContentService;
	}
	
	//해당 웹툰 메소드
	@GetMapping("/list")
	public String webtoonList(int webtoonNum, Model model) {
		
//		Map<String, Integer> webtoonKey = Map.of(
//				"webtoonNum", webtoonNum
//			);
		
		WebtoonVO webtoonKey = new WebtoonVO();
		
		webtoonKey.setWebtoonNum(webtoonNum);

		List<WebtoonVO> vo = webtoonContentService.detailWebtoonSerch(webtoonKey);
		
		System.out.println("<WebtoonContentController>"+vo);
		
		model.addAttribute("webtoonVO", webtoonContentService.detailWebtoonSerch(webtoonKey));
		
		model.addAttribute("episode", webtoonContentService.detailEpisodeAllSerch(webtoonKey));
		
		return "/webtoon/webtoon_list";
	}
	
	
	
	@GetMapping("/episode")
	public String episodeNewRegistration(int webtoonNum, Model model) {
		
		model.addAttribute("webtoonNum", webtoonNum);
		
		return "/webtoon/episode_additional";
	}
	
	@PostMapping("/episode")
	public String episodeNewInsert(@RequestParam Map<String, Object> episodeObj) {
		
		episodeObj.put("webtoonNum", Integer.parseInt(String.valueOf(episodeObj.get("webtoonNumObj"))));
		
		//naverWebtoonService.EpisodeRegister(episodeObj);
		
		return "redirect:/webtoon/list?webtoonNum="+episodeObj.get("webtoonNumObj");
	}
	
	@GetMapping("/detail")
	public String webtoonDetailEpisode(int webtoon_NUM,int episode_NUM, Model model) {
		
		Map<String, Integer> episodeKey = Map.of(
					"webtoon_NUM", webtoon_NUM,
					"episode_NUM", episode_NUM
				);
		
		model.addAttribute("episode", webtoonContentService.detailEpisodeSerch(episodeKey));
		
		return "/webtoon/episode_detail";
	}
	
	//수정
	@GetMapping("/episodeModify")
	public String webtoonEpisodeModify(int webtoon_NUM,int episode_NUM, Model model) {
		Map<String, Integer> episodeKey = Map.of(
				"webtoon_NUM", webtoon_NUM,
				"episode_NUM", episode_NUM
			);
	
	model.addAttribute("episode", webtoonContentService.detailEpisodeSerch(episodeKey));
		return "/webtoon/episode_modify";
	}
	
	@PostMapping("/episodeModify")
	public String webtoonEpisodeModify(@RequestParam Map<String, Object> webtoonEpisodeObj) {
		
		webtoonEpisodeObj.put("webtoon_NUM", Integer.parseInt(String.valueOf(webtoonEpisodeObj.get("webtoon_NUMObj"))));
		
		webtoonContentService.EpisodeModify(webtoonEpisodeObj);
		
		return "redirect:/webtoon/list?webtoon_NUM="+webtoonEpisodeObj.get("webtoon_NUMObj");
	}
	
	@GetMapping("/episodeRemove")
	public String webtoonEpisodeRemove(int webtoon_NUM,int episode_NUM, Model model) {
		
		Map<String, Integer> episodeKey = Map.of(
				"webtoon_NUM", webtoon_NUM,
				"episode_NUM", episode_NUM
			);
		
		webtoonContentService.EpisodeRemove(episodeKey);
		
		return "redirect:/webtoon/list?webtoon_NUM="+ webtoon_NUM;
	}
	
	
}
