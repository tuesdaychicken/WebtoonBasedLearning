package com.comic.domain;


import lombok.Data;

/*
CREATE TABLE NAVER_WEBTOON(
   webtoon_NUM NUMBER(10) PRIMARY KEY NOT NULL,   --웹툰 번호
   webtoon_TITLE VARCHAR2(20 CHAR),            --웹툰 제목
   webtoon_AGE VARCHAR2(10 CHAR),               --연령
   webtoon_INFO VARCHAR2(100 CHAR),            --소개
   webtoon_GPA NUMBER(4,2),                  --평점
   webtoon_LIKE NUMBER(20),                  --좋아요
   webtoon_COVER VARCHAR2(100),                --표지
   webtoon_INTRD_COVER VARCHAR2(100),             --디테일 표지
   webtoonDATE DATE DEFAULT SYSDATE   --웹툰 등록일 등록일
);
CREATE SEQUENCE N_W_SEQ;


--요일
CREATE TABLE WEBTOON_WEEK(
   week_DAY VARCHAR2(3 CHAR),                 	--요일 
   webtoon_TITLE VARCHAR2(20 CHAR),            --웹툰 제목
   webtoon_NUM NUMBER(10)                      --웹툰 번호
);


CREATE TABLE WEBTOON_GENRE(
    genreTYPE VARCHAR2(20 CHAR),       --장르 종류
    webtoon_TITLE VARCHAR2(20 CHAR),    --웹툰 제목
    webtoon_NUM NUMBER(10)              --웹툰 번호
 );

	*/

@Data
public class NaverWebtoonVO {
	
	//웹툰 기본키
	private int WEBTOON_NUM;
	
	//웹툰 정보
	private String WEBTOON_TITLE;
	private String webtoonAge;
	private String webtoonInfo;
	private int webtoonGpa;
	private int webtoonLike;
	private String WEBTOON_CORVER;
	private String webtoonIntrdCover;
	
	//다른 테이블 연결?
	private String WEEK_DAY;
	
	//private String genreType;
}
