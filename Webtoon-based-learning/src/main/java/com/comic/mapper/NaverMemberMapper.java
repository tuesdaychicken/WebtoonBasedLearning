package com.comic.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.comic.domain.NaverMemberVO;

@Mapper
public interface NaverMemberMapper {
	
	public int memberInsert(NaverMemberVO member);
	
	public NaverMemberVO memberSelect(NaverMemberVO member);
	
}
