import java.util.ArrayList;
import java.util.Arrays;
public class Toyota extends Car
{	
	private String sc;
	private double cx;
	private double cy;
	
	public Toyota()
	{	
	
	}
	
	public Toyota(String inp)
	{
		super();
		ArrayList<String> cz = new ArrayList<>(Arrays.asList(inp.split(", ")));
		double x = Double.parseDouble(cz.get(0));
		double y = Double.parseDouble(cz.get(1));
		move(x,y);
	}
	
	public void move(double x, double y)
	{
		cx += x;
		cy += y;
	}
	
	public double[] getLoc()
	{
		double[] location = {cx, cy};
		return location;
	}
	
	public int getID()
	{
		return ID;
	}
}