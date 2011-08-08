package mise.marssa.data_types.composite_datatypes;

import mise.marssa.data_types.integer_datatypes.DegreesInteger;
import mise.marssa.data_types.float_datatypes.DegreesFloat;
import mise.marssa.data_types.float_datatypes.MFloat;
import mise.marssa.data_types.integer_datatypes.MInteger;
import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
public class Latitude {

	private Position latitude;

	public Latitude(DegreesInteger degrees, MInteger minutes, MFloat seconds) throws OutOfRange {
		if(degrees.getValue() < -90 && degrees.getValue() > 90)
			throw new OutOfRange("Degrees value is out of the range -90 < degrees < 90");
		if(minutes.getValue() < 0 && minutes.getValue() > 60)
			throw new OutOfRange("Minutes value is out of the range 0 < minutes < 60");
		if(seconds.getValue() < 0 && seconds.getValue() > 60)
			throw new OutOfRange("Seconds value is out of the range 60 < seconds < 60");
		this.latitude = new Position(degrees, minutes, seconds);
	}
	
	public Latitude(DegreesFloat degrees) throws OutOfRange {
		if(degrees.getValue() < -90 && degrees.getValue() > 90)
			throw new OutOfRange("Degrees value is out of the range -90 < degrees < 90");
		this.latitude = new Position(degrees);
	}

	public void finalize() throws Throwable {

	}

	public Position getLatitude() {
		return latitude;
	}

	public java.lang.String toString() {
		return "DDMMSS.S: " + latitude.toString();
	}
}