package com.comic.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.comic.domain.WebtoonVO;
import com.comic.domain.EpisodeVO;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class GenerateTestData {

	@Autowired
	WebtoonContentMapper nwMapper;
	
	@Autowired
	ContentRegisterMapper nmMapper;
	
	//에피소트 테스트 데이터 생성
	@Test
	public void EpisodeDataTest() {
		EpisodeVO evo = new EpisodeVO();
		
		for(int i = 1; i < 11; i++ ) {
			evo.setEpisodeTitle("에피소드 테스트 "+i);
			evo.setEpisodeText("에피소드 내용 "+i);
			evo.setEpisodeCover("에피소드 커버 "+i);
			evo.setWebtoonNum(i);
			log.info(evo);
			nwMapper.episodeInsert(evo); 
		}
	}
	
	//웹툰 테스트 데이터 생성
	@Test
	public void WebtoonDataTest() {
		WebtoonVO nwVo = new WebtoonVO();
		
		for(int i = 1; i <11; i++) {
			
			nwVo.setWebtoonTitle("웹툰 테스트 "+i);
			nwVo.setWebtoonAge("성인"+i);
			nwVo.setWebtoonInfo("웹툰 설명 "+i);
//			nwVo.setWebtoonCover("웹툰 표지 "+i);
			log.info(nwVo);
			nmMapper.webtoonInsert(nwVo);
			
			log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			log.info("              웹툰 인서트는 성공");
			log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			
			if(i>7) {
				nwVo.setWeekNum((int)(Math.random()*7)+1);
				nmMapper.webtoonWeekInsert(nwVo);
				
			}else{
				nwVo.setWeekNum(i);
				nmMapper.webtoonWeekInsert(nwVo);
			};
			log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			log.info("              요일 인서트는 성공");
			log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}
	}
}
