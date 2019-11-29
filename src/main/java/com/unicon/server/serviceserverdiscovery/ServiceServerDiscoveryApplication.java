package com.unicon.server.serviceserverdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceServerDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceServerDiscoveryApplication.class, args);
	}

}
