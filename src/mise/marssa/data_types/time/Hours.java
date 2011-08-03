/**
 * 
 */
package mise.marssa.data_types.time;

/**
 * @author Alan Grech
 *
 */
public class Hours extends ATime {
	
	public Hours(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		return time * 60 * 60 * 1000;
	}

	@Override
	public long getSeconds() {
		return time * 60 * 60;
	}

	@Override
	public long getMinutes() {
		return time * 60;
	}
	
	@Override
	public long getHour() {
		return time;
	}
}
