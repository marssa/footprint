/**
 * 
 */
package mise.marssa.footprint.interfaces.navigation_equipment;

import mise.marssa.footprint.data_types.float_datatypes.distance.ADistance;
import mise.marssa.footprint.data_types.float_datatypes.speed.ASpeed;
import mise.marssa.footprint.data_types.float_datatypes.temperature.ATemperature;
import mise.marssa.footprint.exceptions.OutOfRange;



/**
 * @author Warren Zahra
 *
 */
public interface ISpeedSensor {
	public ASpeed getSpeedKnots() throws OutOfRange;
	public ADistance getDepthMetres() throws OutOfRange;
	public ATemperature getTemperature();
	public ADegreesMagnetic getDegreesMagnetic() throws OutOfRange;
	public ADegreesTrue getDegreesTrue() throws OutOfRange;

}
