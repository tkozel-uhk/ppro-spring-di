package ref;

public class TimeConsumer {
	TimeService timeService;

	public TimeService getTimeService() {
		return timeService;
	}

	public void setTimeService(TimeService timeService) {
		this.timeService = timeService;
	}
	
	public void sayHello() {
		System.out.printf("Dobrý den, dnes je %s a je právě %s.\n",
				timeService.getDateStr(),timeService.getTimeStr());
	}
}
