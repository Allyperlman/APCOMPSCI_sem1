import java.util.Scanner; 
public class Factorial
{
		
		public static void main(String[]args)
		{
			Scanner kb = new Scanner(System.in);
			int factorial = 1;
			System.out.println("Please enter a number");
			int num = kb.nextInt();
			for(int i = 1; i <= num;i++ )
			{
				factorial = factorial * i;
			}
			System.out.println(factorial);
		}
		
}		
