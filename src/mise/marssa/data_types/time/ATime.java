package mise.marssa.data_types.time;

import mise.marssa.data_types.conversion_interfaces.ITime;

/**
 * @author Alan
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public abstract class ATime implements ITime{

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	protected long time;
	
	public ATime(long time) {
		this.time = time;
		//super(time);
	}

	public void finalize() throws Throwable {

	}

	@Override
	public java.lang.String toString() {
		return "HHMMSSS: " + this.getHour() + ":" + this.getMinutes() + ":" + this.getSeconds();
	};
}