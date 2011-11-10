/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.flow;

import mise.marssa.footprint.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 *
 */
public abstract class AVolumeFlow extends UnsignedFloat {

	/**
	 * 
	 */
	public AVolumeFlow(float value) throws OutOfRange{
		
		super(value);
	}
	
	/**
	 * Litres per hour
	 * @return
	 */
	abstract public float getLPH(); 
	
	/**
	 * Litres per minute
	 * @return
	 */
	abstract public float getLPM();
	
	/**
	 * Litres per second
	 * @return
	 */
	abstract public float getLPS();
	
	/**
	 * Meters cubed per second (m^3/s)
	 * @return
	 */
	abstract public float getMCPS();
	
	/**
	 * Meters cubed per minute
	 * @return
	 */
	abstract public float getMCPM();
	
	/**
	 * Meters cuber per hour
	 * @return
	 */
	abstract public float getMCPH();
	
	/**
	 * Cubic foot per second
	 * @return
	 */
	abstract public float getCFPS();
	
	/**
	 * Cubic foot per minute
	 * @return
	 */
	abstract public float getCFPM();
	
	/**
	 * Cubic foot per hour
	 * @return
	 */
	abstract public float getCFPH();
	
	//TODO US & UK gallons
}
