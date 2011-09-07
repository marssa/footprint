/**
 * 
 */
package mise.marssa.data_types.float_datatypes.flow;

import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversions for: cubic foot per second
 */
public class CFPS extends AVolumeFlow{

	public CFPS(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		return value * (float) 101940.6492 ;
	}

	@Override
	public float getLPM() {
		return value * (float) 1699.01082 ;
	}

	@Override
	public float getLPS() {
		return value * (float) 28.316847;
	}

	@Override
	public float getMCPS() {
		return value * (float) 0.028316847  ;
	}

	@Override
	public float getMCPM() {
		return value * (float) 1.69901082;
	}

	@Override
	public float getMCPH() {
		return value * (float) 101.9406492 ;
	}

	@Override
	public float getCFPS() {
		return value;
	}

	@Override
	public float getCFPM() {
		// TODO Auto-generated method stub
		return value * 60;
	}

	@Override
	public float getCFPH() {
		// TODO Auto-generated method stub
		return value * 3600;
	}

}
