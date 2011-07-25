package mise.marssa.data_types.float_datatypes.volume;

public class Gallons extends AVolume {
	public Gallons(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	@Override
	public float getLiters() {
		// TODO Auto-generated method stub
		return value * (float) 3.78541178 ;
	}

	@Override
	public float getGallon() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public float getImpGallon() {
		// TODO Auto-generated method stub
		return value * (float) 0.83267384 ;
	}
	

}
