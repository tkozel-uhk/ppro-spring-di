package noxml;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Konfigurace springovskych bean (application contextu) pomoci Java kodu, nez XML.
 * 
 * Anotace @ComponentScan zajisti, ze se Spring bude vyhledavat beany 
 * deklarovane pomoci anotaci @Service, @Component, atd. v tomto balicku
 * (a pod-baliccich).
 *     
 * Zaroven ve svem vychozim nastaveni aktivuje annotation-config,
 * tj. aktivuje anotace uvnitr komponent, jako napr. @Autowired.
 * I bez @ComponentScan mohou anotace @Autowired uvnitr bean fungovat, 
 * nebo nad beanami definovanymi pomoci @Bean se take provadi auto-wiring.
 * 
 * @PropertySource umoznuje dotahnout nektere hodnoty z externiho souboru.
 * Pomoci @Value se tyto hodnoty nekam injektuji (pripadne vcetne vychozi hodnoty).
 * 
 * @author Pavel Kriz
 *
 */

@Configuration
@ComponentScan
@PropertySource("classpath:/noxml/config.properties")
public class SpringBeansConfig {
	
	@Value("${dateFormat:dd.MM.yy}")
	private String dateFormat;

	@Value("${timeFormat:HH:mm}")
	private String timeFormat;

	@Bean
	DateFormat dateFormat() {
		return new SimpleDateFormat(dateFormat);
	}

	@Bean
	DateFormat timeFormat() {
		return new SimpleDateFormat(timeFormat);
	}

// Nasledujici kod by "rucne" definoval beany. Ma smysl v pripade, 
// ze bychom vypnuli @ComponentScan a tim padem i annotation-config.
// Pripadne kdybychom nemeli tridy TimeConsumerAnot a TimerServiceAnotImple
// anotovane pomoci @Component resp. @Service. 
//
// Tento pristup se pouziva hlavne pro beany, ktere nemuzeme definovat uvnitr jejich trid,
// tedy typicky pro tridy z knihoven a/nebo "vnitrnosti" Springu. Viz vyse beany pro format
// datumu a casu.	
	
//	@Bean
//	TimeConsumerAnot helloBean() {
//		return new TimeConsumerAnot();
//	}
//	
//	@Bean
//	TimeService timeService() {
//		return new TimeServiceAnotImpl();
//	}
	
}
