package mise.marssa.footprint.datatypes.composite;


import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.DegreesFloat;
import mise.marssa.footprint.datatypes.decimal.MFloat;
import mise.marssa.footprint.datatypes.integer.DegreesInteger;
import mise.marssa.footprint.datatypes.integer.MInteger;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
@XmlType(name = "Latitude", factoryClass = TypeFactory.class, factoryMethod = "getLatitudeInstance")
public class Latitude extends APosition {

	//private APosition latitude;
	private static Logger Latitude = (Logger) LoggerFactory.getLogger("Latitude");
	public Latitude(DegreesInteger degrees, MInteger minutes, MFloat seconds) throws OutOfRange {
		super(degrees, minutes, seconds);
		if(degrees.getValue() < -90 && degrees.getValue() > 90)
			Latitude.debug(MMarker.EXCEPTION,"Degrees value is out of range -90 < degrees < 90",new OutOfRange());
		if(minutes.getValue() < 0 && minutes.getValue() > 60)
			Latitude.debug(MMarker.EXCEPTION,"Minutes value is out of range 0 < minutes < 60",new OutOfRange());
		if(seconds.getValue() < 0 && seconds.getValue() > 60)
			Latitude.debug(MMarker.EXCEPTION,"Seconds value is out of range 60 < minutes < 60",new OutOfRange());
			
		
	}
	
	public Latitude(DegreesFloat degrees) throws OutOfRange {
		super(degrees);
		if(degrees.getValue() < -90 && degrees.getValue() > 90)
			Latitude.debug(MMarker.EXCEPTION,"Degrees value is out of range -90 < minutes < 90",new OutOfRange());	
	}

	public void finalize() throws Throwable {

	}

	
	
	public java.lang.String toString() {
		return "DDMMSS.S: [" + degrees + "\u00b0, " + minutes + "', " + seconds + "\"]";
	}
	
}