package com.comic.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.comic.domain.NaverWebtoonVO;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class naverMypageMapperTest {
	
	
	
	//NaverMypageMapper mapper = ac.getBean("naverMypageMapper", NaverMypageMapper.class);
	@Autowired
	NaverMypageMapper mapper;
	

	ObjectMapper objectMapper = new ObjectMapper();
	
	@Test
	public void testWeXbtoonInsert() {
		NaverWebtoonVO vo = new NaverWebtoonVO();
		
		System.out.println("나는@@@@@@@"+mapper);
		
		//Map<String, String> vo = new HashMap<String, String> ();
		//vo.put("seq","3");
		//vo.put("webtoonTitle","네네");
		//vo.put("webtoonAge","15");
		//vo.put("webtoonInfo","51");
		//vo.put("webtoonCover","51");
		//vo.put("webtoonIntrdCover","51");
		
		//vo.setWebtoonTitle("나는 문어");
		vo.setWebtoonAge("5");
		vo.setWebtoonInfo("문어 난 문어");
		//vo.setWebtoonCover("sad");
		vo.setWebtoonIntrdCover("sd");
		
		log.info(vo);
		//맵으로 변환 헤쉬맵으로
		
		
		mapper.webtoonInsert(vo);
		
//		System.out.println(judgment);
		//assertThat(mapper).isNotNull();
	}
	
//	@Test
//	public void testWebtoonSel
}
