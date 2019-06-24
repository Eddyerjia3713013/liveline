package com.eddy.liveline.spring.mybatis;

import com.zaxxer.hikari.HikariConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("hikariProperties")
@ConfigurationProperties(prefix = "hikari")
public class HikariProperties extends HikariConfig {

}
