package com.comic.service;


import com.comic.domain.MemberVO;


public interface UserAccessService {
	
	public int MemberRegister(MemberVO member);
	
	public MemberVO MemberLogin(MemberVO user_NAME);
}
