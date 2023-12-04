위치
com.comic.controller
-CommonController

WEB-INF -> spring
-security-context.xml

servlet-context.xml
28> 
<!-- Security -->
	<security:global-method-security pre-post-annotations="enabled"
	secured-annotations="enabled"/>

web.xml
17>
/WEB-INF/spring/security-context.xml
			<!-- 이부분이 서버가동할 때 xml이 시큐리티 콘텍스트를 찾아가게 연결하는 부분 -->

58>
<!-- 스프링 시큐리티 -->
	<filter>
		<filter-name>springSecurityFilterChain</filter-name>
		<filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
	</filter>

	<filter-mapping>
		<filter-name>springSecurityFilterChain</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>