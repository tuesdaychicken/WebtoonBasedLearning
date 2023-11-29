package com.comic.service;


import com.comic.domain.NaverMemberVO;


public interface NaverMemberService {
	
	public int MemberRegister(NaverMemberVO member);
	
	public NaverMemberVO MemberLogin(NaverMemberVO user_NAME);
}
