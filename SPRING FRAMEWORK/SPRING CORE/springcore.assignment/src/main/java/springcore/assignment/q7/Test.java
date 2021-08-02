package springcore.assignment.q7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("springcore/assignment/q7/sconfig.xml");
		SpelDemo speldemo = (SpelDemo) context.getBean("speldemo",SpelDemo.class);
		System.out.println(speldemo);
	}

}

