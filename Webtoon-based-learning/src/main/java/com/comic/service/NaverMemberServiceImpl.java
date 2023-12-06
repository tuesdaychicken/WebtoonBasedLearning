package com.comic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comic.domain.NaverMemberVO;
import com.comic.mapper.MyMemberMapper;

@Service("NaverMemberService")
public class NaverMemberServiceImpl implements NaverMemberService {
	
	
	
	@Autowired
	private final MyMemberMapper naverMemberMapper;
	
	public NaverMemberServiceImpl(MyMemberMapper naverMemberMapper) {
		this.naverMemberMapper = naverMemberMapper;
	}

	
	
	@Override
	public int MemberRegister(NaverMemberVO member) {
		// TODO Auto-generated method stub
		return naverMemberMapper.memberInsert(member)==1 ? 1 : 0;
	}

	@Override
	public NaverMemberVO MemberLogin(NaverMemberVO user_NAME) {
		// TODO Auto-generated method stub
		return naverMemberMapper.memberSelect(user_NAME);
	}

}
