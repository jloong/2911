package lab02;

public class NanoTimer implements Timer
{
	public static long currentTime ()
	{
		return System.nanoTime ();
	}
	
	public enum State {
		STOPPED, SUSPENDED, TIMING
	}
	
	private Interval elapsed = new NanoInterval(0);
	private long startTime = 0;
	private long suspendTime = 0;
	private long stopTime = 0;
	private State state = State.STOPPED;
	
	
	public void start ()
	{
		switch(state) {
			case STOPPED: 
				state = State.TIMING;
				elapsed = new NanoInterval(0);
				startTime = currentTime();
				break;
			case SUSPENDED:
				state = State.TIMING;
				break;
			case TIMING:
				elapsed = new NanoInterval(0);
				break;
		}
	}

	public Interval elapsed ()
	{
		if (state == State.SUSPENDED) {
			elapsed = elapsed.add(startTime, suspendTime);
			return elapsed;
			
		}
		else if (state == State.TIMING) {
			elapsed = elapsed.add(startTime, currentTime());
			//Move start time to current so adding doesn't compound
			startTime= currentTime();
			return elapsed;
		} else {
			if ( stopTime> 0 ) {
				elapsed = elapsed.add(startTime, stopTime);
				return elapsed;
			}
			return new NanoInterval(0);	
		}
	}
	
	public void stop ()
	{
		if (state == State.TIMING) {
			stopTime= currentTime();
		}
		state = State.STOPPED;	
	}

	public void suspend ()
	{
		if (state == State.TIMING) {
			state = State.SUSPENDED;
			suspendTime= currentTime();
		}
	}

	public void resume ()
	{
		if (state == State.SUSPENDED) {
			state = State.TIMING;
			startTime= currentTime();
			suspendTime= 0;
		}
	}
	
}