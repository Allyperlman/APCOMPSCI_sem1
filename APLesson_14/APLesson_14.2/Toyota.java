import java.util.ArrayList;
import java.util.Arrays;
public class Toyota extends Car
{	
	private String sc;
	private double cx, cy;
	
	
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
}