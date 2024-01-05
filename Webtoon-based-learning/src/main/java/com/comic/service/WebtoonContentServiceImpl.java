package com.comic.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comic.domain.WebtoonVO;
import com.comic.domain.EpisodeVO;
import com.comic.mapper.WebtoonContentMapper;

@Service("NaverWebtoonService")
public class WebtoonContentServiceImpl implements WebtoonContentService {

	@Autowired
	private final WebtoonContentMapper webtoonContentMapper;
	
	public WebtoonContentServiceImpl(WebtoonContentMapper webtoonContentMapper) {
		// TODO Auto-generated constructor stub
		this.webtoonContentMapper = webtoonContentMapper;
	}
	
	@Override
	public List<WebtoonVO> webtoonWeekDay() {
		// TODO Auto-generated method stub
		return webtoonContentMapper.weekSelect();
	}

	@Override
	public List<WebtoonVO> detailWebtoonSerch(WebtoonVO webtoonKey) {
		// TODO Auto-generated method stub
		return  webtoonContentMapper.webtoonSelect(webtoonKey);
	}

	@Override
	public boolean EpisodeRegister(EpisodeVO episodeVO) {
		// TODO Auto-generated method stub
		return webtoonContentMapper.episodeInsert(episodeVO) == 1 ? true:false;
	}

	@Override
	public List<WebtoonVO> detailEpisodeAllSerch(WebtoonVO webtoonKey) {
		// TODO Auto-generated method stub
		return webtoonContentMapper.episodeSelect(webtoonKey);
	}

	@Override
	public HashMap<String, String> detailEpisodeSerch(Map<String, Integer> episodeKey) {
		// TODO Auto-generated method stub
		return webtoonContentMapper.episodeDetailSelect(episodeKey);
	}

	@Override
	public boolean EpisodeModify(Map<String, Object> episodeObj) {
		// TODO Auto-generated method stub
		return webtoonContentMapper.episodeUpdate(episodeObj) == 1 ? true:false;
	}

	@Override
	public boolean EpisodeRemove(Map<String, Integer> episodeObj) {
		// TODO Auto-generated method stub
		return webtoonContentMapper.episodeDelete(episodeObj) == 1 ? true:false;
	}
	
}
