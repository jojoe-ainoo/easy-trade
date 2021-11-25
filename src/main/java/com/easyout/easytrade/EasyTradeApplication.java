package com.easyout.easytrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EasyTradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyTradeApplication.class, args);
	}
//
//	@GetMapping("/hello")
//		public String hello() {
//		return "Hello Trade";
//	}
}
