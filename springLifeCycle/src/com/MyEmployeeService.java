package com;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyEmployeeService implements InitializingBean, DisposableBean {

	

	public MyEmployeeService() {
		System.out.println("MyEmployeeService no-args constructor called");
	}

	// post-init method
	public void init1() throws Exception {
		System.out.println("MyEmployeeService initializing to dummy value");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("EmployeeService Closing resources");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("EmployeeService initializing to dummy value");
		
	}

	@PostConstruct
	public void init() {
		System.out.println("MyService init method called");
	}

	
}
