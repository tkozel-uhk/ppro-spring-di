package aware;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Ukazka pouziti xxxAware rozhrani
 * @author Tomas Kozel, Pavel Kriz
 *
 */
public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory f = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(f);
		reader.loadBeanDefinitions(new ClassPathResource("aware/beans.xml"));

		AwareDemo n = (AwareDemo) f.getBean("aDemo");
		
		n.showInfo();
	}

}
