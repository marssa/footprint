/**
 * 
 */
package mise.marssa.data_types.float_datatypes.flow;

import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversions for litres per hour
 */
public class LPH extends AVolumeFlow{

	public LPH(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		return value;
	}

	@Override
	public float getLPM() {
		return value/60;
	}

	@Override
	public float getLPS() {
		return value/3600;
	}

	@Override
	public float getMCPS() {
		return value * (float) 0.001/3600 ;
	}

	@Override
	public float getMCPM() {
		return value * (float) 0.001/60;
	}

	@Override
	public float getMCPH() {
		return value * (float) 0.001;
	}

	@Override
	public float getCFPS() {
		return value * (float) 0.0000098096295036  ;
	}

	@Override
	public float getCFPM() {
		return value * (float) 0.00058857777022 ;
	}

	@Override
	public float getCFPH() {
		return value * (float) 0.035314666213;
	}

	
}
