package com.comic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comic.domain.NaverMemberVO;
import com.comic.service.NaverMemberService;


/**
 *@brief 회원기능 관련 Controller
 *@details 회원가입 / 로그인 기능 service 호출
 *@author 황 규 성
 */
@Controller
@RequestMapping(value="/member")
public class NaverMemberController {
	
	@Autowired
	private final NaverMemberService naverMemberService;
	
	public NaverMemberController(NaverMemberService naverMemberService) {
		// TODO Auto-generated constructor stub
		this.naverMemberService = naverMemberService;
	}

	/** 
	 *@brief 회원가입을 위한 Service 호출
	 *@param 
	 *@return 회원가입 정보 입력 페이지로 이동
	 */
	@GetMapping("/join")
	public String naverSignUp(Model model) {
		return "/member/member_join";
	}
	
	/** 
	 *@brief 회원가입 data DB 업로드
	 *@param 회원가입 정보 VO
	 *@return 홈페이지로 이동
	 */
	@PostMapping("/join")
	public String naverSignUp(NaverMemberVO naverMemberVO) {
		System.out.println(naverMemberVO.toString());
		naverMemberService.MemberRegister(naverMemberVO);
		
		return "redirect:/naver/";
	}
	
	/** 
	 *@brief 로그인을 위한 service 호출
	 *@param 
	 *@return 로그인 페이지로 이동
	 */
	@GetMapping("/login")
	public String naverSignIn(Model model) {
		return "/member/member_login";
	}
	
	/** 
	 *@brief 로그인에 필요한 data DB 업로드
	 *@param 로그인 정보 VO
	 *@return 홈페이지로 이동
	 */
	@PostMapping("/login")
	public String naverSignIn(NaverMemberVO naverMemberVO) {
		naverMemberService.MemberLogin(naverMemberVO);
		return "redirect:/naver/";
	}
	
}

