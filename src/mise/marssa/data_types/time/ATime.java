package mise.marssa.data_types.time;

import flexjson.JSONSerializer;
import mise.marssa.data_types.MString;
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

	@Override
	public java.lang.String toString() {
		return "HHMMSSS: " + this.getHour() + ":" + this.getMinutes() + ":" + this.getSeconds();
	};
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
}