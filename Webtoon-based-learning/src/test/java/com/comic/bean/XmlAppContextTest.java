package com.comic.bean;


import static org.assertj.core.api.Assertions.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.comic.service.NaverWebtoonService;
import com.comic.service.NaverWebtoonServiceImpl;

import lombok.Setter;


@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/security-context.xml"})
public class XmlAppContextTest {
	
	

	GenericXmlApplicationContext ac = new GenericXmlApplicationContext("file:/Users/SKYPC183/git/WebtoonBasedLearning/Webtoon-based-learning/src/main/webapp/WEB-INF/spring/root-context.xml");
											
	
	@Test
	public void beanTest() {
		
		NaverWebtoonService service = ac.getBean("naverWebtoonService",NaverWebtoonService.class);
		assertThat(service).isInstanceOf(NaverWebtoonServiceImpl.class);
	}
	
	@Test
	public void beanTest2() {
		String[] beanName = ac.getBeanDefinitionNames();
		System.out.println(beanName.length);
		for (String beanDefinName : beanName) {
			Object bean = ac.getBean(beanDefinName);
			System.out.println("beanDefinName" + beanDefinName + ", object " + bean);
		}
	}
}
