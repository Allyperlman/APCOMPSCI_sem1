import java.util.Scanner; 
public class RRectangle
{
	public static void main(String[]args)
	{
		RRectangle perimeter = new RRectangle();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the length");
		int l = keyboard.nextInt();
		System.out.println("Enter the width");
		int w = keyboard.nextInt();

		print(calcPerim(l, w));
		
	}
	public static int calcPerim(int l, int w)
	{
		return 2*(l+w);
	}
	public static void print(int perimeter)
	{
		System.out.printf("The perimeter of your rectangle is " + perimeter);
	}
}
