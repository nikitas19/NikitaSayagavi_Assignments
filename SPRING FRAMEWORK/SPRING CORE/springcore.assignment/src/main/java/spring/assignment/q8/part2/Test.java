package spring.assignment.q8.part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.asssignment.q8.LifeCycle;

public class Test {

	public static void main(String[] args) {
		
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/assignment/q8/part2/exampleconfig.xml");
				Example e1 = (Example) context.getBean("e1");
		
			System.out.println(e1);
				context.registerShutdownHook();
		
		
				
		
	}

}
