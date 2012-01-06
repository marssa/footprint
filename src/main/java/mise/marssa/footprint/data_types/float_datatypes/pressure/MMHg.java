package mise.marssa.footprint.data_types.float_datatypes.pressure;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

@XmlType(name = "MMHg", factoryClass = TypeFactory.class, factoryMethod = "getMMHgInstance")
public class MMHg extends APressure {

	public MMHg(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		return value * 0.001333223684211f;
	}

	@Override
	public float getMBars() {
		return value * 1.333223684211f;
	}

	@Override
	public float getPa() {
		return value * 133.3223684211f;
	}

	@Override
	public float getKPa() {
		return value * 0.1333223684211f;
	}

	@Override
	public float getMMHg() {
		return value;
	}

	@Override
	public float getPSI() {
		return value * 0.01933679515879f;
	}
}
