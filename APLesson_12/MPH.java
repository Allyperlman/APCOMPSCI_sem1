import java.lang.Math.*;
 public class MPH
 {
 	private int distance, hours, minutes;
 	private double MilesPerHour;
 	
 	public MPH()
 	{
 		distance = 0;
 		hours = 0;
 		minutes = 0;
		MilesPerHour = 0;
 	}
 	
 	public MPH(int dist, int hour, int mins)
 	{
 		distance = dist;
 		hours = hour;
 		minutes = mins;
 		MilesPerHour = 0;
 	}

 	public void setValues(int dist, int hour, int mins)
 	{
 		distance = dist;
 		hours = hour;
 		minutes = mins;
		MilesPerHour = 0;
 	}
 	
 	public int getDistance()
 	{
 		return distance;
 	}
 	public int getHours()
 	{
 		return hours;
 	}
 	public int getMinutes()
 	{
 		return minutes;
 	}
 	
 	public double getMPH()
 	{
 		return (distance/(hours + (minutes / 60.0)));
 	}
 } 