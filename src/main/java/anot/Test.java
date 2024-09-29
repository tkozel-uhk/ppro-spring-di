package anot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		BeanFactory f = new ClassPathXmlApplicationContext("anot/beans.xml");
		
		TimeConsumerAnot tc = (TimeConsumerAnot) f.getBean("helloBean");
	            
		tc.sayHello();
	}
	
	
}
