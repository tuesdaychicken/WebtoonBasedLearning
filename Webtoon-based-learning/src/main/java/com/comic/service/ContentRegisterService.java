package com.comic.service;

import java.util.Map;

import com.comic.domain.WebtoonVO;



public interface ContentRegisterService {
	
	public boolean WebtoonRegister(WebtoonVO webtoonVO);
	
	public boolean WebtoonModify(WebtoonVO we);
	
	public boolean WebtoonRemove(Map<String, Integer> webtoonKey);
	
	public WebtoonVO detailWebtoonSerch(WebtoonVO webtoonKey);
	
}
