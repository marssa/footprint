/**
 * 
 */
package mise.marssa.footprint.data_types;

import mise.marssa.footprint.data_types.composite_datatypes.APosition;
import mise.marssa.footprint.data_types.composite_datatypes.Attitude;
import mise.marssa.footprint.data_types.composite_datatypes.Coordinate;
import mise.marssa.footprint.data_types.composite_datatypes.Latitude;
import mise.marssa.footprint.data_types.composite_datatypes.Longitude;
import mise.marssa.footprint.data_types.composite_datatypes.Pitch;
import mise.marssa.footprint.data_types.composite_datatypes.Roll;
import mise.marssa.footprint.data_types.composite_datatypes.Yaw;
import mise.marssa.footprint.data_types.float_datatypes.DegreesFloat;
import mise.marssa.footprint.data_types.float_datatypes.MFloat;
import mise.marssa.footprint.data_types.float_datatypes.Percentage;
import mise.marssa.footprint.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.footprint.data_types.float_datatypes.distance.ADistance;
import mise.marssa.footprint.data_types.float_datatypes.distance.KM;
import mise.marssa.footprint.data_types.float_datatypes.distance.Metres;
import mise.marssa.footprint.data_types.float_datatypes.distance.Miles;
import mise.marssa.footprint.data_types.float_datatypes.distance.NM;
import mise.marssa.footprint.data_types.float_datatypes.electrical.charge.ACharge;
import mise.marssa.footprint.data_types.float_datatypes.electrical.charge.Ah;
import mise.marssa.footprint.data_types.float_datatypes.electrical.charge.Coulombs;
import mise.marssa.footprint.data_types.float_datatypes.electrical.charge.mAh;
import mise.marssa.footprint.data_types.float_datatypes.electrical.current.ACurrent;
import mise.marssa.footprint.data_types.float_datatypes.electrical.current.Amps;
import mise.marssa.footprint.data_types.float_datatypes.electrical.current.MilliAmps;
import mise.marssa.footprint.data_types.float_datatypes.electrical.impedance.AImpedance;
import mise.marssa.footprint.data_types.float_datatypes.electrical.impedance.KOhms;
import mise.marssa.footprint.data_types.float_datatypes.electrical.impedance.MOhms;
import mise.marssa.footprint.data_types.float_datatypes.electrical.impedance.Ohms;
import mise.marssa.footprint.data_types.float_datatypes.electrical.power.APower;
import mise.marssa.footprint.data_types.float_datatypes.electrical.power.KWatts;
import mise.marssa.footprint.data_types.float_datatypes.electrical.power.MWatts;
import mise.marssa.footprint.data_types.float_datatypes.electrical.power.Watts;
import mise.marssa.footprint.data_types.float_datatypes.frequency.AFrequency;
import mise.marssa.footprint.data_types.float_datatypes.frequency.Hz;
import mise.marssa.footprint.data_types.float_datatypes.frequency.KHz;
import mise.marssa.footprint.data_types.time.ATime;
import mise.marssa.footprint.data_types.time.Hours;
import mise.marssa.footprint.data_types.time.Milliseconds;
import mise.marssa.footprint.data_types.time.Minutes;
import mise.marssa.footprint.data_types.time.Seconds;
import mise.marssa.footprint.exceptions.OutOfRange;



/**
 * @author Clayton Tabone
 * 
 */
public class TypeFactory {

	public static Hours getHoursInstance() {
		return new Hours(100l);
	}
	
	public static Minutes getMinutesInstance() {
		return new Minutes(100l);
	}
	
	public static Seconds getSecondsInstance() {
		return new Seconds(100l);
	}
	
	public static Milliseconds getMillisecondsInstance() {
		return new Milliseconds(100l);
	}
	
	public static ATime getATimeInstance() {
		return new Milliseconds(100l);
	}
	
	//Frequenecy
	public static AFrequency getAFrequencyInstance() throws OutOfRange {
		return new Hz(100l);
	}
	public static Hz getHzInstance() throws OutOfRange {
		return new Hz(100l);
	}
	public static KHz getKHzInstance() throws OutOfRange {
		return new KHz(100l);
	}
	
	/**
	 * Native DataTypes
	 */
	
	public static MBoolean getMBooleanInstance() throws OutOfRange {
		return new MBoolean(true);
	}
	
	public static MDate getMDateInstance() throws OutOfRange {
		return new MDate(100l);
	}
	
	public static MString getMStringInstance() throws OutOfRange {
		return new MString("");
	}
	
	/**
	 * Composite DataTypes
	 */
	
	public static APosition getAPositionInstance() throws OutOfRange {
		return new Latitude(new DegreesFloat (0));
	}
	
	public static Attitude getAttitudeInstance() throws OutOfRange {
		return new Attitude(new Pitch(new DegreesFloat (0)), new Roll(new DegreesFloat (0)), new Yaw(new DegreesFloat (0)));
	}
	
	public static Coordinate getCoordinateInstance() throws OutOfRange {
		return new Coordinate(new Latitude(new DegreesFloat (0)),new Longitude(new DegreesFloat (0)));
	}
	
	public static Latitude getLattitudeInstance() throws OutOfRange {
		return new Latitude(new DegreesFloat (0));
	}
	
	public static Longitude getLongitudeInstance() throws OutOfRange {
		return new Longitude(new DegreesFloat (0));
	}
	
	public static Pitch getPitchInstance() throws OutOfRange {
		return new Pitch(new DegreesFloat (0));
	}
	
	public static Roll getRollInstance() throws OutOfRange {
		return new Roll(new DegreesFloat (0));
	}
	
	public static Yaw getYawInstance() throws OutOfRange {
		return new Yaw(new DegreesFloat (0));
	}
	
	/**
	 * DataTypes
	 */
	
	
	public static DegreesFloat getDegreesFloatInstance() throws OutOfRange {
		return new DegreesFloat(0);
	}
	
	public static MFloat getMFloatInstance() throws OutOfRange {
		return new MFloat(0);
	}
	public static Percentage getPercentageInstance() throws OutOfRange {
		return new Percentage(0);
	}
	public static UnsignedFloat getUnsignedFloatInstance() throws OutOfRange {
		return new UnsignedFloat(0);
	}
	
	/**
	 * Distance
	 */
	
	public static ADistance getADistanceInstance() throws OutOfRange {
		return new NM(0);
	}
	
	public static KM getKMInstance() throws OutOfRange {
		return new KM(0);
	}
	public static Metres getMetresInstance() throws OutOfRange {
		return new Metres(0);
	}
	public static Miles getMilesInstance() throws OutOfRange {
		return new Miles(0);
	}
	public static NM getNmInstance() throws OutOfRange {
		return new NM(0);
	}
	
	/**
	 * Electrical Charge
	 */
	
	public static ACharge getAChargeInstance() throws OutOfRange {
		return new Ah(0);
	}
	
	public static Ah getAhInstance() throws OutOfRange {
		return new Ah(0);
	}
	public static Coulombs getCoulombsInstance() throws OutOfRange {
		return new Coulombs(0);
	}
	public static mAh getmAhInstance() throws OutOfRange {
		return new mAh(0);
	}
	
	/**
	 * Electrical Current
	 */
	
	public static ACurrent getACurrentInstance() throws OutOfRange {
		return new Amps(0);
	}
	
	public static Amps getAmpsInstance() throws OutOfRange {
		return new Amps(0);
	}
	public static MilliAmps getMilliAmpsInstance() throws OutOfRange {
		return new MilliAmps(0);
	}
	
	/**
	 * Impedance
	 */
	
	public static AImpedance getAImpedanceInstance() throws OutOfRange {
		return new Ohms(0);
	}
	
	public static KOhms getKOhmsInstance() throws OutOfRange {
		return new KOhms(0);
	}
	public static MOhms getMOhmsInstance() throws OutOfRange {
		return new MOhms(0);
	}
	public static Ohms getOhmsInstance() throws OutOfRange {
		return new Ohms(0);
	}
	
	/**
	 * Power
	 */
	
	public static APower getAPowerInstance() throws OutOfRange {
		return new KWatts(0);
	}
	
	public static KWatts getKWattsInstance() throws OutOfRange {
		return new KWatts(0);
	}
	public static MWatts getMWattsInstance() throws OutOfRange {
		return new MWatts(0);
	}
	public static Watts getWattsInstance() throws OutOfRange {
		return new Watts(0);
	}
	
}