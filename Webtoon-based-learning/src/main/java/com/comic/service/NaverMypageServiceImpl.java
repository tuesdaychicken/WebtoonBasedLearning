package com.comic.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comic.domain.NaverWebtoonVO;
import com.comic.mapper.NaverMypageMapper;

import lombok.extern.log4j.Log4j;

@Service("NaverMypageService")
@Log4j
public class NaverMypageServiceImpl implements NaverMypageService {
	
	@Autowired
	private final NaverMypageMapper naverMypageMapper;
	
	
	
	public NaverMypageServiceImpl(NaverMypageMapper naverMypageMapper) {
		super();
		this.naverMypageMapper = naverMypageMapper;
	}

	@Override
	public Map<String, String> detailWebtoonSerch(Map<String, Integer> webtoonKey) {
		// TODO Auto-generated method stub
		return  naverMypageMapper.webtoonSelect(webtoonKey);
	}
	
	@Override
	public boolean WebtoonRegister(NaverWebtoonVO naverWebtoonVO) {
		// TODO Auto-generated method stub
		log.info("WebtoonRegister"+naverWebtoonVO.toString());
		return (naverMypageMapper.webtoonWeekInsert(naverWebtoonVO) == 1 ? true:false) 
				/*&& (naverMypageMapper.webtoonGenreInsert(webtoonObj) == 1 ? true:false )*/;
	}

	@Override
	public boolean WebtoonModify(Map<String, Object> webtoonObj) {
		// TODO Auto-generated method stub
		return naverMypageMapper.webtoonUpdate(webtoonObj) == 1 ? true:false;
	}

	@Override
	public boolean WebtoonRemove(Map<String, Integer> webtoonKey) {
		// TODO Auto-generated method stub
		return (naverMypageMapper.webtoonDelete(webtoonKey) == 1 ? true:false)
				&& (naverMypageMapper.webtoonWeekDelete(webtoonKey) == 1 ? true:false)
				&& (naverMypageMapper.webtoonGenreDelete(webtoonKey) == 1 ? true:false);
	}

	
	
	

}
