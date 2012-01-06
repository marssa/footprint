/**
 * 
 */
package mise.marssa.footprint.data_types.time;

/**
 * @author Alan Grech
 *
 */
public class Minutes extends ATime {
	
	public Minutes(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		return time * 60 * 1000;
	}

	@Override
	public long getSeconds() {
		return time * 60;
	}

	@Override
	public long getMinutes() {
		return time;
	}

	@Override
	public long getHour() {
		return time / 60;
	}
}
