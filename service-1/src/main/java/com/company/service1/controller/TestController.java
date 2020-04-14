/**
 * 
 */
package com.company.service1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anush
 *
 */
@RestController
@RefreshScope
public class TestController {
	
// to test if the config server is working after refresh
//	post method 
//	http://localhost:8080/actuator/refresh

	
	@Value("${example.provider.url: not found !!}")
	private String url;
	
	@GetMapping("/url")
	public String url() {
		return this.url;
	}

}
