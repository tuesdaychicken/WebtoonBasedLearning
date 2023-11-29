package com.comic.mapper;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.comic.domain.NaverWebtoonVO;

@Mapper
public interface NaverWebtoonMapper {
	
	public List<NaverWebtoonVO> weekSelect();
	
	public HashMap<String, String> webtoonSelect(Map<String, Integer> webtoonKey);
	
	public int episodeInsert(Map<String, Object> episodeObj);
	
	public List<HashMap<String, String>> episodeSelect(Map<String, Integer> webtoonKey);
	
	public HashMap<String, String> episodeDetailSelect(Map<String, Integer> episodeKey);
	
	public int episodeUpdate(Map<String, Object> episodeObj);
	
	public int episodeDelete(Map<String, Integer> episodeKey);
}
