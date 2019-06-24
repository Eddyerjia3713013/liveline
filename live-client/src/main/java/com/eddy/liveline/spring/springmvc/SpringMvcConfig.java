/**
 * Copyright (c) 2017 Guangzhou Ourchem Infomation Consulting Co., Ltd.
 */
package com.eddy.liveline.spring.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Function: spring mvc 相关配置. <br/>
 *
 * @author duan cunzhen
 * @date 2017年6月21日 下午4:23:10
 */
@Component
@Configuration
public class SpringMvcConfig extends WebMvcConfigurerAdapter {
    
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 添加 多租户id获取拦截器
		//registry.addInterceptor(new TenantHandlerInterceptor()).addPathPatterns("/**");
//		registry.addInterceptor(new LoginUserHandlerInterceptor()).addPathPatterns("/**");
//		registry.addInterceptor(new SysLoggerInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 添加 静态资源映射目录。
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/static/");
	}
	
	/**
	 * Function: 注册自定义 thymeleaf 方言. <br/>
	 * @return
	 *
	 * @author duan cunzhen
	 * @date 2017年8月23日 下午7:22:13
	 */
//	@Bean
//	public OurchemDialect ourchemDialect(){
//		return new OurchemDialect();
//	}

	@Bean
	public RestTemplate ipmanClient(){
		return new RestTemplate();
	}	
	
//	@Bean
//	public MulitiInstanceCompleteTask mulitiInstance() {
//		return new MulitiInstanceCompleteTask();
//	}
}
