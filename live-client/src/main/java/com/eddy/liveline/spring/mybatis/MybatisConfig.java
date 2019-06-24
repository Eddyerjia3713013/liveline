/**
 * Copyright (c) 2017 Guangzhou Ourchem Infomation Consulting Co., Ltd.
 */
package com.eddy.liveline.spring.mybatis;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Function: mybatis 相关配置. <br/>
 *
 * @author duan cunzhen
 * @date 2017年6月21日 上午10:23:48
 */
@Configuration
public class MybatisConfig {
	private static final Logger log = LoggerFactory.getLogger(MybatisConfig.class);
	/**
	 * Function: 注册sqlSessionFactory. <br/>
	 * 
	 * @param dataSource
	 * @return
	 * @throws IOException
	 *
	 * @author duan cunzhen
	 * @date 2017年6月21日 上午10:27:20
	 */
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
		// 配置 sqlSessionFactory
		log.info("创建  sqlSessionFactory bean... ....");
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/eddy/liveline/**/*.xml"));
		return sqlSessionFactoryBean;
	}

	/**
	 * 
	 * Function: 注册dataSource.<br/>
	 * @param hikariProperties
	 * @return 
	 *
	 * @author wu.jm
	 * @date 2019年2月12日 下午3:21:04
	 */
	@Bean
	public DataSource dataSource(HikariProperties hikariProperties) {
		log.info("加载 dataSource，jdbc 相关参数... ....");
		HikariDataSource ds = new HikariDataSource(hikariProperties);
		
		log.warn(ds.getJdbcUrl());
		
		return ds;
	}

	/**
	 * Function: 注册事务管理器. <br/>
	 * 
	 * @param dataSource
	 * @return
	 *
	 * @author duan cunzhen
	 * @date 2017年6月21日 上午10:29:08
	 */
	@Bean
	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
		DataSourceTransactionManager dst = new DataSourceTransactionManager();
		dst.setDataSource(dataSource);
		return dst;
	}

	/**
	 * Function: DAO接口所在包名，Spring扫描其下的类，并自动注册为dao/mapper bean. <br/>
	 * 
	 * @return
	 *
	 * @author duan cunzhen
	 * @date 2017年6月21日 上午10:29:29
	 */
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		log.info("创建  mapperScannerConfigurer bean... ....");
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.eddy.liveline.**.dao");
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		return mapperScannerConfigurer;
	}

}
