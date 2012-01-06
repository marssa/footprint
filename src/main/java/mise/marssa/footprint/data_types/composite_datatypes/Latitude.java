package mise.marssa.footprint.data_types.composite_datatypes;


import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.float_datatypes.DegreesFloat;
import mise.marssa.footprint.data_types.float_datatypes.MFloat;
import mise.marssa.footprint.data_types.integer_datatypes.DegreesInteger;
import mise.marssa.footprint.data_types.integer_datatypes.MInteger;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
@XmlType(name = "Latitude", factoryClass = TypeFactory.class, factoryMethod = "getLatitudeInstance")
public class Latitude extends APosition {

	//private APosition latitude;
	
	public Latitude(DegreesInteger degrees, MInteger minutes, MFloat seconds) throws OutOfRange {
		super(degrees, minutes, seconds);
		if(degrees.getValue() < -90 && degrees.getValue() > 90)
			throw new OutOfRange("Degrees value is out of the range -90 < degrees < 90");
		if(minutes.getValue() < 0 && minutes.getValue() > 60)
			throw new OutOfRange("Minutes value is out of the range 0 < minutes < 60");
		if(seconds.getValue() < 0 && seconds.getValue() > 60)
			throw new OutOfRange("Seconds value is out of the range 60 < seconds < 60");
		
	}
	
	public Latitude(DegreesFloat degrees) throws OutOfRange {
		super(degrees);
		if(degrees.getValue() < -90 && degrees.getValue() > 90)
			throw new OutOfRange("Degrees value is out of the range -90 < degrees < 90");
		
	}

	public void finalize() throws Throwable {

	}

	
	
	public java.lang.String toString() {
		return "DDMMSS.S: [" + degrees + "\u00b0, " + minutes + "', " + seconds + "\"]";
	}
	
}