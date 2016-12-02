import java.util.Scanner;
public class FirstLetter
{
	
	public static void main(String[]args)
	{
		String [] words = new String[5];//words = array; word = one word;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter five words");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		first(words);
	}
	
	public static void first(String[] words)
	{
		for( String value:words)
		{
			System.out.print(value.charAt(0));
		}
	}
}	
		