package mise.marssa.footprint.datatypes.decimal;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "PercentageFloat", factoryClass = TypeFactory.class, factoryMethod = "getPercentageFloatInstance")
public class PercentageFloat extends MFloat {

	public PercentageFloat(float value) throws OutOfRange {
		super(value);
		if((value < -100f) || (value > 100f))
			throw new OutOfRange();
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
}