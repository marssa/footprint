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
 * @author Lifebook
 *
 */
@XmlType(name = "Milliseconds", factoryClass = TypeFactory.class, factoryMethod = "getMillisecondsInstance")
public class Milliseconds extends ATime{
	
	private static Logger MilliSeconds = (Logger) LoggerFactory.getLogger("MilliSeconds");
	
	public Milliseconds(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		MilliSeconds.trace(MMarker.GETTER,"Getting MilliSeconds: {}",time);
		return time;
	}

	@Override
	public long getSeconds() {
		MilliSeconds.trace(MMarker.GETTER,"Converting from MilliSeconds to Seconds : {}",time / 1000 );
		return time / 1000;
	}

	@Override
	public long getMinutes() {
		MilliSeconds.trace(MMarker.GETTER,"Converting from MilliSeconds to Minutes : {}",time / (1000*60));
		return time / (1000*60);
	}

	@Override
	public long getHour() {
		MilliSeconds.trace(MMarker.GETTER,"Converting from MilliSeconds to Hours : {}",time / (1000*60*60));
		return time / (1000*60*60);
	}
}
