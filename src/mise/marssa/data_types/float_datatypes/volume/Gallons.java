package mise.marssa.data_types.float_datatypes.volume;

import mise.marssa.exceptions.OutOfRange;

public class Gallons extends AVolume {
	public Gallons(float value) throws OutOfRange {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	@Override
	public float getLiters() {
		return value * (float) 3.78541178 ;
	}

	@Override
	public float getGallon() {
		return value;
	}

	@Override
	public float getImpGallon() {
		return value * (float) 0.83267384 ;
	}
	

}
