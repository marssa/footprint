package mise.marssa.footprint.data_types;

import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class MDate extends java.util.Date {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MDate(long date) {
		super(date);
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
		
}
