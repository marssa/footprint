/**
 * 
 */
package mise.marssa.footprint.datatypes.time;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;



/**
 * @author Alan Grech
 *
 */
@XmlType(name = "Minutes", factoryClass = TypeFactory.class, factoryMethod = "getMinutesInstance")
public class Minutes extends ATime {
	private static Logger Minutes = (Logger) LoggerFactory.getLogger("Minutes");
	
	public Minutes(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		Minutes.trace(MMarker.GETTER,"Converting from Minutes to MilliSeconds : {}",time * 60 * 1000);	
		return time * 60 * 1000;
	}

	@Override
	public long getSeconds() {
		Minutes.trace(MMarker.GETTER,"Converting from Minutes to Seconds : {}",time * 60 );	
		return time * 60;
	}

	@Override
	public long getMinutes() {
		Minutes.trace(MMarker.GETTER,"Getting Minutes: {}",time);
		return time;
	}

	@Override
	public long getHour() {
		Minutes.trace(MMarker.GETTER,"Converting from Minutes to Hour : {}",time / 60 );	
		return time / 60;
	}
}
