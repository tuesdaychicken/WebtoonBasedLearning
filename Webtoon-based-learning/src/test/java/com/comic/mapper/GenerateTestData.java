package com.comic.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.comic.domain.WebtoonEpisodeVO;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class GenerateTestData {

	@Autowired
	NaverWebtoonMapper mapper;
	
	
	@Test
	public void EpisodeDataTest() {
		WebtoonEpisodeVO evo = new WebtoonEpisodeVO();
		
		for(int i = 1; i < 11; i++ ) {
			evo.setEpisodeTitle("에피소드 테스트"+i);
			evo.setEpisodeText("에피소드 내용"+i);
			evo.setEpisodeCover("에피소드 커버"+i);
			evo.setWebtoonNum(i);
			log.info(evo);
			mapper.episodeInsert(evo);
		}
	}
}
