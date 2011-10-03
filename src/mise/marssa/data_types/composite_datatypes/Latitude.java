package mise.marssa.data_types.composite_datatypes;

import flexjson.JSON;
import flexjson.JSONSerializer;
import mise.marssa.data_types.MString;
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
		//this.latitude = new APosition(degrees, minutes, seconds);
	}
	
	public Latitude(DegreesFloat degrees) throws OutOfRange {
		super(degrees);
		if(degrees.getValue() < -90 && degrees.getValue() > 90)
			throw new OutOfRange("Degrees value is out of the range -90 < degrees < 90");
		//this.latitude = new APosition(degrees);
	}

	public void finalize() throws Throwable {

	}

	//@JSON
	//public APosition getLatitude() {
		//return latitude;
	//}

	//public java.lang.String toString() {
		//return "DDMMSS.S: " + latitude.toString();
	//}
	
	public java.lang.String toString() {
		return "DDMMSS.S: [" + degrees + "\u00b0, " + minutes + "', " + seconds + "\"]";
	}
	
	//public MString toJSON(){
		//MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		//return JSON;
	//}
}