package mise.marssa.footprint.datatypes.decimal;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "DegreesFloat", factoryClass = TypeFactory.class, factoryMethod = "getDegreesFloatInstance")
public class DegreesFloat extends MFloat {

	public DegreesFloat(float value) {
		super(value);
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
	
}