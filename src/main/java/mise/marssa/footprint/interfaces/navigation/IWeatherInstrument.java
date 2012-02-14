package mise.marssa.footprint.interfaces.navigation;

import mise.marssa.footprint.datatypes.decimal.PercentageFloat;
import mise.marssa.footprint.datatypes.decimal.speed.Knots;
import mise.marssa.footprint.datatypes.integer.DegreesInteger;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
public interface IWeatherInstrument {

	public Float getAirTemperature();

	public Float getDewpoint();

	public Knots getGustSpeed();

	public PercentageFloat getHumidity();

	public Float getPressure();

	public Float getSolarRadiation();

	public DegreesInteger getWindDirection();

	public Knots getWindSpeed();

}