package mise.marssa.data_types.integer_datatypes;

import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class Percentage extends Integer {

	public Percentage(int value) throws OutOfRange {
		super(value);
		if((value < -100f) || (value > 100f))
			throw new OutOfRange();
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}