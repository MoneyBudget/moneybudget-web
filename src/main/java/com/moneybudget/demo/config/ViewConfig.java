package com.moneybudget.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class ViewConfig {
	@Value("${spring.mvc.view.prefix}")
	  private String SPRING_MVC_VIEW_PREFIX;
	
	@Value("${spring.mvc.view.suffix}")
	  private String SPRING_MVC_VIEW_SUFFIX;
	

	@Bean
	public ViewResolver getViewResolver(){
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix(SPRING_MVC_VIEW_PREFIX);
	    resolver.setSuffix(SPRING_MVC_VIEW_SUFFIX);
	    resolver.setViewClass(JstlView.class);
	    return resolver;
	}
}
