public class Honda extends Car
{
	private double cx, cy;
	
	public Honda()
	{
		cx = 0;
		cy = 0;		
	}
	
	public Honda(double[] inpc)
	{
		super();
		cx = inpc[0];
		cy = inpc[1];
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