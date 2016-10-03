import java.util.Scanner; 
public class RCircle
{
	public static void main(String[]args)
	{
		RCircle sa = new RCircle();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the radius of the sphere");
		double r = keyboard.nextDouble();

		print(calcArea(r));
		
	}
	public static double calcArea(double r)
	{
		return (((r*r)*3.14)*4);
	}
	public static void print(double sa)
	{
		System.out.printf("The surface area of your sphere is " + sa);
	}
}
