package mise.marssa.footprint.data_types.time;

import flexjson.JSONSerializer;
import mise.marssa.footprint.data_types.MString;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public abstract class ATime {

	/**
	 * 
	 */
	protected long time;
	
	public ATime(long time) {
		this.time = time;
	}
	
	abstract public long getMilliseconds();
	abstract public long getSeconds();
	abstract public long getMinutes();
	abstract public long getHour();

	@Override
	public java.lang.String toString() {
		return "HHMMSSS: " + this.getHour() + ":" + this.getMinutes() + ":" + this.getSeconds();
	};
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
}