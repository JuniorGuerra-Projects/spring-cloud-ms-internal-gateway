package com.bsoftgroup.springcloudmsinternalgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudMsInternalGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMsInternalGatewayApplication.class, args);
	}

}
