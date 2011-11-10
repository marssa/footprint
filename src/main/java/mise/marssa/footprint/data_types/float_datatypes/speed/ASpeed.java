package mise.marssa.footprint.data_types.float_datatypes.speed;

import mise.marssa.footprint.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
public abstract class ASpeed extends UnsignedFloat {

	public ASpeed(float value) throws OutOfRange {
		super(value);
	}
	
	abstract public float getKnots();

	abstract public float getKPH();

	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	abstract public float getMPS();
	
	abstract public float getMPH();
	
	public int getBeaufort() {
		float windSpeed = getKnots();
		
		if (windSpeed >= 0 && windSpeed < 1) return 0; //Calm
		if (windSpeed >= 1 && windSpeed < 3) return 1; //Light Air
		if (windSpeed >= 3 && windSpeed < 7) return 2; //Light Breeze
		if (windSpeed >= 7 && windSpeed < 11) return 3; //Gentle Breeze
		if (windSpeed >= 11 && windSpeed < 16) return 4; //Moderate Breeze
		if (windSpeed >= 16 && windSpeed < 21) return 5; //Fresh Breeze
		if (windSpeed >= 21 && windSpeed < 27) return 6; //Strong Breeze
		if (windSpeed >= 27 && windSpeed < 34) return 7; //High Wind, Moderate Gale, Near Gale
		if (windSpeed >= 34 && windSpeed < 41) return 8; //Gale, Fresh Gale
		if (windSpeed >= 41 && windSpeed < 48) return 9; //Strong Gale
		if (windSpeed >= 48 && windSpeed < 56) return 10; //Storm, Whole Gale
		if (windSpeed >= 56 && windSpeed < 64) return 11; //Violent Storm
		if (windSpeed  >= 64) return 12; //Hurricane
		
		else return 0; //need to be changed to an exception
	}
}