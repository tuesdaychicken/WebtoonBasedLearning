package org.zerock.security.domain;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.comic.domain.NaverMemberVO;

import lombok.Getter;


@Getter
public class CustomUser extends User{

	private static final long serialVersionUID = 1L;
	
	private NaverMemberVO member;
	
	public CustomUser(String userName, String password, Collection<? extends GrantedAuthority> authorities) {
		// TODO Auto-generated constructor stub
		super(userName, password, authorities);
	}
	
	public CustomUser(NaverMemberVO vo) {
		super(vo.getUserId(), vo.getUserPw(), vo.getAuthList().stream()
				.map(auth -> new SimpleGrantedAuthority(auth.getAuth())).collect(Collectors.toList()));
		
		this.member = vo;
	}
}
