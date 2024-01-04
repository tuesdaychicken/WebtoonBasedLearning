package com.comic.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comic.domain.NaverWebtoonVO;
import com.comic.mapper.ContentRegisterMapper;

import lombok.extern.log4j.Log4j;

@Service("NaverMypageService")
@Log4j
public class ContentRegisterServiceImpl implements ContentRegisterService {
	
	@Autowired
	private final ContentRegisterMapper contentRegisterMapper;
	
	
	
	public ContentRegisterServiceImpl(ContentRegisterMapper contentRegisterMapper) {
		super();
		this.contentRegisterMapper = contentRegisterMapper;
	}

	@Override
	public Map<String, String> detailWebtoonSerch(Map<String, Integer> webtoonKey) {
		// TODO Auto-generated method stub
		return  contentRegisterMapper.webtoonSelect(webtoonKey);
	}
	
	@Override
	public boolean WebtoonRegister(NaverWebtoonVO naverWebtoonVO) {
		// TODO Auto-generated method stub
		log.info("WebtoonRegister"+naverWebtoonVO.toString());
		return (contentRegisterMapper.webtoonWeekInsert(naverWebtoonVO) == 1 ? true:false) 
				/*&& (naverMypageMapper.webtoonGenreInsert(webtoonObj) == 1 ? true:false )*/;
	}

	@Override
	public boolean WebtoonModify(Map<String, Object> webtoonObj) {
		// TODO Auto-generated method stub
		return contentRegisterMapper.webtoonUpdate(webtoonObj) == 1 ? true:false;
	}

	@Override
	public boolean WebtoonRemove(Map<String, Integer> webtoonKey) {
		// TODO Auto-generated method stub
		return (contentRegisterMapper.webtoonDelete(webtoonKey) == 1 ? true:false)
				&& (contentRegisterMapper.webtoonWeekDelete(webtoonKey) == 1 ? true:false)
				&& (contentRegisterMapper.webtoonGenreDelete(webtoonKey) == 1 ? true:false);
	}

	
	
	

}
