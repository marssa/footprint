package mise.marssa.data_types.composite_datatypes;

import mise.marssa.data_types.float_datatypes.DegreesFloat;

/**
 * @author Alan
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class Pitch {

	private DegreesFloat Pitch;

	public Pitch(DegreesFloat pitch) {
		this.Pitch = pitch;

	}

	public void finalize() throws Throwable {

	}

	public DegreesFloat getPitch() {
		return Pitch;
	}

	public java.lang.String toString() {
		return "";
	}
}