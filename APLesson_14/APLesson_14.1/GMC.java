public class GMC extends Car
{
	private double cx, cy;
	
	public GMC()
	{
		super();
		cx = 0;
		cy = 0;		
	}
	
	public GMC(double x, double y)
	{
		super();
		cx = x;
		cy = y;
	}
	
	public void move(double x, double y)
	{
		
		cx += x;
		cy += y;
	}
	
	public double[] getLoc()
	{
		double location[] = new double[2];
		location[0] = cx;
		location[1] = cy;
		return location;
	}
	
	public int getID()
	{
		return ID;
	}
}