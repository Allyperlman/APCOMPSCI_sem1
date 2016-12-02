import java.util.Scanner;
public class ReverseWord
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
		System.out.println("Your words in order are...");
		
		for(String word: words)
		{
			System.out.print(word + " ");
		}
		System.out.println("Your words in reverse are...");
		reverse(words);
	}
	
	public static void reverse(String[] words)
	{
		for(int i = words.length - 1; i >= 0; i--)
		{
			System.out.print(words[i] + " ");
		}
	}
}	
		