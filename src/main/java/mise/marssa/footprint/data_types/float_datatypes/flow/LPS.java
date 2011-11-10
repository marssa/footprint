package mise.marssa.footprint.data_types.float_datatypes.flow;

import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversion for: litres per second
 */

public class LPS extends AVolumeFlow {

	public LPS(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		return value * 3600f;
	}

	@Override
	public float getLPM() {
		return value * 60f;
	}

	@Override
	public float getLPS() {
		return value;
	}

	@Override
	public float getMCPS() {
		return value * 0.001f;
	}

	@Override
	public float getMCPM() {
		return value * 0.001f * 60f;
	}

	@Override	
	public float getMCPH() {
		return value * 0.001f * 3600f;
	}

	@Override
	public float getCFPS() {
		return value * 0.035314666213f;
	}

	@Override
	public float getCFPM() {
		return value * 2.1188799728f;
	}

	@Override
	public float getCFPH() {
		return value * 127.13279837f;
	}

}
