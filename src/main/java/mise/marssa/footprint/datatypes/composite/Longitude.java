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
@XmlType(name = "Longitude", factoryClass = TypeFactory.class, factoryMethod = "getLongitudeInstance")
public class Longitude extends APosition {

	private APosition longitude;
	private static Logger Longitude = (Logger) LoggerFactory.getLogger("Longitude");
	public Longitude(DegreesInteger degrees, MInteger minutes, MFloat seconds) throws OutOfRange {
		super(degrees, minutes, seconds);
		if(degrees.getValue() < -180 && degrees.getValue() > 180)
			Longitude.debug(MMarker.EXCEPTION,"Degrees value is out of range -180 < degrees < 180",new OutOfRange());
		if(minutes.getValue() < 0 && minutes.getValue() > 60)
			Longitude.debug(MMarker.EXCEPTION,"Degrees value is out of range 0 < degrees < 60",new OutOfRange());			
		if(seconds.getValue() < 0 && seconds.getValue() > 60)
			Longitude.debug(MMarker.EXCEPTION,"Degrees value is out of range 60 < degrees < 60",new OutOfRange());			
	}
	
	public Longitude(DegreesFloat degrees) throws OutOfRange {
		super (degrees);
		if(degrees.getValue() < -180 && degrees.getValue() > 180)
			Longitude.debug(MMarker.EXCEPTION,"Degrees value is out of range -180 < degrees < 180",new OutOfRange());	
	}


	public void finalize() throws Throwable {

	}
	
	public java.lang.String toString() {
		return "DDDMMSS.S: " + longitude;
	}
	
}