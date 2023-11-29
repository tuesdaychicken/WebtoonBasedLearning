package com.comic.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.comic.domain.NaverWebtoonVO;


public interface NaverWebtoonService {
	
	public List<NaverWebtoonVO> webtoonweek_DAY();
	
	public HashMap<String, String> detailWebtoonSerch(Map<String, Integer> webtoonKey);
	
	public boolean EpisodeRegister(Map<String, Object> episodeObj);
	
	public List<HashMap<String, String>> detailEpisodeAllSerch(Map<String, Integer> webtoonKey);
	
	public HashMap<String, String> detailEpisodeSerch(Map<String, Integer> episodeKey);
	
	public boolean EpisodeModify(Map<String, Object> episodeObj);
	
	public boolean EpisodeRemove(Map<String, Integer> episodeObj);
}
