public class Toyota implements Location
{	
	private String sc;
	private double cx;
	private double cy;
	
	public Toyota()
	{
		sc = "";		
	}
	
	public Toyota(String inp)
	{
		sc = inp;
	}
	
	public double[] getLoc()
	{
		String str = sc;
		String[] sp = sc.split(", ");
		cx = Double.valueOf(sp[0]).doubleValue();
		cy = Double.valueOf(sp[1]).doubleValue();
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