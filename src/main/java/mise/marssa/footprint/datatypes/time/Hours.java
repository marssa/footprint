/**
 * 
 */
package mise.marssa.footprint.datatypes.time;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

/**
 * @author Alan Grech
 * 
 */
@XmlType(name = "Hours", factoryClass = TypeFactory.class, factoryMethod = "getHoursInstance")
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