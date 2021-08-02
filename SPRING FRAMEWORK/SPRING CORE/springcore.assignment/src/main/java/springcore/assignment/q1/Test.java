package springcore.assignment.q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springcore/assignment/q1/config.xml");
		Customer c=(Customer) context.getBean("customerref");
		
		System.out.println(c.getCustomerId());
		System.out.println(c.getCustomerName());
		System.out.println(c.getCustomerContact());
		System.out.println(c.getOb());

	}

}
