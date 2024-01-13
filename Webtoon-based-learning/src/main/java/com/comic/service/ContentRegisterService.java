package com.comic.service;

import com.comic.domain.WebtoonVO;



public interface ContentRegisterService {
	
	public boolean WebtoonRegister(WebtoonVO webtoonVO);
	
	public boolean WebtoonModify(WebtoonVO we);
	
	public boolean WebtoonRemove(WebtoonVO webtoonNum);
	
	
	
}
