package com.comic.domain;

import java.util.List;


import lombok.Data;

/*
CREATE TABLE NAVER_MEMBER(
   USER_NUM NUMBER(20),				--유저번호
   USER_ID VARCHAR2(20),			--아이디
   USER_PW VARCHAR2(16),			--패스워드
   USER_NAME VARCHAR2(10 CHAR),		--이름
   USER_BDAY DATE DEFAULT SYSDATE,	--생일
   USER_GENDER VARCHAR2(2 CHAR),	--성별
   USER_PHONE VARCHAR2(30),			--전화번호
   USER_EMAIL VARCHAR2(50),			--이메일
   USER_NICKNAME VARCHAR2(10),		--닉네임
   USER_LEVEL NUMBER (2) DEFAULT 1,	--레벨
   USER_PHOTO VARCHAR2(50)			--사진
);
CREATE SEQUENCE N_M_SEQ;			--멤버 넘버
*/

@Data
public class MemberVO {
	private int userNum;
	
	private String userId;
	private String userPw;
	
	private String userName;
	private Integer userYY;
	private Integer userMM;
	private Integer userDD;
	private String userPhone;
	private String userGender;
	private String userEmail;
	private String userNickname;
	private String userLevel;
	private String userPhoto;
	
	private List<NaverAuthVO> authList;
	 
}
