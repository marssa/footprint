/**
 * @author Warren Zahra
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
package mise.marssa.footprint.data_types.float_datatypes.volume;

import flexjson.JSONSerializer;
import mise.marssa.footprint.data_types.MString;
import mise.marssa.footprint.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

public abstract class AVolume extends UnsignedFloat {

	public AVolume(float value) throws OutOfRange {
		super(value);
	}

	abstract public float getLiters();

	abstract public float getGallon();

	/**
	 * Imperial Gallons
	 * 
	 * @return
	 */
	abstract public float getImpGallon();

	@Override
	public String toString() {
		return "Volume in " + this.getClass().getSimpleName() + " = " + value;
	}
}
