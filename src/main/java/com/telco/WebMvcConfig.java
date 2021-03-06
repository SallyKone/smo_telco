package com.telco;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;



@SuppressWarnings("deprecation")
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	@Bean
	public ViewResolver viewResolver() {
		ThymeleafViewResolver viewResolver= new ThymeleafViewResolver();
		viewResolver.setTemplateEngine((ISpringTemplateEngine) templateEngine());
		return viewResolver;
		
	}
	@Bean
	public TemplateEngine templateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver());
		return templateEngine;
	}
	
	private ITemplateResolver templateResolver() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setTemplateMode(TemplateMode.HTML);
		templateResolver.setCharacterEncoding("UTF-8");
		templateResolver.setCacheable(false);
		templateResolver.setPrefix("classpath:/templates/");
		templateResolver.setSuffix(".html");
		return templateResolver;
		
	} 

}

