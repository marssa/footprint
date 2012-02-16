/**
 * 
 */
package mise.marssa.footprint.datatypes.time;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * 
 */
@XmlType(name = "Hours", factoryClass = TypeFactory.class, factoryMethod = "getHoursInstance")
public class Hours extends ATime {

	private static Logger Hours = (Logger) LoggerFactory.getLogger("Hours");

	public Hours(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		Hours.trace(MMarker.GETTER,"Converting from Hours to MilliSeconds : {}",time * 60 * 60 * 1000 );
		return time * 60 * 60 * 1000;
	}
	@XmlElement(required = true)
	@Override
	public long getSeconds() {
		Hours.trace(MMarker.GETTER,"Converting from Hours to Seconds : {}",time * 60 * 60 );
		return time * 60 * 60;
	}

	@Override
	public long getMinutes() {
		Hours.trace(MMarker.GETTER,"Converting from Hours to Minutes : {}",time * 60 );
		return time * 60;
	}

	@Override
	public long getHour() {
		Hours.trace(MMarker.GETTER,"Getting Hours: {}",time);
		return time;
	}
}
