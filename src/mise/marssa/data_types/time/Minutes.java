/**
 * 
 */
package mise.marssa.data_types.time;

/**
 * @author Lifebook
 *
 */
public class Minutes extends ATime {

	public Minutes(long time) {
		super(time);
		// TODO Auto-generated constructor stub
	}

	@Override
	public long getMilliseconds() {
		// TODO Auto-generated method stub
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
