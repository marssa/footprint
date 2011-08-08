package mise.marssa.data_types.composite_datatypes;

import mise.marssa.data_types.integer_datatypes.DegreesInteger;
import mise.marssa.data_types.integer_datatypes.MInteger;
import mise.marssa.data_types.float_datatypes.DegreesFloat;
import mise.marssa.data_types.float_datatypes.MFloat;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class Position {

	private DegreesInteger degrees;
	private MInteger minutes;
	private MFloat seconds;

	public Position(DegreesInteger degrees, MInteger minutes, MFloat seconds) {
		this.degrees = degrees;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public Position(DegreesFloat degrees) {
		float degFloat = degrees.getValue();
		this.degrees = new DegreesInteger((int) java.lang.Math.floor(degFloat));
		
		float minFloat = 60 * java.lang.Math.abs(degFloat - this.degrees.getValue());
		this.minutes = new MInteger((int) minFloat);
		
		float secFloat = 60 * (minFloat - this.minutes.getValue());
		if (secFloat == 60) {
			this.minutes = new MInteger(this.minutes.getValue() + 1);
			secFloat = 0;
		}
		this.seconds = new MFloat(secFloat); 
		if (this.minutes.getValue() == 60) {
			this.degrees = new DegreesInteger(this.degrees.getValue() + 1);
			this.minutes = new MInteger(0);
		}
	}

	public void finalize() throws Throwable {

	}

	public DegreesInteger getDegrees() {
		return degrees;
	}

	public MInteger getMinutes() {
		return minutes;
	}

	public MFloat getSeconds() {
		return seconds;
	}

	public java.lang.String toString() {
		return "[" + degrees + "\u00b0, " + minutes + "', " + seconds + "\"]";
	}
}