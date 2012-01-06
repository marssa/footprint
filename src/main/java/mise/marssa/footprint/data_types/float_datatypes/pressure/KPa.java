package mise.marssa.footprint.data_types.float_datatypes.pressure;

import javax.xml.bind.annotation.XmlType;

import flexjson.JSON;
import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

@XmlType(name = "KPa", factoryClass = TypeFactory.class, factoryMethod = "getKPaInstance")
public class KPa extends APressure {

	public KPa(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		return value * 0.01f;
	}

	@Override
	public float getMBars() {
		return value * 10f ;
	}

	@Override
	public float getPa() {
		return value * 1000f;
	}

	@JSON
	@Override
	public float getKPa() {
		return value;
	}

	@Override
	public float getMMHg() {
		return value * 7.500616827042f;
	}

	@Override
	public float getPSI() {
		return value * 0.1450378911491f;
	}
}
