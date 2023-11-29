package com.comic.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comic.domain.NaverWebtoonVO;
import com.comic.mapper.NaverWebtoonMapper;

@Service("NaverWebtoonService")
public class NaverWebtoonServiceImpl implements NaverWebtoonService {

	@Autowired
	private final NaverWebtoonMapper naverWebtoonMapper;
	
	public NaverWebtoonServiceImpl(NaverWebtoonMapper naverWebtoonMapper) {
		// TODO Auto-generated constructor stub
		this.naverWebtoonMapper = naverWebtoonMapper;
	}
	
	@Override
	public List<NaverWebtoonVO> webtoonweek_DAY() {
		// TODO Auto-generated method stub
		return naverWebtoonMapper.weekSelect();
	}

	@Override
	public HashMap<String, String> detailWebtoonSerch(Map<String, Integer> webtoonKey) {
		// TODO Auto-generated method stub
		return  naverWebtoonMapper.webtoonSelect(webtoonKey);
	}

	@Override
	public boolean EpisodeRegister(Map<String, Object> episodeObj) {
		// TODO Auto-generated method stub
		return naverWebtoonMapper.episodeInsert(episodeObj) == 1 ? true:false;
	}

	@Override
	public List<HashMap<String, String>> detailEpisodeAllSerch(Map<String, Integer> webtoonKey) {
		// TODO Auto-generated method stub
		return naverWebtoonMapper.episodeSelect(webtoonKey);
	}

	@Override
	public HashMap<String, String> detailEpisodeSerch(Map<String, Integer> episodeKey) {
		// TODO Auto-generated method stub
		return naverWebtoonMapper.episodeDetailSelect(episodeKey);
	}

	@Override
	public boolean EpisodeModify(Map<String, Object> episodeObj) {
		// TODO Auto-generated method stub
		return naverWebtoonMapper.episodeUpdate(episodeObj) == 1 ? true:false;
	}

	@Override
	public boolean EpisodeRemove(Map<String, Integer> episodeObj) {
		// TODO Auto-generated method stub
		return naverWebtoonMapper.episodeDelete(episodeObj) == 1 ? true:false;
	}
	
}
