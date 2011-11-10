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
	 * @return
	 */
	abstract public float getImpGallon();
	
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
}
