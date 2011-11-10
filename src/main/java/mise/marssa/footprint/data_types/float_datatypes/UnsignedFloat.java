package mise.marssa.footprint.data_types.float_datatypes;

import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class UnsignedFloat extends MFloat {

	public UnsignedFloat(float value) throws OutOfRange {
		super(value);
		if(value < 0f)
			throw new OutOfRange();
	}
}