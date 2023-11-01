package elixml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
	Mobile mobile=applicationContext.getBean("mobile",Mobile.class);

	
	System.out.println(mobile);
}
}
