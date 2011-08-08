package mise.marssa.data_types;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class MString {
	private java.lang.String contents;
	
	public MString(java.lang.String contents) {
		this.contents = contents;
	}

	public void finalize() throws Throwable {

	}
	
	public java.lang.String getContents() {
		return contents;
	}
}