package mise.marssa.footprint.datatypes.integer;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "PercentageInteger", factoryClass = TypeFactory.class, factoryMethod = "getPercentageIntegerInstance")
@Entity
public class PercentageInteger extends MInteger {

	private static Logger PercentageInteger = (Logger) LoggerFactory.getLogger("PercentageInteger");
	public PercentageInteger(int value) throws OutOfRange {
		super(value);
		if((value < -100f) || (value > 100f))
			PercentageInteger.debug(MMarker.EXCEPTION,"Value received is out of range",new OutOfRange());
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}