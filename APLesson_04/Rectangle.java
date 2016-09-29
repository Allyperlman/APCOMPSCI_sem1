import java.util.Scanner; 
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the length");
		l = keyboard.nextDouble();
		System.out.println("Enter the width");
		w = keyboard.nextDouble();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = l*w;
	}
	
	public static void print(){
		
		System.out.printf("Your rectangle is  %3.2f feet around", perimeter);
}
}
