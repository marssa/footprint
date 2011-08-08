package mise.marssa.data_types.composite_datatypes;

import mise.marssa.data_types.float_datatypes.DegreesFloat;
import mise.marssa.data_types.float_datatypes.MFloat;
import mise.marssa.data_types.integer_datatypes.DegreesInteger;
import mise.marssa.data_types.integer_datatypes.MInteger;
import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
public class Longitude {

	private Position longitude;

	public Longitude(DegreesInteger degrees, MInteger minutes, MFloat seconds) throws OutOfRange {
		if(degrees.getValue() < -180 && degrees.getValue() > 180)
			throw new OutOfRange("Degrees value is out of the range -180 < degrees < 180");
		if(minutes.getValue() < 0 && minutes.getValue() > 60)
			throw new OutOfRange("Minutes value is out of the range 0 < minutes < 60");
		if(seconds.getValue() < 0 && seconds.getValue() > 60)
			throw new OutOfRange("Seconds value is out of the range 60 < seconds < 60");
		this.longitude = new Position(degrees, minutes, seconds);
	}
	
	public Longitude(DegreesFloat degrees) throws OutOfRange {
		if(degrees.getValue() < -180 && degrees.getValue() > 180)
			throw new OutOfRange("Degrees value is out of the range -180 < degrees < 180");
		this.longitude = new Position(degrees);
	}


	public void finalize() throws Throwable {

	}

	public Position getLongitude() {
		return longitude;
	}

	public java.lang.String toString() {
		return "DDDMMSS.S: " + longitude.toString();
	}
}