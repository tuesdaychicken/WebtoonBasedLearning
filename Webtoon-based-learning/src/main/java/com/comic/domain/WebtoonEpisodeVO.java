package com.comic.domain;

import java.util.Date;

import lombok.Data;

/* 
CREATE TABLE WEBTOON_EPISODE(
   episode_NUM NUMBER(10),            --에피소드 번호
   episode_TITLE VARCHAR2 (10),      --에피소드 제목
   episode_GRAED NUMBER(4,2),         --에피소드 별점
   episode_LIKE NUMBER(20),         --에피소드 좋아요
   episode_DATE DATE DEFAULT SYSDATE,   --에피소드 등록일
   episode_TEXT VARCHAR2 (400),      --작가의 말
   episode_COVER VARCHAR2 (100),      --에피소드 표지
    episodeCONTENT VARCHAR2 (100),	--에피소드 내용
   webtoon_NUM NUMBER(10)            --웹툰 번호
);
CREATE SEQUENCE W_E_SEQ;
*/

@Data
public class WebtoonEpisodeVO {

	private int episodeNum;
	private String episodeTitle;
	private int episodeGraed;
	private int episodeLike;
	private Date episodeDate;
	private String episodeText;
	private String episodeCover;
	
	
	private int webtoonNum;
}
