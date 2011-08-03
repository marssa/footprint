package mise.marssa.data_types.time;

public class Seconds extends ATime {

	public Seconds(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		return time * 1000;
	}

	@Override
	public long getSeconds() {
		return time;
	}

	@Override
	public long getMinutes() {
		return time / 60;
	}

	@Override
	public long getHour() {
		return time / (60* 60);
	}
}
