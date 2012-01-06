
package mise.marssa.footprint.data_types.time;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import flexjson.JSONSerializer;
import mise.marssa.footprint.data_types.MString;
import mise.marssa.footprint.data_types.TypeFactory;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "ATime", factoryClass = TypeFactory.class, factoryMethod = "getATimeInstance")
public abstract class ATime {

	@XmlElement
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
		return "HHMMSSS: " + (int) Math.floor(getHour()) + ":"
				+ (int) Math.floor(getMinutes()) % 60 + ":" + getSeconds() % 60;
	}

	public MString toJSON() {
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}
