package mise.marssa.footprint.datatypes.time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.GenericGenerator;

import flexjson.JSONSerializer;
import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "ATime", factoryClass = TypeFactory.class, factoryMethod = "getATimeInstance")
@Entity
@Inheritance(strategy=javax.persistence.InheritanceType.TABLE_PER_CLASS)
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
	
	@Id
	@Column(name = "id")	
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	Long id;

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

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
