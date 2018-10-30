package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("Spring Context initialized");

		// MyEmployeeService service = ctx.getBean("myEmployeeService",
		// MyEmployeeService.class);
		MyEmployeeService service = ctx.getBean("myEmployeeService", MyEmployeeService.class);

		

		

		ctx.close();
		System.out.println("Spring Context Closed");
	}

}