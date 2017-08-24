package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 实现 /ribbon-consumer接口
 * 在这里 将使用 RestTemplate 来实现对Hello-server服务提供者提供的/hello
 *接口的调用
 * @author Administrator
 *
 */
@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/ribbon-consumer")
	public String helloConsumer(){
		return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
	}
}
