package mise.marssa.footprint.datatypes.integer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.GenericGenerator;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import flexjson.JSON;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "MInteger", factoryClass = TypeFactory.class, factoryMethod = "getMIntegerInstance")
@Entity
@Inheritance(strategy=javax.persistence.InheritanceType.TABLE_PER_CLASS)
public class MInteger {

	@XmlElement
	protected int value;
	public MInteger(){}

	public MInteger(int value) {
		this.value = value;
	}

	public void finalize() throws Throwable {

	}
	@JSON
	public int getValue() {
		return value;
	}
	
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

	public java.lang.String toString() {
		return java.lang.Integer.toString(value);
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}
