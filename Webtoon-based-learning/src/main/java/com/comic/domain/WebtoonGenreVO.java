package com.comic.domain;

import lombok.Data;

/*
 CREATE TABLE WEBTOON_GENRE(
    GENRE_TYPE VARCHAR2(20 CHAR),       --장르 종류
    WEBTOON_TITLE VARCHAR2(20 CHAR),    --웹툰 제목
    WEBTOON_NUM NUMBER(10)              --웹툰 번호
 ); 
 */

@Data
public class WebtoonGenreVO {
	
	private int webtoonNum;
	private String webtoonTitle;
	private String webtoonGenre;
	
	private String webtoonInfo;
}
