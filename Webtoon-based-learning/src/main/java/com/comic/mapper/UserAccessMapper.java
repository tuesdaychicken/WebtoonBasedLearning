package com.comic.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import com.comic.domain.MemberVO;

@Mapper
public interface UserAccessMapper {
	//로그인 기능에 필요한 부분 수정 필요함
	public int memberInsert(MemberVO member);
	
	public MemberVO memberSelect(MemberVO member);
	
}
