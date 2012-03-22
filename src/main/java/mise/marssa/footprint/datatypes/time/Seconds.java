package mise.marssa.footprint.datatypes.time;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;



/**
 * @author Alan Grech
 *
 */
@XmlType(name = "Seconds", factoryClass = TypeFactory.class, factoryMethod = "getSecondsInstance")
@Entity
public class Seconds extends ATime {
	
	private static Logger Seconds = (Logger) LoggerFactory.getLogger("Seconds");
	public Seconds(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		Seconds.trace(MMarker.GETTER,"Converting from Seconds to MilliSeconds : {}",time * 1000);
		return time * 1000;
	}

	@Override
	public long getSeconds() {
		Seconds.trace(MMarker.GETTER,"Getting Seconds: {}",time);
		return time;
	}

	@Override
	public long getMinutes() {
		Seconds.trace(MMarker.GETTER,"Converting from Seconds to MilliSeconds : {}",time / 60 );		
		return time / 60;
	}

	@Override
	public long getHour() {
		Seconds.trace(MMarker.GETTER,"Converting from Seconds to MilliSeconds : {}",time / (60* 60) );
		return time / (60* 60);
	}
}
