package mise.marssa.footprint.datatypes.composite;


import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.DegreesFloat;
import mise.marssa.footprint.datatypes.decimal.MFloat;
import mise.marssa.footprint.datatypes.integer.DegreesInteger;
import mise.marssa.footprint.datatypes.integer.MInteger;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
@XmlType(name = "Longitude", factoryClass = TypeFactory.class, factoryMethod = "getLongitudeInstance")
public class Longitude extends APosition {

	private APosition longitude;

	public Longitude(DegreesInteger degrees, MInteger minutes, MFloat seconds) throws OutOfRange {
		super(degrees, minutes, seconds);
		if(degrees.getValue() < -180 && degrees.getValue() > 180)
			throw new OutOfRange("Degrees value is out of the range -180 < degrees < 180");
		if(minutes.getValue() < 0 && minutes.getValue() > 60)
			throw new OutOfRange("Minutes value is out of the range 0 < minutes < 60");
		if(seconds.getValue() < 0 && seconds.getValue() > 60)
			throw new OutOfRange("Seconds value is out of the range 60 < seconds < 60");
	}
	
	public Longitude(DegreesFloat degrees) throws OutOfRange {
		super (degrees);
		if(degrees.getValue() < -180 && degrees.getValue() > 180)
			throw new OutOfRange("Degrees value is out of the range -180 < degrees < 180");
		
	}


	public void finalize() throws Throwable {

	}
	
	public java.lang.String toString() {
		return "DDDMMSS.S: " + longitude.toString();
	}
	
}