package com.company.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerEurekaApplication.class, args);
	}
	
	// to test if the config server is working or not 
//	get method 
//	http://localhost:8888/application/default
//	

}
