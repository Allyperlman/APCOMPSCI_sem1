import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the value of the side");
		side = keyboard.nextDouble();
		calcSurf();
		print();
		
	}
	
	public static void calcSurf()
	{
		sa = ((side*side)*6);
	}
	public static void print(){
		
		System.out.printf("The surface area of a cube with " + side + " sides is  " + " :: %2.2f", sa );
}
}
