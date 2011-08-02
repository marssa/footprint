package mise.marssa.data_types;

/**
 * @author Alan
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class Boolean {
	protected boolean value;
	
	public Boolean(boolean value) {
		this.value = value ;
	}

	public void finalize() throws Throwable {

	}
	
	public boolean getValue() {
		return value;
	}
	
}