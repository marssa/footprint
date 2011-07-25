package mise.marssa.data_types.float_datatypes.volume;

public class Litres extends AVolume{

	public Litres(float value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getLiters() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public float getGallon() {
		// TODO Auto-generated method stub
		return value * (float) 0.264172052;
	}

	@Override
	public float getImpGallon() {
		// TODO Auto-generated method stub
		return value * (float) 0.219969157;
	}
	

}
