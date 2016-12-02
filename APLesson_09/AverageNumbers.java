import java.util.Scanner;
public class AverageNumbers
{
	
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)((Math.random()* 100) + 1);
		}
	
		for(int value:numbers)
		{
			System.out.print(value + " ");
		}
		System.out.println("\nThe average of the numbers above is..." + average(numbers));
	}
	
	public static int average(int[]intarray)
	{
		int average = 0;
		for( int value: intarray)
		{
			average += value;
		}
			
		return average/ intarray.length;
	}
}	