package aware;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class AwareDemo implements BeanNameAware, BeanFactoryAware {
	private String beanName;
	private BeanFactory beanFactory;
	
	@Override
	public void setBeanName(String name) {
		beanName = name;
	}

	@Override
	public void setBeanFactory(BeanFactory bf) throws BeansException {
		beanFactory = bf;
	}

	/**
	 * Demonstruje pouziti beanName a beanFactory
	 */
	public void showInfo() {
		System.out.printf("Nazev komponenty: %s\n", beanName);
		
		Date t = (Date) beanFactory.getBean("initTime");
		
		DateFormat df = (DateFormat)beanFactory.getBean("dateFormat");
		
		System.out.printf("Priblizny cas vytvoreni beanFactory: %s", df.format(t));
	}
	
}
