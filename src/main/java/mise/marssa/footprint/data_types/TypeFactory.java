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

	//Time
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
	public static AFrequency getAFreqeuencyInstance() throws OutOfRange {
		return new Hz(100f);
	}	
	public static Hz getHzInstance() throws OutOfRange {
		return new Hz(100l);
	}	
	public static KHz getKHzInstance() throws OutOfRange {
		return new KHz(100l);
	}	
	//Flow
	public static AVolumeFlow getAVolumeFlowInstance() throws OutOfRange {
		return new LPH(100l);
	}	
	//TODO
	/*public static KHz getAMAssFlow() throws OutOfRange {
		return new KHz(100l);
	}
	*/
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
	
	
	
	
}