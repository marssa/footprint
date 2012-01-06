/**
 * 
 */
package mise.marssa.footprint.data_types.time;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
/**
 * @author Alan Grech
 *
 */
public class Hours extends ATime {
	
	public Hours(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		return time * 60 * 60 * 1000;
	}
	@XmlElement(required = true)
	@Override
	public long getSeconds() {
		return time * 60 * 60;
	}

	@Override
	public long getMinutes() {
		return time * 60;
	}
	
	@Override
	public long getHour() {
		return time;
	}
}
