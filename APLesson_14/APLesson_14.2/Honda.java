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
	
}