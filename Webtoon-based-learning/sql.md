COMMIT;
--------------------------------------------------------------------------------

DROP TABLE NAVER_MEMBER;
DROP SEQUENCE N_M_SEQ;

DROP TABLE NAVER_WEBTOON;
DROP SEQUENCE N_W_SEQ;

DROP TABLE WEBTOON_EPISODE;
DROP SEQUENCE W_E_SEQ;

DROP TABLE WEBTOON_STATE;
DROP TABLE WEBTOON_WEEK;
DROP TABLE WEBTOON_GENRE;
DROP TABLE WEBTOON_WRITER;


--------------------------------------------------------------------------------

CREATE TABLE NAVER_MEMBER(
   userNUM NUMBER(20),            --유저번호
   user_ID VARCHAR2(20),         --아이디
   user_PW VARCHAR2(16),         --패스워드
   user_NAME VARCHAR2(10 CHAR),      --이름
   userBDAY DATE DEFAULT SYSDATE,   --생일
   user_GENDER VARCHAR2(2 CHAR),   --성별
   user_PHONE VARCHAR2(30),         --전화번호
   user_EMAIL VARCHAR2(50),         --이메일
   user_NICKNAME VARCHAR2(10),      --닉네임
   user_LEVEL NUMBER (2) DEFAULT 1,   --레벨
   user_PHOTO VARCHAR2(50)         --사진
);
CREATE SEQUENCE N_M_SEQ;         --멤버 넘버

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


CREATE TABLE WEBTOON_EPISODE(
   episode_NUM NUMBER(10),            --에피소드 번호
   episode_TITLE VARCHAR2 (100 CHAR),      --에피소드 제목
   episode_GRAED NUMBER(4,2),         --에피소드 별점
   episode_LIKE NUMBER(20),         --에피소드 좋아요
   episode_DATE DATE DEFAULT SYSDATE,   --에피소드 등록일
   episode_TEXT VARCHAR2 (400 CHAR),      --작가의 말
   episode_COVER VARCHAR2 (100),      --에피소드 표지
   episodeCONTENT VARCHAR2 (100),   --에피소드 내용
   webtoon_NUM NUMBER(10)            --웹툰 번호
);
CREATE SEQUENCE W_E_SEQ;


--상태
CREATE TABLE WEBTOON_STATE(
   stateNUM NUMBER(10),            --상태 번호
   stateNEW VARCHAR2(10),         --신작
   stateADULT VARCHAR2(10),         --성인
   statePAUSE VARCHAR2(10),         --휴재
   webtoon_NUM NUMBER(10)            --웹툰 번호
);


--요일
CREATE TABLE WEBTOON_WEEK(
   week_DAY VARCHAR2(3 CHAR),                    --요일 
   webtoon_TITLE VARCHAR2(20 CHAR),            --웹툰 제목
   webtoon_NUM NUMBER(10)                      --웹툰 번호
);


--장르
CREATE TABLE WEBTOON_GENRE(
    genreTYPE VARCHAR2(20 CHAR),       --장르 종류
    webtoon_TITLE VARCHAR2(20 CHAR),    --웹툰 제목
    webtoon_NUM NUMBER(10)              --웹툰 번호
 );
 

--작가
CREATE TABLE WEBTOON_WRITER(
   userNUM NUMBER(20),         --유저 번호
   writerNAME VARCHAR2 (40),      --작가 이름
   webtoon_NUM NUMBER(10)         --웹툰 번호
);























