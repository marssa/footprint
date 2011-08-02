package mise.marssa.data_types.time;

import mise.marssa.data_types.conversion_interfaces.ITime;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public abstract class ATime implements ITime{

	/**
	 * 
	 */
	protected long time;
	
	public ATime(long time) {
		this.time = time;
	}

	public void finalize() throws Throwable {

	}


}