import java.util.Scanner; //import.Statement
public class SubwooferBoxes
{
	public static void main(String[]args)
	{
		SubwooferBoxes boxes = new SubwooferBoxes();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the height");
		double h = keyboard.nextDouble();
		System.out.println("Enter the length");
		double l = keyboard.nextDouble();
		System.out.println("Enter the width");
		double w = keyboard.nextDouble();
		System.out.printf("The volume of your subwoofer box is %3.2f cubic feet",boxes.calcVol(h,l,w));
		
	}
	
	public double calcVol(double h, double l, double w)
	{
		return ((h*l*w)/1728);
	}
}
