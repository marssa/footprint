package mise.marssa.data_types.float_datatypes.volume;

public class ImpGallons extends AVolume {

	public ImpGallons(float value) {
		super(value);
		// TODO Auto-generated constructor stub
	}
	
	public void finalize() throws Throwable {
		super.finalize();
	}
	
	@Override
	public float getLiters() {
		// TODO Auto-generated method stub
		return value *(float)4.54609188;
	}

	@Override
	public float getGallon() {
		// TODO Auto-generated method stub
		return value *(float)1.20095042;
	}

	@Override
	public float getImpGallon() {
		// TODO Auto-generated method stub
		return value;
	}
	

}
