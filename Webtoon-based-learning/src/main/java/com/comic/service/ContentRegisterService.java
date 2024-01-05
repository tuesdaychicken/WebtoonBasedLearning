package com.comic.service;

import java.util.Map;

import com.comic.domain.WebtoonVO;



public interface ContentRegisterService {
	
	public boolean WebtoonRegister(WebtoonVO webtoonVO);
	
	public boolean WebtoonModify(Map<String, Object> webtoonObj);
	
	public boolean WebtoonRemove(Map<String, Integer> webtoonKey);
	
	public Map<String, String> detailWebtoonSerch(Map<String, Integer> webtoonKey);
	
}
