/**
 * 
 */
package mise.marssa.footprint.datatypes;
import mise.marssa.footprint.datatypes.composite.APosition;
import mise.marssa.footprint.datatypes.composite.Attitude;
import mise.marssa.footprint.datatypes.composite.Coordinate;
import mise.marssa.footprint.datatypes.composite.Latitude;
import mise.marssa.footprint.datatypes.composite.Longitude;
import mise.marssa.footprint.datatypes.composite.Pitch;
import mise.marssa.footprint.datatypes.composite.Roll;
import mise.marssa.footprint.datatypes.composite.Yaw;
import mise.marssa.footprint.datatypes.decimal.DegreesFloat;
import mise.marssa.footprint.datatypes.decimal.MFloat;
import mise.marssa.footprint.datatypes.decimal.PercentageFloat;
import mise.marssa.footprint.datatypes.decimal.UnsignedFloat;
import mise.marssa.footprint.datatypes.decimal.distance.ADistance;
import mise.marssa.footprint.datatypes.decimal.distance.KM;
import mise.marssa.footprint.datatypes.decimal.distance.Metres;
import mise.marssa.footprint.datatypes.decimal.distance.Miles;
import mise.marssa.footprint.datatypes.decimal.distance.NM;
import mise.marssa.footprint.datatypes.decimal.electrical.charge.ACharge;
import mise.marssa.footprint.datatypes.decimal.electrical.charge.Ah;
import mise.marssa.footprint.datatypes.decimal.electrical.charge.Coulombs;
import mise.marssa.footprint.datatypes.decimal.electrical.charge.mAh;
import mise.marssa.footprint.datatypes.decimal.electrical.current.ACurrent;
import mise.marssa.footprint.datatypes.decimal.electrical.current.Amps;
import mise.marssa.footprint.datatypes.decimal.electrical.current.MilliAmps;
import mise.marssa.footprint.datatypes.decimal.electrical.impedance.AImpedance;
import mise.marssa.footprint.datatypes.decimal.electrical.impedance.KOhms;
import mise.marssa.footprint.datatypes.decimal.electrical.impedance.MOhms;
import mise.marssa.footprint.datatypes.decimal.electrical.impedance.Ohms;
import mise.marssa.footprint.datatypes.decimal.electrical.power.APower;
import mise.marssa.footprint.datatypes.decimal.electrical.power.KWatts;
import mise.marssa.footprint.datatypes.decimal.electrical.power.MWatts;
import mise.marssa.footprint.datatypes.decimal.electrical.power.Watts;
import mise.marssa.footprint.datatypes.decimal.electrical.voltage.AVoltage;
import mise.marssa.footprint.datatypes.decimal.electrical.voltage.MilliVolts;
import mise.marssa.footprint.datatypes.decimal.electrical.voltage.Volts;
import mise.marssa.footprint.datatypes.decimal.flow.AVolumeFlow;
import mise.marssa.footprint.datatypes.decimal.flow.CFPH;
import mise.marssa.footprint.datatypes.decimal.flow.CFPM;
import mise.marssa.footprint.datatypes.decimal.flow.CFPS;
import mise.marssa.footprint.datatypes.decimal.flow.LPH;
import mise.marssa.footprint.datatypes.decimal.flow.LPM;
import mise.marssa.footprint.datatypes.decimal.flow.LPS;
import mise.marssa.footprint.datatypes.decimal.flow.MCPH;
import mise.marssa.footprint.datatypes.decimal.flow.MCPM;
import mise.marssa.footprint.datatypes.decimal.flow.MCPS;
import mise.marssa.footprint.datatypes.decimal.frequency.AFrequency;
import mise.marssa.footprint.datatypes.decimal.frequency.Hz;
import mise.marssa.footprint.datatypes.decimal.frequency.KHz;
import mise.marssa.footprint.datatypes.decimal.pressure.APressure;
import mise.marssa.footprint.datatypes.decimal.pressure.Bar;
import mise.marssa.footprint.datatypes.decimal.pressure.KPa;
import mise.marssa.footprint.datatypes.decimal.pressure.MBars;
import mise.marssa.footprint.datatypes.decimal.pressure.MMHg;
import mise.marssa.footprint.datatypes.decimal.pressure.PSI;
import mise.marssa.footprint.datatypes.decimal.pressure.Pascals;
import mise.marssa.footprint.datatypes.decimal.speed.ASpeed;
import mise.marssa.footprint.datatypes.decimal.speed.KPH;
import mise.marssa.footprint.datatypes.decimal.speed.Knots;
import mise.marssa.footprint.datatypes.decimal.speed.MPH;
import mise.marssa.footprint.datatypes.decimal.speed.MPS;
import mise.marssa.footprint.datatypes.decimal.speed.PercentSpeed;
import mise.marssa.footprint.datatypes.decimal.temperature.ATemperature;
import mise.marssa.footprint.datatypes.decimal.temperature.DegreesCelcius;
import mise.marssa.footprint.datatypes.decimal.temperature.Fahrenheit;
import mise.marssa.footprint.datatypes.decimal.temperature.Kelvin;
import mise.marssa.footprint.datatypes.decimal.volume.AVolume;
import mise.marssa.footprint.datatypes.decimal.volume.Gallons;
import mise.marssa.footprint.datatypes.decimal.volume.ImpGallons;
import mise.marssa.footprint.datatypes.decimal.volume.Litres;
import mise.marssa.footprint.datatypes.integer.*;
import mise.marssa.footprint.datatypes.time.ATime;
import mise.marssa.footprint.datatypes.time.Hours;
import mise.marssa.footprint.datatypes.time.Milliseconds;
import mise.marssa.footprint.datatypes.time.Minutes;
import mise.marssa.footprint.datatypes.time.Seconds;
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

	//Voltage
	public static AVoltage getAVoltageInstance() {
		return new Volts(100l);
	}

	public static MilliVolts getMilliVoltsInstance() {
		return new MilliVolts(100l);
	}

	public static Volts getVoltsInstance() {
		return new Volts(100l);
	}

	/**
	 * Frequency
	 */
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
	 * Flow
	 */

	/* TODO mass flow datatypes
	public static AMassFlow getAMassFlowInstance() throws OutOfRange {
		return new (100l);
	}*/

	public static AVolumeFlow getAVolumeFlowInstance() throws OutOfRange {
		return new CFPH(100l);
	}
	public static CFPH getCFPHInstance() throws OutOfRange {
		return new CFPH(100l);
	}
	public static CFPM getCFPMInstance() throws OutOfRange {
		return new CFPM(100l);
	}
	public static CFPS getCFPSInstance() throws OutOfRange {
		return new CFPS(100l);
	}
	public static LPH getLPHInstance() throws OutOfRange {
		return new LPH(100l);
	}
	public static LPM getLPMInstance() throws OutOfRange {
		return new LPM(100l);
	}
	public static LPS getLPSInstance() throws OutOfRange {
		return new LPS(100l);
	}
	public static MCPH getMCPHInstance() throws OutOfRange {
		return new MCPH(100l);
	}
	public static MCPM getMCPMInstance() throws OutOfRange {
		return new MCPM(100l);
	}
	public static MCPS getMCPSInstance() throws OutOfRange {
		return new MCPS(100l);
	}

	/**
	 * Pressure
	 */
	public static APressure getAPressureInstance() throws OutOfRange {
		return new Bar(100l);
	}
	public static Bar getBarInstance() throws OutOfRange {
		return new Bar(100l);
	}
	public static KPa getKPaInstance() throws OutOfRange {
		return new KPa(100l);
	}
	public static MBars getMBarsInstance() throws OutOfRange {
		return new MBars(100l);
	}
	public static MMHg getMMHgInstance() throws OutOfRange {
		return new MMHg(100l);
	}
	public static Pascals getPascalsInstance() throws OutOfRange {
		return new Pascals(100l);
	}
	public static PSI getPSIInstance() throws OutOfRange {
		return new PSI(100l);
	}

	/**
	 * Speed
	 */
	public static ASpeed getASpeedInstance() throws OutOfRange {
		return new Knots(100l);
	}
	public static  Knots getKnotsInstance() throws OutOfRange {
		return new Knots(100l);
	}
	public static KPH getKPHInstance() throws OutOfRange {
		return new KPH(100l);
	}
	public static MPH getMPHInstance() throws OutOfRange {
		return new MPH(100l);
	}
	public static MPS getMPSInstance() throws OutOfRange {
		return new MPS(100l);
	}
	public static PercentSpeed getPercentSpeedInstance() throws OutOfRange {
		return new PercentSpeed(100l);
	}

	/**
	 * Temperature
	 */
	public static ATemperature getATemperatureInstance() throws OutOfRange {
		return new DegreesCelcius(100l);
	}
	public static  DegreesCelcius getDegreesCelciusInstance() throws OutOfRange {
		return new DegreesCelcius(100l);
	}
	public static Fahrenheit getFahrenheitInstance() throws OutOfRange {
		return new Fahrenheit(100l);
	}
	public static Kelvin getKelvinInstance() throws OutOfRange {
		return new Kelvin(100l);
	}

	/**
	 * Volume
	 */
	public static AVolume getAVolumeInstance() throws OutOfRange {
		return new Litres(100l);
	}
	public static  Gallons getGallonsInstance() throws OutOfRange {
		return new Gallons(100l);
	}
	public static ImpGallons getImpGallonsInstance() throws OutOfRange {
		return new ImpGallons(100l);
	}
	public static Litres getLitresInstance() throws OutOfRange {
		return new Litres(100l);
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
		return new Latitude(getDegreesFloatInstance());
	}
	
	public static Attitude getAttitudeInstance() throws OutOfRange {
		return new Attitude(getPitchInstance(), getRollInstance(), getYawInstance());
	}
	
	public static Coordinate getCoordinateInstance() throws OutOfRange {
		return new Coordinate(getLatitudeInstance(),getLongitudeInstance());
	}
	
	public static Latitude getLatitudeInstance() throws OutOfRange {
		return new Latitude(getDegreesFloatInstance());
	}
	
	public static Longitude getLongitudeInstance() throws OutOfRange {
		return new Longitude(getDegreesFloatInstance());
	}
	
	public static Pitch getPitchInstance() throws OutOfRange {
		return new Pitch(getDegreesFloatInstance());
	}
	
	public static Roll getRollInstance() throws OutOfRange {
		return new Roll(getDegreesFloatInstance());
	}
	
	public static Yaw getYawInstance() throws OutOfRange {
		return new Yaw(getDegreesFloatInstance());
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
	public static PercentageFloat getPercentageFloatInstance() throws OutOfRange {
		return new PercentageFloat(0);
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

	/**
	 * Integer DataTypes
	 */

	public static DegreesInteger getDegreesIntegerInstance() throws OutOfRange {
		return new DegreesInteger(0);
	}
	
	public static MInteger getMIntegerInstance() throws OutOfRange {
		return new MInteger(0);
	}
	public static MLong getMLongInstance() throws OutOfRange {
		return new MLong(0);
	}
	public static PercentageInteger getPercentageIntegerInstance() throws OutOfRange {
		return new PercentageInteger(0);
	}
	
}