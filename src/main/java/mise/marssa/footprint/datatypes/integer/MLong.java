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
import flexjson.JSONSerializer;

/**
 * @author Clayton Tabone
 * @version 1.0
 * @created 22-Sep-2011 13:45:20
 */
@XmlType(name = "MLong", factoryClass = TypeFactory.class, factoryMethod = "getMLongInstance")
@Entity
@Inheritance(strategy=javax.persistence.InheritanceType.TABLE_PER_CLASS)
public class MLong {

	@XmlElement
	protected long value;

	public MLong(long value) {
		this.value = value;
	}

	public void finalize() throws Throwable {

	}

	public long getValue() {
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
		return java.lang.Long.toString(value);
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}
