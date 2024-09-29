package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demonstrace rizeni zivotniho cyklu komponenty
 * @author Tomas Kozel
 *
 */
public class Test {
	
	public static void main(String[] args) {
		//Pro ukazku zde pouzijeme kontext misto BeanFactory (zde muze byt oboji)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycle/beans.xml");
		
		InitDestroyMethodBean idMethod = 
			(InitDestroyMethodBean) ctx.getBean("initDestroyMethodBean");
		
		idMethod.pracuj();
		
		InitializingDisposableBean idCallback = 
			(InitializingDisposableBean) ctx.getBean("initializingDisposableBean");

		idCallback.pracuj();

		((ClassPathXmlApplicationContext)ctx).close();
	}
	
}
