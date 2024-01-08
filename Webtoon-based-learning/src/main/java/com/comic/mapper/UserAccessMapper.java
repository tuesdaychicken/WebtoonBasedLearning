package com.comic.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import com.comic.domain.MemberVO;

@Mapper
public interface UserAccessMapper {
	public int memberInsert(MemberVO member);
	
	public MemberVO memberSelect(MemberVO member);
	
}
