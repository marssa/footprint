
package mise.marssa.footprint.data_types.float_datatypes.volume;

import mise.marssa.footprint.exceptions.OutOfRange;

public class ImpGallons extends AVolume {

	public ImpGallons(float value) throws OutOfRange {
		super(value);
	}
	
	@Override
	public float getLiters() {
		return value *(float)4.54609188;
	}

	@Override
	public float getGallon() {
		return value *(float)1.20095042;
	}

	@Override
	public float getImpGallon() {
		return value;
	}
}
