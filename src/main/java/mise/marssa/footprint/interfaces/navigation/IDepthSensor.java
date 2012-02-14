/**
 * 
 */
package mise.marssa.footprint.interfaces.navigation;

import mise.marssa.footprint.datatypes.decimal.distance.ADistance;
import mise.marssa.footprint.datatypes.decimal.temperature.ATemperature;
import mise.marssa.footprint.exceptions.OutOfRange;



/**
 * @author Warren Zahra
 *
 */
public interface IDepthSensor {
	
	public ADistance getDepthMetres() throws OutOfRange;
	public ATemperature getTemperatureDegrees() throws OutOfRange;
	
}
