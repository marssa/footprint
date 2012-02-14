package mise.marssa.footprint.datatypes.composite;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
@XmlType(name = "Attitude", factoryClass = TypeFactory.class, factoryMethod = "getAttitudeInstance")
public class Attitude {

	private Pitch pitch;
	private Roll roll;
	private Yaw yaw;

	public Attitude(Pitch pitch, Roll roll, Yaw yaw) {
		this.pitch = pitch;
		this.roll = roll;
		this.yaw = yaw;
	}

	public void finalize() throws Throwable {

	}
	@XmlElement
	public Pitch getPitch() {
		return pitch;
	}
	@XmlElement
	public Roll getRoll() {
		return roll;
	}
	@XmlElement
	public Yaw getYaw() {
		return yaw;
	}

	public java.lang.String toString() {
		return "[" + pitch.toString() + ", " + roll.toString() + ", "
				+ yaw.toString() + "]";
	}
	
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}