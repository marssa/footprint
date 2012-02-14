/**
 * 
 */
package mise.marssa.footprint.interfaces.navigation;

import mise.marssa.footprint.datatypes.decimal.DegreesFloat;
import mise.marssa.footprint.datatypes.decimal.distance.ADistance;
import mise.marssa.footprint.datatypes.decimal.speed.ASpeed;
import mise.marssa.footprint.datatypes.decimal.temperature.ATemperature;
import mise.marssa.footprint.exceptions.OutOfRange;



/**
 * @author Warren Zahra
 *
 */
public interface ISpeedSensor {
	public ASpeed getSpeedKnots() throws OutOfRange;
	public ADistance getDepthMetres() throws OutOfRange;
	public ATemperature getTemperature();
	public DegreesFloat getDegreesMagnetic() throws OutOfRange;
	public DegreesFloat getDegreesTrue() throws OutOfRange;

}
