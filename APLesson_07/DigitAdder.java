import java.util.Scanner; 
public class DigitAdder
{
	static int num, sum;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		num = kb.nextInt();
		sum = 0;
		int number = num;
		sumDigits();
		System.out.println("the sum of the digits in " + number + " is  " + sum);
	}
	
	public static void sumDigits()
	{
		while(num > 0)
		{
			sum = sum + (num % 10);
			num = num / 10;
		}
	}	
		
}		