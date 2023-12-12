package com.comic.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import com.comic.domain.NaverMemberVO;

@Mapper
public interface ManageMemberMapper {
	
	public int memberInsert(NaverMemberVO member);
	
	public NaverMemberVO memberSelect(NaverMemberVO member);
	
}
