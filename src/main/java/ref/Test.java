package ref;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Ukazkova aplikace demonstrujici vzajemne propojeni vice objektu
 * 
 * @author Tomas Kozel, Pavel Kriz
 * 
 */
public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory f = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(f);
		reader.loadBeanDefinitions(new ClassPathResource("ref/beans.xml"));

		TimeConsumer tc = (TimeConsumer) f.getBean("helloBean");
		
		tc.sayHello();
	}
}
