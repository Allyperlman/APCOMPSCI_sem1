public class BiggestNumber
{
	static int[] Array;
	public static void main(String[]args)
	{
		Array = new int[10];
		fillArray();
		System.out.println("All the numbers:: ");
		printArray();
		System.out.println("\nThe biggest is:: ");
		getBiggest();
	}
	
	public static void fillArray()
	{ 
		for(int i = 0; i < Array.length; i++)
		{
			Array[i] = (int)((Math.random()* 100) + 1);
		}
	
	}
	public static void printArray()
	{
		for(int num : Array)
		{
			System.out.print(num + " " );
		}
	}
	public static void getBiggest()
	{
		int max = 0;
		for(int biggest : Array)
		{
			if (biggest > max)
				max = biggest;
		}
		System.out.println( max);
	}
}