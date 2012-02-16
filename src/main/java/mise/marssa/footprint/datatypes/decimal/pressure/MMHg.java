package mise.marssa.footprint.datatypes.decimal.pressure;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

@XmlType(name = "MMHg", factoryClass = TypeFactory.class, factoryMethod = "getMMHgInstance")
public class MMHg extends APressure {

	private static Logger MMHg = (Logger) LoggerFactory.getLogger("MMPg");

	public MMHg(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		MMHg.trace(MMarker.GETTER,"Converting from MMHg to Bars : {}",value * 0.001333223684211f);
		return value * 0.001333223684211f;
	}

	@Override
	public float getMBars() {
		MMHg.trace(MMarker.GETTER,"Converting from MMHg to MBars : {}",value * 1.333223684211f);
		return value * 1.333223684211f;
	}

	@Override
	public float getPa() {
		MMHg.trace(MMarker.GETTER,"Converting from MMHg to Pascals : {}",value * 133.3223684211f);
		return value * 133.3223684211f;
	}

	@Override
	public float getKPa() {
		MMHg.trace(MMarker.GETTER,"Converting from MMHg to KPa : {}",value * 0.1333223684211f);
		return value * 0.1333223684211f;
	}

	@Override
	public float getMMHg() {
		MMHg.trace(MMarker.GETTER,"Getting MMHg: {}",value);
		return value;
	}

	@Override
	public float getPSI() {
		MMHg.trace(MMarker.GETTER,"Converting from MMHg to PSI : {}",value * 0.01933679515879f);
		return value * 0.01933679515879f;
	}
}
