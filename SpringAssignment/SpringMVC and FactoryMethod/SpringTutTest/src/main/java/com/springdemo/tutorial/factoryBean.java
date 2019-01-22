package com.springdemo.tutorial;

public class factoryBean {

	private static final factoryBean obj = new factoryBean();

	private factoryBean() {
		System.out.println("private constructor cannot be accessed");
	}

	public static factoryBean getfactoryBean() {
		System.out.println("factory method returning object");
		return obj;
	}

	public void msg() {
		System.out.println("function says hello");
		System.out.println("-------------------------------------------");
		System.out.println(" ");
	}

}
