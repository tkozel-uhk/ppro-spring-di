package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Trida implementujici rozhrani s inicializacni callback metodou
 * a rozhrani s rusici callback metodou
 * @author Tomas Kozel
 *
 */
public class InitializingDisposableBean 
	implements InitializingBean, DisposableBean {
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("IDInterface: Jsem v metode 'afterPropertiesSet()'");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("IDInterface: Jsem v metode 'destroy()'");
	}
	
	public void pracuj() {
		System.out.println("IDInterface: Pracuji");
	}
}
