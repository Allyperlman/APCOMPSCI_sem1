import java.util.Scanner; 
public class CountByX
{
		
		public static void main(String[]args)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Please enter a number");
			int num1 = kb.nextInt();
			System.out.println("Please enter another number");
			int num2 = kb.nextInt();
			for(int i = num1; i <= num2; i+=2 )
			{
				System.out.print(i + " \t");
			}
		}
}	