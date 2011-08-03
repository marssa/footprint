package mise.marssa.data_types.composite_datatypes;

import mise.marssa.data_types.float_datatypes.DegreesFloat;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:30
 */
public class Yaw {

	private DegreesFloat Yaw;

	public Yaw(DegreesFloat yaw) {
		this.Yaw = yaw;
	}

	public void finalize() throws Throwable {

	}

	public DegreesFloat getYaw() {
		return Yaw;
	}

	public java.lang.String toString() {
		return "";
	}
}