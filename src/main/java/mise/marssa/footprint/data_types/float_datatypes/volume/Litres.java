package mise.marssa.footprint.data_types.float_datatypes.volume;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

@XmlType(name = "Litres", factoryClass = TypeFactory.class, factoryMethod = "getLitresInstance")
public class Litres extends AVolume {

	public Litres(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLiters() {
		return value;
	}

	@Override
	public float getGallon() {
		return value * 0.264172052f;
	}

	@Override
	public float getImpGallon() {
		return value * 0.219969157f;
	}
}
