package com.springcore.asssignment.q8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.asssignment.q8.LifeCycle;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new 
				ClassPathXmlApplicationContext("lifecycleconfig.xml");
				LifeCycle l1 = (LifeCycle)context.getBean("l1");
		
				System.out.println(l1);
				context.registerShutdownHook();
		
	}

}
