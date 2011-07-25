package mise.marssa.data_types.float_datatypes.pressure;

public class KPa extends APressure {

	public KPa(float value) {
		super(value);
	}

	@Override
	public float getBars() {
		// TODO Auto-generated method stub
		return value* (float) 0.01   ;
	}

	@Override
	public float getMBars() {
		// TODO Auto-generated method stub
		return value* (float) 10.0 ;
	}

	@Override
	public float getPa() {
		// TODO Auto-generated method stub
		return value* (float) 1000  ;
	}

	@Override
	public float getKPa() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public float getMMHg() {
		// TODO Auto-generated method stub
		return value* (float) 7.500616827042  ;
	}

	@Override
	public float getPSI() {
		// TODO Auto-generated method stub
		return value* (float) 0.1450378911491 ;
	}

}
