package mise.marssa.data_types.float_datatypes.volume;

import mise.marssa.exceptions.OutOfRange;

public class Litres extends AVolume{

	public Litres(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLiters() {
		return value;
	}

	@Override
	public float getGallon() {
		return value * (float) 0.264172052;
	}

	@Override
	public float getImpGallon() {
		return value * (float) 0.219969157;
	}
	

}
