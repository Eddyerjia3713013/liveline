package com.eddy.liveline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//@MapperScan(basePackages = {"com.eddy.liveline"})
@ComponentScan(basePackages = {"com.eddy.liveline"})
@EnableFeignClients
@SpringCloudApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class LiveClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveClientApplication.class, args);
	}


}
