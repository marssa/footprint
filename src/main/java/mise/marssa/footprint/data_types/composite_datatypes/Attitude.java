package mise.marssa.footprint.data_types.composite_datatypes;

import mise.marssa.footprint.data_types.MString;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
public class Attitude {

	private Pitch pitch;
	private Roll roll;
	private Yaw yaw;

	public Attitude(Pitch pitch, Roll roll, Yaw yaw) {
		this.pitch = pitch;
		this.roll = roll;
		this.yaw = yaw;
	}

	public void finalize() throws Throwable {

	}

	public Pitch getPitch() {
		return pitch;
	}

	public Roll getRoll() {
		return roll;
	}

	public Yaw getYaw() {
		return yaw;
	}

	public java.lang.String toString() {
		return "[" + pitch.toString() + ", " + roll.toString() + ", "
				+ yaw.toString() + "]";
	}
	
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
}