/**
 * 
 */
package mise.marssa.data_types.float_datatypes.flow;

import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversions for: cubic foot per hour
 */
public class CFPH extends AVolumeFlow {

	public CFPH(float value) throws OutOfRange {
		super(value);
		}

	@Override
	public float getLPH() {
		return value * (float) 28.316847;
	}

	@Override
	public float getLPM() {
		return value * (float) 0.47194744999;
	}

	@Override
	public float getLPS() {
		return value * (float) 0.0078657908333;
	}

	@Override
	public float getMCPS() {
		return value * (float) 0.0000078657908333 ;
	}

	@Override
	public float getMCPM() {
		return value * (float) 0.00047194744999;
		
	}

	@Override
	public float getMCPH() {
		return value * (float) 0.028316847;
	}

	@Override
	public float getCFPS() {
		// TODO Auto-generated method stub
		return value * (float) 0.00027777777778;
	}

	@Override
	public float getCFPM() {
		// TODO Auto-generated method stub
		return value * (float) 0.016666666667;
	}

	@Override
	public float getCFPH() {
		// TODO Auto-generated method stub
		return this.value;
	}


}
