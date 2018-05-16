package Clock;

/**
A simulated digital clock.
*/
public class Clock{

	private int hours;
	private int minutes;
	private int count;
	
	/**
	   Advances this clock to the next minute.
	*/
	public void pulse()
	{
	   count +=1;
	}
	
	/**
	   Gets the hours of this clock.
	   @return the hours (between 0 and 23)
	*/
	public int getHours()
	{
		if (count/60==24) {
			return 0;
		}
	   return count/60;
	}
	
	/**
	   Gets the minutes of this clock.
	   @return the minutes (between 0 and 59)
	*/
	public int getMinutes()
	{
	   return count%60;
	}
	}