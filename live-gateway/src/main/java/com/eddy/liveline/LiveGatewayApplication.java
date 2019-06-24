package com.eddy.liveline;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class LiveGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveGatewayApplication.class, args);
	}

}
