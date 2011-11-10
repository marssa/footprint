package mise.marssa.footprint.interfaces.navigation_equipment;

import mise.marssa.footprint.data_types.composite_datatypes.Attitude;
import mise.marssa.footprint.data_types.float_datatypes.DegreesFloat;
import mise.marssa.footprint.data_types.float_datatypes.MFloat;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public interface ICompass {

	/**
	 * Compass returns Roll & Pitch
	 */
	public Attitude getAttitude();

	public DegreesFloat getDeviation();

	public DegreesFloat getHeading();

	public DegreesFloat getMagneticHeading();

	public MFloat getRateOfTurn();

	public DegreesFloat getTrueHeading();

	/**
	 * Difference between True North & Magnetic North
	 */
	public DegreesFloat getVariation();

}