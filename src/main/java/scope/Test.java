package scope;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Demonstrace platnosti Singleton/Prototype
 * @author Tomas Kozel
 *
 */
public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory f = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(f);
		reader.loadBeanDefinitions(new ClassPathResource("scope/beans.xml"));

		//Singleton
		ScopeDemo ref1 = (ScopeDemo) f.getBean("singleton");
		System.out.printf("ref1 value: %d\n", ref1.getValue());
		ref1.setValue(999);
		ScopeDemo ref2 = (ScopeDemo) f.getBean("singleton");
		System.out.printf("ref2 value: %d\n", ref1.getValue()); //--->999
		System.out.println(ref1==ref2); //--->true
		
		//prototype
		ScopeDemo ref3 = (ScopeDemo) f.getBean("prototype");
		System.out.printf("ref3 value: %d\n", ref3.getValue());
		ref3.setValue(111);
		ScopeDemo ref4 = (ScopeDemo) f.getBean("prototype");
		System.out.printf("ref4 value: %d\n", ref4.getValue()); //--->
		System.out.println(ref3==ref4); //---> false
	}

}
