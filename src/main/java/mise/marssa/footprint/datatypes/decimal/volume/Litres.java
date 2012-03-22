package mise.marssa.footprint.datatypes.decimal.volume;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

@XmlType(name = "Litres", factoryClass = TypeFactory.class, factoryMethod = "getLitresInstance")
@Entity
public class Litres extends AVolume {

	private static Logger Litres = (Logger) LoggerFactory.getLogger("Litres");

	public Litres(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLiters() {
		Litres.trace(MMarker.GETTER,"Getting Litres: {}",value);
		return value;
	}

	@Override
	public float getGallon() {
		Litres.trace(MMarker.GETTER,"Converting from Litres to Gallon : {}",value * 0.264172052f );
		return value * 0.264172052f;
	}

	@Override
	public float getImpGallon() {
		Litres.trace(MMarker.GETTER,"Converting from Litres to ImpGallon : {}",value * 0.219969157f);
		return value * 0.219969157f;
	}
}
