package anot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("helloBean")
public class TimeConsumerAnot {
	TimeService timeService;

	public TimeService getTimeService() {
		return timeService;
	}

	@Autowired
	// nechceme-li riskovat, ze se vyskytne vice implementaci (bean) TimeService
	// v danem kontejneru (kontextu), muzeme specifikovat, ktera konkretni beana
	// se ma pouzit:
	@Qualifier("timeService")
	public void setTimeService(TimeService timeService) {
		this.timeService = timeService;
	}
	
	public void sayHello() {
		System.out.printf("Dobrý den, dnes je %s a je právě %s.\n",
				timeService.getDateStr(),timeService.getTimeStr());
	}
}
