package com.comic.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comic.domain.WebtoonVO;
import com.comic.mapper.ContentRegisterMapper;

@Service("ContentRegisterService")
public class ContentRegisterServiceImpl implements ContentRegisterService {
	
	@Autowired
	private final ContentRegisterMapper contentRegisterMapper;
	
	public ContentRegisterServiceImpl(ContentRegisterMapper contentRegisterMapper) {
		this.contentRegisterMapper = contentRegisterMapper;
	}
	
	@Override
	public boolean WebtoonRegister(WebtoonVO webtoonVO) {
//		log.debug("ContentRegisterServiceImpl WebtoonRegister: {}", webtoonVO);
//		System.out.println("ContentRegisterServiceImpl WebtoonRegister: " + webtoonVO.toString());
		
		contentRegisterMapper.webtoonInsert(webtoonVO);
		contentRegisterMapper.webtoonWeekInsert(webtoonVO);
		//이부분 기능추가가 필요함 이유는 두개의 쿼리를 보내는데 중간에 멈추게 되어 일부분만 올라간다면? 을 고려해야함
		
		return true;
	}

	@Override
	public boolean WebtoonModify(WebtoonVO webtoonVO) {
		// TODO Auto-generated method stub
		return contentRegisterMapper.webtoonUpdate(webtoonVO) == 1 ? true:false;
	}

	@Override
	public boolean WebtoonRemove(Map<String, Integer> webtoonKey) {
		// TODO Auto-generated method stub
		return (contentRegisterMapper.webtoonDelete(webtoonKey) == 1 ? true:false)
				&& (contentRegisterMapper.webtoonWeekDelete(webtoonKey) == 1 ? true:false)
				&& (contentRegisterMapper.webtoonGenreDelete(webtoonKey) == 1 ? true:false);
	}
	

}
