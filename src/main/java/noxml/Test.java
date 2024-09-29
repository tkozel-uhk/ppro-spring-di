package noxml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		BeanFactory f = new AnnotationConfigApplicationContext(SpringBeansConfig.class);
		TimeConsumerAnot tc = (TimeConsumerAnot) f.getBean("helloBean");
	            
		tc.sayHello();
	}
	
	
}
