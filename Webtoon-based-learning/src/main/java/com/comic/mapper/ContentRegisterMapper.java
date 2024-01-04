package com.comic.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.comic.domain.NaverWebtoonVO;

@Mapper
public interface ContentRegisterMapper {
	
	public int webtoonInsert(NaverWebtoonVO naverWebtoonVO);
	public int webtoonWeekInsert(NaverWebtoonVO naverWebtoonVO);
	public int webtoonGenreInsert(NaverWebtoonVO naverWebtoonVO);
	
	public Map<String, String> webtoonSelect(Map<String, Integer> webtoonKey);
	
	public int webtoonUpdate(Map<String, Object> webtoonObj);
	
	public int webtoonDelete(Map<String, Integer> webtoonKey);
	public int webtoonWeekDelete(Map<String, Integer> webtoonKey);
	public int webtoonGenreDelete(Map<String, Integer> webtoonKey);
	
}
