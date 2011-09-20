package mise.marssa.interfaces.engine;

import mise.marssa.data_types.float_datatypes.MFloat;
import mise.marssa.data_types.float_datatypes.flow.AVolumeFlow;

/**
 * @author Alan Grech
 *
 */

public interface IEngine {
	
	public MFloat getRPM();
	
	public AVolumeFlow getFuelFlowRate();
	
	
	
}
