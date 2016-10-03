import java.util.Scanner; 
public class RAverage
{
	public static void main(String[]args)
	{
		RAverage average = new RAverage();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1 = keyboard.nextInt();
		System.out.println("Enter the second number");
		int num2 = keyboard.nextInt();
		System.out.println("Enter the third number");
		int num3 = keyboard.nextInt();

		print(calcAvg(num1, num2, num3));
		
	}
	public static int calcAvg(int num1, int num2, int num3)
	{
		return (num1+num2+num3)/3;
	}
	public static void print(int average)
	{
		System.out.printf("The average of your numbers is " + average);
	}
}
