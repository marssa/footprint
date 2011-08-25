package mise.marssa.data_types;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class MBoolean {
	protected boolean value;
	
	public MBoolean(boolean value) {
		this.value = value ;
	}
	
	public void setValue(boolean newValue)
	{
		this.value = newValue;
	}
	
	public void toggleValue()
	{
		this.value = !value;
	}
	
	public boolean getValue() {
		return value;
	}
}