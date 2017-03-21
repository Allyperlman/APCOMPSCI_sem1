public abstract class Car implements Location
{
	int ID;
	private double cx, cy;
	public Car()
	{
		ID = (int)(Math.random() * 999999) + 1;
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