import java.util.Scanner; 
public class AverageDigits
{
	static int digits, average, num;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int number = kb.nextInt();
		digits = 0;
		average = 0;
		num = number;
		avDigits();
		System.out.println("the average of the digits in " + number + " is  " + average);
	}
	
	public static void avDigits()
	{
		while(num > 0)
		{
			digits++;
			average = average + (num % 10);
			num = num /10;
		}
		average = average / digits;
	}	
		
}		