package mise.marssa.footprint.datatypes.decimal.pressure;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;


@XmlType(name = "PSI", factoryClass = TypeFactory.class, factoryMethod = "getPSIInstance")
public class PSI extends APressure {

	public PSI(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		return value * 0.0689475f;
	}

	@Override
	public float getMBars() {
		return value * 68.9475f;
	}

	@Override
	public float getPa() {
		return value * 6894.75f;
	}

	@Override
	public float getKPa() {
		return value * 6.89475f;
	}

	@Override
	public float getMMHg() {
		return value * 51.71487786825f;
	}

	@Override
	public float getPSI() {
		return value;
	}
}
