import java.util.Scanner; 
public class ReverseNumber
{
	static int num, rev;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int number = kb.nextInt();
		num = number;
		rev = 0;
		getReverse();
		System.out.println(number + " reversed is " + rev);
	}
	public static void getReverse()
	{
		while(num > 0)
		{
			rev = rev*10;
			rev += num % 10;
			num /= 10;
		}
	}
}	