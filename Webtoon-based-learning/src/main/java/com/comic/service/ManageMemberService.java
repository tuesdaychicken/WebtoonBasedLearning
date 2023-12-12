package com.comic.service;


import com.comic.domain.NaverMemberVO;


public interface ManageMemberService {
	
	public int MemberRegister(NaverMemberVO member);
	
	public NaverMemberVO MemberLogin(NaverMemberVO user_NAME);
}
