package com.example.spring;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService);
		System.out.println(userService.get());

//		userService.save();
	}

}
