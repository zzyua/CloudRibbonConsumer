package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.boot.service.HelloService;

/**
 * 实现 /ribbon-consumer接口
 * 在这里 将使用 RestTemplate 来实现对Hello-server服务提供者提供的/hello
 *接口的调用
 * @author Administrator
 *
 */
@RestController

public class ConsumerController {

	//第一版， 直接测试调用
	/*@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/ribbon-consumer")
	public String helloConsumer(){
		return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
	}*/
	
	
	//调用helloservice
	@Autowired
	HelloService helloService;
	
	
	@GetMapping("/ribbon-consumer")
	public String helloConsumer() {
		return helloService.helloService();
	}
	
}








