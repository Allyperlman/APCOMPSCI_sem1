public class Honda implements Location
{
	private double cx, cy;
	
	public Honda()
	{
		cx = 0;
		cy = 0;		
	}
	
	public Honda(double[] inpc)
	{
		cx = inpc[0];
		cy = inpc[1];
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