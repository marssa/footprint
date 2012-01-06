package mise.marssa.footprint.data_types;

import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class MString {
	private String contents;

	public MString(String contents) {
		this.contents = contents;
	}

	public String getContents() {
		return contents;
	}

	public String toString() {
		return contents;
	}

	public MString toJSON() {
		return new MString(new JSONSerializer().deepSerialize(this));
	}
}