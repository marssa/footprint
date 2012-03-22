package mise.marssa.footprint.datatypes.decimal.volume;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

@XmlType(name = "Gallons", factoryClass = TypeFactory.class, factoryMethod = "getGallonsInstance")
@Entity
public class Gallons extends AVolume {
	private static Logger Gallons = (Logger) LoggerFactory.getLogger("Gallons");

	public Gallons(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLiters() {
		Gallons.trace(MMarker.GETTER,"Converting from Gallons to Litres : {}",value * (float) 3.78541178 );
		return value * (float) 3.78541178 ;
	}

	@Override
	public float getGallon() {
		Gallons.trace(MMarker.GETTER,"Getting Gallons: {}",value);
		return value;
	}

	@Override
	public float getImpGallon() {
		Gallons.trace(MMarker.GETTER,"Converting from Gallons to ImpGallon : {}",value * (float) 0.83267384);
		return value * (float) 0.83267384 ;
	}
}
