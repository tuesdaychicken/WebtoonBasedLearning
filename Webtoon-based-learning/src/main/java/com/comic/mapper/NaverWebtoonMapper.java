package com.comic.mapper;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.comic.domain.NaverWebtoonVO;
import com.comic.domain.WebtoonEpisodeVO;

@Mapper
public interface NaverWebtoonMapper {
	
	public List<NaverWebtoonVO> weekSelect();
	
	public List<NaverWebtoonVO> webtoonSelect(NaverWebtoonVO webtoonKey);
	
	public int episodeInsert(WebtoonEpisodeVO episodeVO);
	
	public List<NaverWebtoonVO> episodeSelect(NaverWebtoonVO webtoonKey);
	
	public HashMap<String, String> episodeDetailSelect(Map<String, Integer> episodeKey);
	
	public int episodeUpdate(Map<String, Object> episodeObj);
	
	public int episodeDelete(Map<String, Integer> episodeKey);
	
}
