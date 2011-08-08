package mise.marssa.data_types.float_datatypes.pressure;

import mise.marssa.exceptions.OutOfRange;

public class MMHg extends APressure {

	public MMHg(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		// TODO Auto-generated method stub
		return value*(float) 0.001333223684211 ;
	}

	@Override
	public float getMBars() {
		// TODO Auto-generated method stub
		return value*(float) 1.333223684211 ;
	}

	@Override
	public float getPa() {
		// TODO Auto-generated method stub
		return value*(float) 133.3223684211;
	}

	@Override
	public float getKPa() {
		// TODO Auto-generated method stub
		return value*(float) 0.1333223684211;
	}

	@Override
	public float getMMHg() {
		// TODO Auto-generated method stub
		return (float) value;
	}

	@Override
	public float getPSI() {
		// TODO Auto-generated method stub
		return value*(float) 0.01933679515879 ;
	}

}
