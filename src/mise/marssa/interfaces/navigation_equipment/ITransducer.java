package mise.marssa.interfaces.navigation_equipment;

import mise.marssa.data_types.float_datatypes.speed.Knots;

/**
 * Interface for "environment" transducers
 * 
 * @author Alan Grech
 * @version 1.0
 * @updated 08-Jul-2011 15:00:19
 */
public interface ITransducer {

	public float getDepth();

	/**
	 * Speed Through Water
	 */
	public Knots getSTW();

	public Float getWaterTemperature();

}