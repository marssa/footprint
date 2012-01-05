/**
 * 
 */
package mise.marssa.footprint.data_types.time;

/**
 * @author Lifebook
 *
 */
public class Milliseconds extends ATime{

	public Milliseconds(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		return time;
	}

	@Override
	public long getSeconds() {
		return time / 1000;
	}

	@Override
	public long getMinutes() {
		return time / (1000*60);
	}

	@Override
	public long getHour() {
		return time / (1000*60*60);
	}
}
