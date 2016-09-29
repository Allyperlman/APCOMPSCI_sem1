import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		num1 = keyboard.nextDouble();
		System.out.println("Enter the second number");
		num2 = keyboard.nextDouble();
		System.out.println("Enter the third number");
		num3 = keyboard.nextDouble();
		average();
		print();
		
	}
	
	public static void average()
	{
		avg = ((num1+num2+num3)/3);
	}
	public static void print(){
		
		System.out.printf("The average of " + num1 + ", " +  num2 + ", " + "and " + num3 + " is:: %2.2f", avg );
}
}
