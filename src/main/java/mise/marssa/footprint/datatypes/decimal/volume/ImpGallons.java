
package mise.marssa.footprint.datatypes.decimal.volume;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

@XmlType(name = "ImpGallons", factoryClass = TypeFactory.class, factoryMethod = "getImpGallonsInstance")
public class ImpGallons extends AVolume {

	public ImpGallons(float value) throws OutOfRange {
		super(value);
	}
	
	@Override
	public float getLiters() {
		return value *(float)4.54609188;
	}

	@Override
	public float getGallon() {
		return value *(float)1.20095042;
	}

	@Override
	public float getImpGallon() {
		return value;
	}
}
