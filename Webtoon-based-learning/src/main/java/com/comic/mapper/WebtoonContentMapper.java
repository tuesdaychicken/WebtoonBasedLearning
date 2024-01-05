package com.comic.mapper;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.comic.domain.WebtoonVO;
import com.comic.domain.EpisodeVO;

@Mapper
public interface WebtoonContentMapper {
	
	public List<WebtoonVO> weekSelect();
	
	public List<WebtoonVO> webtoonSelect(WebtoonVO webtoonKey);
	
	public int episodeInsert(EpisodeVO episodeVO);
	
	public List<WebtoonVO> episodeSelect(WebtoonVO webtoonKey);
	
	public HashMap<String, String> episodeDetailSelect(Map<String, Integer> episodeKey);
	
	public int episodeUpdate(Map<String, Object> episodeObj);
	
	public int episodeDelete(Map<String, Integer> episodeKey);
	
}
