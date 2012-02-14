package mise.marssa.footprint.interfaces.engine;

import mise.marssa.footprint.datatypes.decimal.MFloat;
import mise.marssa.footprint.datatypes.decimal.flow.AVolumeFlow;

/**
 * @author Alan Grech
 *
 */

public interface IEngine {
	
	public MFloat getRPM();
	
	public AVolumeFlow getFuelFlowRate();
	
	
	
}
