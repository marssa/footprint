/**
 * 
 */
package mise.marssa.data_types.float_datatypes.flow;

import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversions for cubic meters per hour
 */
public class MCPH extends AVolumeFlow {

	public MCPH(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		return value * 1000;
	}

	@Override
	public float getLPM() {
		return value * 1000 /60;
	}

	@Override
	public float getLPS() {
		return value * 1000 / 3600;
	}

	@Override
	public float getMCPS() {
		return value / 3600;
	}

	@Override
	public float getMCPM() {
		return value / 60;
	}

	@Override
	public float getMCPH() {
		return value;
	}

	@Override
	public float getCFPS() {
		return value * (float) 0.0098096295036;
	}

	@Override
	public float getCFPM() {
		return value * (float) 0.58857777022  ;
	}

	@Override
	public float getCFPH() {
		return value * (float) 35.314666213;
	}

}
