package com.comic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comic.domain.NaverMemberVO;
import com.comic.mapper.NaverMemberMapper;

@Service("NaverMemberService")
public class NaverMemberServiceImpl implements NaverMemberService {
	
	
	
	@Autowired
	private final NaverMemberMapper naverMemberMapper;
	
	public NaverMemberServiceImpl(NaverMemberMapper naverMemberMapper) {
		this.naverMemberMapper = naverMemberMapper;
	}

	
	
	@Override
	public int MemberRegister(NaverMemberVO member) {
		// TODO Auto-generated method stub
		return naverMemberMapper.memberInsert(member)==1 ? 1 : 0;
	}

	@Override
	public NaverMemberVO MemberLogin(NaverMemberVO userName) {
		// TODO Auto-generated method stub
		return naverMemberMapper.memberSelect(userName);
	}

}
