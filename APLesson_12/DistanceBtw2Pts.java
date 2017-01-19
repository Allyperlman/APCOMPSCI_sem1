import java.lang.Math.*;
public class DistanceBtw2Pts
 {
 	private int xOne, yOne, xTwo, yTwo;
 	private double distance;
 	
 	public DistanceBtw2Pts()
 	{
 		xOne = 0;
 		xTwo = 0;
 		yOne = 0;
 		yTwo = 0;
 		distance = 0;
 	}
 	
 	public DistanceBtw2Pts(int x1, int y1, int x2, int y2)
 	{
 		xOne = x1;
 		yOne = y1;
 		xTwo = x2;
 		yTwo = y2;
 		distance = 0;
 	}
 	
 	public void setValues(int x1, int y1, int x2, int y2)
 	{
 		xOne = x1;
 		yOne = y1;
 		xTwo = x2;
 		yTwo = y2;
 	}
 	
 	public int getX1()
 	{
 		return xOne;
 	}
 	public int getY1()
 	{
 		return yOne;
 	}
 	public int getX2()
 	{
 		return xTwo;
 	}
 	public int getY2()
 	{
 		return yTwo;
 	}
 	public double getDistance()
 	{
 		return Math.sqrt((xTwo-xOne)*(xTwo-xOne) + (yTwo-yOne)*(yTwo-yOne));
 	}
 } 