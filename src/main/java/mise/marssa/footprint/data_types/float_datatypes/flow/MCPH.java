/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.flow;

import mise.marssa.footprint.exceptions.OutOfRange;

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
		return value * 1000f;
	}

	@Override
	public float getLPM() {
		return value * 1000f /60f;
	}

	@Override
	public float getLPS() {
		return value * 1000f / 3600f;
	}

	@Override
	public float getMCPS() {
		return value / 3600f;
	}

	@Override
	public float getMCPM() {
		return value / 60f;
	}

	@Override
	public float getMCPH() {
		return value;
	}

	@Override
	public float getCFPS() {
		return value * 0.0098096295036f;
	}

	@Override
	public float getCFPM() {
		return value * 0.58857777022f;
	}

	@Override
	public float getCFPH() {
		return value * 35.314666213f;
	}
}
