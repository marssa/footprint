/**
 * 
 */
package mise.marssa.footprint.datatypes.time;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;



/**
 * @author Alan Grech
 *
 */
@XmlType(name = "Minutes", factoryClass = TypeFactory.class, factoryMethod = "getMinutesInstance")
public class Minutes extends ATime {
	
	public Minutes(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		return time * 60 * 1000;
	}

	@Override
	public long getSeconds() {
		return time * 60;
	}

	@Override
	public long getMinutes() {
		return time;
	}

	@Override
	public long getHour() {
		return time / 60;
	}
}
