package mise.marssa.footprint.datatypes.decimal.pressure;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;
import flexjson.JSON;

@XmlType(name = "KPa", factoryClass = TypeFactory.class, factoryMethod = "getKPaInstance")
@Entity
public class KPa extends APressure {

	private static Logger KPa = (Logger) LoggerFactory.getLogger("Kpa");

	public KPa(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		KPa.trace(MMarker.GETTER,"Converting from KPa to Bars : {}",value * 0.01f);
		return value * 0.01f;
	}

	@Override
	public float getMBars() {
		KPa.trace(MMarker.GETTER,"Converting from KPa to MBars : {}",value * 10f);
		return value * 10f ;
	}

	@Override
	public float getPa() {
		KPa.trace(MMarker.GETTER,"Converting from KPa to Pascals : {}",value * 1000f);
		return value * 1000f;
	}

	@JSON
	@Override
	public float getKPa() {
		KPa.trace(MMarker.GETTER,"Getting KPa: {}",value);
		return value;
	}

	@Override
	public float getMMHg() {
		KPa.trace(MMarker.GETTER,"Converting from KPa to MMHg : {}",value * 7.500616827042f);
		return value * 7.500616827042f;
	}

	@Override
	public float getPSI() {
		KPa.trace(MMarker.GETTER,"Converting from KPa to PSI : {}",value * 0.1450378911491f);
		return value * 0.1450378911491f;
	}
}
