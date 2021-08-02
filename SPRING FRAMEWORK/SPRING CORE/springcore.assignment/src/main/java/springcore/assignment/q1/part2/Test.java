package springcore.assignment.q1.part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springcore/assignment/q1/part2/cconfig.xml");
		Customer c=(Customer) context.getBean("customer1");
		System.out.println(c);
		

	}

}
