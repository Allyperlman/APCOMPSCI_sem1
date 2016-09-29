import java.util.Scanner;
public class Circle
{
	static double r;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the radius of the sphere");
		r = keyboard.nextDouble();
		calcArea();
		print();
		
	}
	
	public static void calcArea()
	{
		sa = (((r*r)*3.14)*4);
	}
	public static void print(){
		
		System.out.printf("The surface area of a sphere with " + r + " radius is  " + " :: %2.2f", sa );
}
}
