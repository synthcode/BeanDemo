package com.qa.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestBean {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TestBean.class, args);
		
		Object byName = context.getBean("timeNow");
		String byType = context.getBean(String.class);
		String byBoth = context.getBean("timeNow", String.class);
		
		System.out.println("byName " + byName);
		System.out.println("byType " + byType);
		System.out.println("byBoth " + byBoth);
	}
}