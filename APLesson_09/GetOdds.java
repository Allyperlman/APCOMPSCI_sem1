public class GetOdds
{
	static int[] Array;
	public static void main(String[]args)
	{
		Array = new int[10];
		fillArray();
		System.out.println("All the numbers:: ");
		printArray();
		System.out.println("\nAll the odds:: ");
		getOdds();
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
	public static void getOdds()
	{
		for(int odds : Array)
		{
			if (odds % 2 == 1)
				System.out.print(odds + " " );
		}
	}
}	