package mise.marssa.footprint.datatypes.decimal.distance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.hibernate.annotations.GenericGenerator;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * Metres is the SI Unit
 * 
 * @author Lifebook
 * @version 1.0
 * @updated 08-Jul-2011 15:00:22
 */
@XmlType(name = "Metres", factoryClass = TypeFactory.class, factoryMethod = "getMetresInstance")
@Entity
public class Metres extends ADistance {

	private static Logger Metres = (Logger) LoggerFactory.getLogger("Metres");
	
	public Metres(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKM() {
		Metres.trace(MMarker.GETTER,"Converting from Metres to Km: {}",value / 1000);
		return value / 1000;
	}

	@Override
	@Column(name = "Meters")	
	public float getMetres() {
		Metres.trace(MMarker.GETTER,"Getting Metres: {}",value);
		return value;
	}

	@Override
	public float getMiles() {
		Metres.trace(MMarker.GETTER,"Converting from Metres to Miles: {}",value * (float) 0.000621371192);
		return value * (float) 0.000621371192;
	}

	@Override
	public float getNM() {		
		Metres.trace(MMarker.GETTER,"Converting from Metres to NMiles: {}",value * (float) 0.000539956803);
		return value * (float) 0.000539956803;
	}

	@Override
	public float getFathoms() {
		Metres.trace(MMarker.GETTER,"Converting from Metres to Fathoms: {}",value * (float) 0.546806649);
		return value * (float) 0.546806649;
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
}