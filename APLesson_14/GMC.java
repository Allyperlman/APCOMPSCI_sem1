public class GMC implements Location
{
	private double cx, cy;
	
	public GMC()
	{
		cx = 0;
		cy = 0;		
	}
	
	public GMC(double x, double y)
	{
		cx = x;
		cy = y;
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
		return (int)(Math.random() * 999999) + 1;
	}
}