import java.util.Scanner;

public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("First Name: ");
		String FFN = kb.nextLine();
		System.out.println("Last Name: ");
		String LLN = kb.nextLine();
		System.out.println("Avatar? (y/n)");
		String AA = kb.nextLine();
		
		if (AA.equals("y"))
		{
			System.out.println("Avatar: ");
			String AAA = kb.nextLine();
			UserClass avU = new UserClass(FFN, LLN, AA);
			avU.setAvatar(AAA);
			System.out.println(avU);
		}
		if (AA.equals("n"))
		{
			UserClass noU = new UserClass(FFN, LLN);
			System.out.println(noU);
		}
	}
}