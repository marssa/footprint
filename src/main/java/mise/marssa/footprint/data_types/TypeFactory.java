/**
 * 
 */
package mise.marssa.footprint.data_types;

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
}