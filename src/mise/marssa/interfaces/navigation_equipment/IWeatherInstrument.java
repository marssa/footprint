package mise.marssa.interfaces.navigation_equipment;

import mise.marssa.data_types.float_datatypes.Percentage;
import mise.marssa.data_types.float_datatypes.speed.Knots;
import mise.marssa.data_types.integer_datatypes.DegreesInteger;

/**
 * @author Alan
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
public interface IWeatherInstrument {

	public Float getAirTemperature();

	public Float getDewpoint();

	public Knots getGustSpeed();

	public Percentage getHumidity();

	public Float getPressure();

	public Float getSolarRadiation();

	public DegreesInteger getWindDirection();

	public Knots getWindSpeed();

}