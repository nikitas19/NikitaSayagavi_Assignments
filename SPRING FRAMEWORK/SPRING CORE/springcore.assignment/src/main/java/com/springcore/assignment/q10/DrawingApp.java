package com.springcore.assignment.q10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp 
{
	public static void main(String[] args) 
	 {
		 	ApplicationContext context = new ClassPathXmlApplicationContext("awarecontext.xml");
		 	Triangle triangle = (Triangle) context.getBean("triangle");
		 	triangle.draw();
		 	
		 	((AbstractApplicationContext) context).close();
	 }
}
