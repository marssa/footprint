package mise.marssa.data_types;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class String {
	private java.lang.String contents;
	
	public String(java.lang.String contents) {
		this.contents = contents;
	}

	public void finalize() throws Throwable {

	}
	
	public java.lang.String getContents() {
		return contents;
	}
}