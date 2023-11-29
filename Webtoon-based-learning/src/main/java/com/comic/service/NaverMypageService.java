package com.comic.service;

import java.util.Map;



public interface NaverMypageService {
	
	public boolean WebtoonRegister(Map<String, String> webtoonObj);
	
	public boolean WebtoonModify(Map<String, Object> webtoonObj);
	
	public boolean WebtoonRemove(Map<String, Integer> webtoonKey);
	
	public Map<String, String> detailWebtoonSerch(Map<String, Integer> webtoonKey);
	
}
