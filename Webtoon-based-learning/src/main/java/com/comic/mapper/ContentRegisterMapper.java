package com.comic.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.comic.domain.WebtoonVO;

@Mapper
public interface ContentRegisterMapper {
	
	public int webtoonInsert(WebtoonVO naverWebtoonVO);
	public int webtoonWeekInsert(WebtoonVO naverWebtoonVO);
	public int webtoonGenreInsert(WebtoonVO naverWebtoonVO);
	
	public int webtoonUpdate(WebtoonVO webtoonVO);
	
	public int webtoonDelete(WebtoonVO webtoonNum);
	public int webtoonWeekDelete(WebtoonVO webtoonNum);
	public int webtoonGenreDelete(WebtoonVO webtoonNum);
	
}
