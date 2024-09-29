package di;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Ukazka prace s beany 
 * @author Tomas Kozel, Pavel Kriz
 *
 */
public class Test {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory f = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(f);
		reader.loadBeanDefinitions(new ClassPathResource("di/beans.xml"));
		
		Item it1 = (Item) f.getBean("firstItem"); 
		Item it2 = (Item) f.getBean("secondItem"); 
		Item it3 = (Item) f.getBean("thirdItem"); 
		
		Item siItem = (Item) f.getBean("seterInjItem"); 
		
		System.out.println(it1.toString());
		System.out.println(it2.toString());
		System.out.println(it3.toString());
		System.out.println(siItem.toString());
	}
	
}
