package mise.marssa.data_types.float_datatypes.pressure;



public class PSI extends APressure {

	public PSI(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	
	@Override
	public float getBars() {
		// TODO Auto-generated method stub
		return value * (float) 0.0689475 ;
	}

	@Override
	public float getMBars() {
		// TODO Auto-generated method stub
		return value * (float) 68.9475 ;
	}

	@Override
	public float getPa() {
		// TODO Auto-generated method stub
		return value * (float) 6894.75  ;
	}

	@Override
	public float getKPa() {
		// TODO Auto-generated method stub
		return value * (float) 6.89475   ;
	}

	@Override
	public float getMMHg() {
		// TODO Auto-generated method stub
		return value * (float) 51.71487786825   ;
	}

	@Override
	public float getPSI() {
		// TODO Auto-generated method stub
		return value;
	}

}
