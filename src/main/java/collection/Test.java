package collection;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Ukazka prace s DI kolekcemi 
 * @author Tomas Kozel, Pavel Kriz
 *
 */
public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory f = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(f);
		reader.loadBeanDefinitions(new ClassPathResource("collection/beans.xml"));

		MessageProvider prov = (MessageProvider) f.getBean("messageProvider");
		
		prov.printAllMessages();
	}
}
