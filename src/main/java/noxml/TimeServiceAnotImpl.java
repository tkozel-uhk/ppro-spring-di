package noxml;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Implementace casovych sluzeb
 * @author Tomas Kozel, Pavel Kriz
 *
 */
@Service("timeService")
public class TimeServiceAnotImpl implements TimeService {
	private DateFormat dateFormat;
	private DateFormat xxx;
	
	public DateFormat getDateFormat() {
		return dateFormat;
	}

	@Autowired
	@Qualifier("dateFormat")
	public void setDateFormat(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public DateFormat getTimeFormat() {
		return xxx;
	}

	@Autowired
	@Qualifier("timeFormat")
	public void setTimeFormat(DateFormat timeFormat) {
		this.xxx = timeFormat;
	}

	@Override
	public String getDateStr() {
		return dateFormat.format(new Date());
	}

	@Override
	public String getTimeStr() {
		return xxx.format(new Date());
	}

}
