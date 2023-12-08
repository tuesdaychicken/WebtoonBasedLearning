package com.comic.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.comic.domain.NaverWebtoonVO;
import com.comic.domain.WebtoonEpisodeVO;


public interface NaverWebtoonService {
	
	public List<NaverWebtoonVO> webtoonWeekDay();
	
	public List<NaverWebtoonVO> detailWebtoonSerch(NaverWebtoonVO webtoonKey);
	
	public List<NaverWebtoonVO> detailEpisodeAllSerch(NaverWebtoonVO webtoonKey);

	public boolean EpisodeRegister(WebtoonEpisodeVO episodeVO);
	
	public HashMap<String, String> detailEpisodeSerch(Map<String, Integer> episodeKey);
	
	public boolean EpisodeModify(Map<String, Object> episodeObj);
	
	public boolean EpisodeRemove(Map<String, Integer> episodeObj);

}
