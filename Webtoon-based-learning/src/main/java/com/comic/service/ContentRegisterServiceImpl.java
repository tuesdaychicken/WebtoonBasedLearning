package com.comic.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comic.domain.WebtoonVO;
import com.comic.mapper.ContentRegisterMapper;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Service("ContentRegisterService")
@Slf4j
public class ContentRegisterServiceImpl implements ContentRegisterService {
	
	@Autowired
	private final ContentRegisterMapper contentRegisterMapper;
	
	public ContentRegisterServiceImpl(ContentRegisterMapper contentRegisterMapper) {
		this.contentRegisterMapper = contentRegisterMapper;
	}

	@Override
	public Map<String, String> detailWebtoonSerch(Map<String, Integer> webtoonKey) {
		// TODO Auto-generated method stub
		return  contentRegisterMapper.webtoonSelect(webtoonKey);
	}
	
	@Override
	public boolean WebtoonRegister(WebtoonVO webtoonVO) {
		log.debug("ContentRegisterServiceImpl WebtoonRegister: {}", webtoonVO);
		System.out.println("ContentRegisterServiceImpl WebtoonRegister: " + webtoonVO.toString());
		
		contentRegisterMapper.webtoonInsert(webtoonVO);
		contentRegisterMapper.webtoonWeekInsert(webtoonVO);
		
		return true;
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
