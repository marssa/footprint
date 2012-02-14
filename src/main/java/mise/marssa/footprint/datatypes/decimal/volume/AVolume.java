/**
 * @author Warren Zahra
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
package mise.marssa.footprint.datatypes.decimal.volume;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

@XmlType(name = "AVolume", factoryClass = TypeFactory.class, factoryMethod = "getAVolumeInstance")
public abstract class AVolume extends UnsignedFloat {

	public AVolume(float value) throws OutOfRange {
		super(value);
	}

	abstract public float getLiters();

	abstract public float getGallon();

	/**
	 * Imperial Gallons
	 * 
	 * @return
	 */
	abstract public float getImpGallon();

	@Override
	public String toString() {
		return "Volume in " + this.getClass().getSimpleName() + " = " + value;
	}
}
