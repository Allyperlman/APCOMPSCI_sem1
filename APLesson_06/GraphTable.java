import java.util.Scanner; 
public class GraphTable
{
		
		public static void main(String[]args)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Please enter a number");
			int num = kb.nextInt();
			System.out.println("Please enter the size of the table");
			int size = kb.nextInt();
			for(int i = 1; i <= size; i++ )
			{
				System.out.printf("%5d\t|%5d\n",i, i*num);
			}
		}
}