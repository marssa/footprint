package mise.marssa.footprint.data_types.time;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;



/**
 * @author Alan Grech
 *
 */
@XmlType(name = "Seconds", factoryClass = TypeFactory.class, factoryMethod = "getSecondsInstance")
public class Seconds extends ATime {
	
	public Seconds(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		return time * 1000;
	}

	@Override
	public long getSeconds() {
		return time;
	}

	@Override
	public long getMinutes() {
		return time / 60;
	}

	@Override
	public long getHour() {
		return time / (60* 60);
	}
}
