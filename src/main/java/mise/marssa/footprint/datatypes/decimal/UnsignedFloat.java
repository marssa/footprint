package mise.marssa.footprint.datatypes.decimal;

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
@XmlType(name = "UnsignedFloat", factoryClass = TypeFactory.class, factoryMethod = "getUnsignedFloatInstance")
@Entity
public class UnsignedFloat extends MFloat {

	private static Logger UnsignedFloat = (Logger) LoggerFactory.getLogger("UnsignedFloat");
	public UnsignedFloat(float value) throws OutOfRange {
		super(value);
		if(value < 0f)
			UnsignedFloat.debug(MMarker.EXCEPTION,"Value received is out of range",new OutOfRange());
	}
	
}