package mise.marssa.footprint.datatypes.decimal;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "PercentageFloat", factoryClass = TypeFactory.class, factoryMethod = "getPercentageFloatInstance")
@Entity
public class PercentageFloat extends MFloat {
	private static Logger PercentageFloat = (Logger) LoggerFactory.getLogger("PercentageFloat");
	public PercentageFloat(float value) throws OutOfRange {
		super(value);
		if((value < -100f) || (value > 100f))
			PercentageFloat.debug(MMarker.EXCEPTION,"Value received is out of range",new OutOfRange());
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
}