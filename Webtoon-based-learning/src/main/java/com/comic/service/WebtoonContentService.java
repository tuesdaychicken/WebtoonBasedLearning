package com.comic.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.comic.domain.WebtoonVO;
import com.comic.domain.EpisodeVO;


public interface WebtoonContentService {
	
	public List<WebtoonVO> webtoonWeekDay();
	
	public List<WebtoonVO> detailWebtoonSerch(WebtoonVO webtoonKey);
	
	public List<WebtoonVO> detailEpisodeAllSerch(WebtoonVO webtoonKey);

	public boolean EpisodeRegister(EpisodeVO episodeVO);
	
	public HashMap<String, String> detailEpisodeSerch(Map<String, Integer> episodeKey);
	
	public boolean EpisodeModify(Map<String, Object> episodeObj);
	
	public boolean EpisodeRemove(Map<String, Integer> episodeObj);

}
