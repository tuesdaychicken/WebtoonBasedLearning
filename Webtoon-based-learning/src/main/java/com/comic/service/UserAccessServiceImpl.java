package com.comic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comic.domain.MemberVO;
import com.comic.mapper.UserAccessMapper;

@Service("NaverMemberService")
public class UserAccessServiceImpl implements UserAccessService {
	
	
	
	@Autowired
	private final UserAccessMapper userAccessMapper;
	
	public UserAccessServiceImpl(UserAccessMapper userAccessMapper) {
		this.userAccessMapper = userAccessMapper;
	}

	
	
	@Override
	public int MemberRegister(MemberVO member) {
		// TODO Auto-generated method stub
		return userAccessMapper.memberInsert(member)==1 ? 1 : 0;
	}

	@Override
	public MemberVO MemberLogin(MemberVO userName) {
		// TODO Auto-generated method stub
		return userAccessMapper.memberSelect(userName);
	}

}
