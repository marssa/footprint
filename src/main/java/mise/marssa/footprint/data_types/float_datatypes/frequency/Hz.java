package mise.marssa.footprint.data_types.float_datatypes.frequency;

import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class Hz extends AFrequency {

	public Hz(float value) throws OutOfRange {
		super(value);
	}

	/**
	 * Hz is the SI unit
	 */
	@Override
	public float getHz() {
		return value;
	}

	@Override
	public float getKHz() {
		return value / 1000;
	}
}