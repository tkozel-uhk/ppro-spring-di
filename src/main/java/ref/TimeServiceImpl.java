package ref;

import java.text.DateFormat;
import java.util.Date;

/**
 * Implementace casovych sluzeb
 * @author Tomas Kozel
 *
 */
public class TimeServiceImpl implements TimeService {
	private DateFormat dateFormat;
	private DateFormat xxx;
	
	public DateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public DateFormat getTimeFormat() {
		return xxx;
	}

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
