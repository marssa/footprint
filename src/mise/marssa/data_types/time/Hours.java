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
		// TODO Auto-generated constructor stub
	}

	@Override
	public long getMilliseconds() {
		// TODO Auto-generated method stub
		return time * 60 * 60 * 1000;
	}

	@Override
	public long getSeconds() {
		// TODO Auto-generated method stub
		return time * 60 * 60;
	}

	@Override
	public long getHour() {
		// TODO Auto-generated method stub
		return time;
	}

	@Override
	public long getMinutes() {
		// TODO Auto-generated method stub
		return time * 60;
	}
	

}
