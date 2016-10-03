import java.util.Scanner; 
public class RCube
{
	public static void main(String[]args)
	{
		RCube sa = new RCube();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the length of the side");
		int side = keyboard.nextInt();

		print(calcSurf(side));
		
	}
	public static int calcSurf(int side)
	{
		return ((side*side)*6);
	}
	public static void print(int sa)
	{
		System.out.printf("The surface area of your cube is " + sa);
	}
}
