package com.wangzi.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryEurekaServer {

	public static void main(String[] args) {
		//new SpringApplicationBuilder(RegistryEurekaServer.class).web(true).run(args);
		SpringApplication.run(RegistryEurekaServer.class, args);
	}

}
