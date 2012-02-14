/**
 * 
 */
package mise.marssa.footprint.datatypes.time;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;



/**
 * @author Lifebook
 *
 */
@XmlType(name = "Milliseconds", factoryClass = TypeFactory.class, factoryMethod = "getMillisecondsInstance")
public class Milliseconds extends ATime{
	
	public Milliseconds(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		return time;
	}

	@Override
	public long getSeconds() {
		return time / 1000;
	}

	@Override
	public long getMinutes() {
		return time / (1000*60);
	}

	@Override
	public long getHour() {
		return time / (1000*60*60);
	}
}
