package anot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

/**
 * Implementace casovych sluzeb
 * @author Tomas Kozel, Pavel Kriz
 *
 */
@Service("timeService")
public class TimeServiceAnotImpl implements TimeService {
	// vychozi stav, muzeme stale v XML v pripade potreby prekonfigurovat
	private DateFormat dateFormat = new SimpleDateFormat("dd. MMMMM yyyy");
	private DateFormat xxx = new SimpleDateFormat("HH:mm:ss");
	
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
