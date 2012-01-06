package mise.marssa.footprint.data_types.float_datatypes.pressure;

import mise.marssa.footprint.exceptions.OutOfRange;



public class PSI extends APressure {

	public PSI(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		return value * 0.0689475f;
	}

	@Override
	public float getMBars() {
		return value * 68.9475f;
	}

	@Override
	public float getPa() {
		return value * 6894.75f;
	}

	@Override
	public float getKPa() {
		return value * 6.89475f;
	}

	@Override
	public float getMMHg() {
		return value * 51.71487786825f;
	}

	@Override
	public float getPSI() {
		return value;
	}
}
