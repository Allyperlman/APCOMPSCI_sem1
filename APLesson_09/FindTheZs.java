import java.util.Scanner;
public class FindTheZs
{
	public static String[] words;
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		System.out.println("All the words:: ");
		printArray();
		System.out.println("\nThe words that contain Zs are:: ");
		System.out.println(hasZs());
	}
	
	public static void fillArray()
	{ 
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < words.length; i++)
		{
			System.out.println("Please enter word number " + (i+1) + ".");
			words[i] = kb.next();
		}
	
	}
	public static void printArray()
	{
		System.out.println("For the words::");
		for(String word : words)
		{
			System.out.println(word + " " );
		}
	}
	public static String hasZs()
	{
		String zs = "";
		for(String word : words)
		{
			if (word.indexOf("z") >= 0 || word.indexOf("Z") >= 0 )
				zs += word + ", ";
		}
		return zs;
	}
}