package com.comic.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.comic.domain.NaverMemberVO;
import com.comic.mapper.NaverMemberMapper;
import com.comic.security.domain.CustomUser;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
//@RequiredArgsConstructor
//공부를 위해
public class CustomUserDetailsService{

	@Autowired
	private final NaverMemberMapper naverMemberMapper;
	
	public CustomUserDetailsService(NaverMemberMapper mapper) {
		
		this.naverMemberMapper = mapper;
		
	}
	
	
	//@Override
	public UserDetails loadUserByUsername(NaverMemberVO member) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		log.warn("Load User By UserName : "+member);
		
		NaverMemberVO vo = naverMemberMapper.memberSelect(member);
		
		log.warn("queried by member mapper : "+vo);
		
		return vo == null ? null : new CustomUser(vo);
	
	}
	
}
