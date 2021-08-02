package springcore.assignment.q9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Driver class
public class Test {

public static void main(String[] args) throws Exception{
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springcore/assignment/q9/bconfig.xml");

	 context.close();
	}
}
