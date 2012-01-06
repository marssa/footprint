/**
 * 
 */
package mise.marssa.footprint.data_types;

import mise.marssa.footprint.data_types.float_datatypes.flow.AVolumeFlow;
import mise.marssa.footprint.data_types.float_datatypes.flow.CFPH;
import mise.marssa.footprint.data_types.float_datatypes.flow.CFPM;
import mise.marssa.footprint.data_types.float_datatypes.flow.CFPS;
import mise.marssa.footprint.data_types.float_datatypes.flow.LPH;
import mise.marssa.footprint.data_types.float_datatypes.flow.LPM;
import mise.marssa.footprint.data_types.float_datatypes.flow.LPS;
import mise.marssa.footprint.data_types.float_datatypes.flow.MCPH;
import mise.marssa.footprint.data_types.float_datatypes.flow.MCPM;
import mise.marssa.footprint.data_types.float_datatypes.flow.MCPS;
import mise.marssa.footprint.data_types.float_datatypes.frequency.AFrequency;
import mise.marssa.footprint.data_types.float_datatypes.frequency.Hz;
import mise.marssa.footprint.data_types.float_datatypes.frequency.KHz;
import mise.marssa.footprint.data_types.float_datatypes.pressure.APressure;
import mise.marssa.footprint.data_types.float_datatypes.pressure.Bar;
import mise.marssa.footprint.data_types.float_datatypes.pressure.KPa;
import mise.marssa.footprint.data_types.float_datatypes.pressure.MBars;
import mise.marssa.footprint.data_types.float_datatypes.pressure.MMHg;
import mise.marssa.footprint.data_types.float_datatypes.pressure.PSI;
import mise.marssa.footprint.data_types.float_datatypes.pressure.Pascals;
import mise.marssa.footprint.data_types.float_datatypes.speed.ASpeed;
import mise.marssa.footprint.data_types.float_datatypes.speed.KPH;
import mise.marssa.footprint.data_types.float_datatypes.speed.Knots;
import mise.marssa.footprint.data_types.float_datatypes.speed.MPH;
import mise.marssa.footprint.data_types.float_datatypes.speed.MPS;
import mise.marssa.footprint.data_types.float_datatypes.speed.PercentSpeed;
import mise.marssa.footprint.data_types.float_datatypes.temperature.ATemperature;
import mise.marssa.footprint.data_types.float_datatypes.temperature.DegreesCelcius;
import mise.marssa.footprint.data_types.float_datatypes.temperature.Fahrenheit;
import mise.marssa.footprint.data_types.float_datatypes.temperature.Kelvin;
import mise.marssa.footprint.data_types.float_datatypes.volume.AVolume;
import mise.marssa.footprint.data_types.float_datatypes.volume.Gallons;
import mise.marssa.footprint.data_types.float_datatypes.volume.ImpGallons;
import mise.marssa.footprint.data_types.float_datatypes.volume.Litres;
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
	
	//Frequency
	public static AFrequency getAFrequencyInstance() throws OutOfRange {
		return new Hz(100l);
	}
	public static Hz getHzInstance() throws OutOfRange {
		return new Hz(100l);
	}
	public static KHz getKHzInstance() throws OutOfRange {
		return new KHz(100l);
	}
	
	//Flow
	
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
	
	//Pressure
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
	
	//Speed
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
	
	//Temperature
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
	
	//Volume
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
	
	

}