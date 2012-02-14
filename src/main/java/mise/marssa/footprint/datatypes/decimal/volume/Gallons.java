package mise.marssa.footprint.datatypes.decimal.volume;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

@XmlType(name = "Gallons", factoryClass = TypeFactory.class, factoryMethod = "getGallonsInstance")
public class Gallons extends AVolume {
	public Gallons(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLiters() {
		return value * (float) 3.78541178 ;
	}

	@Override
	public float getGallon() {
		return value;
	}

	@Override
	public float getImpGallon() {
		return value * (float) 0.83267384 ;
	}
}
