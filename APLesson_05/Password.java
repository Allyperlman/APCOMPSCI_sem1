import java.util.Scanner; 
public class Password
{
	static String username;
	static String password;
	
		public static void main(String[]args)
		{
			Scanner kb = new Scanner(System.in);

			System.out.println("Please enter a username");
			username = kb.next();
			System.out.println("Please enter a password");
			password = kb.next();
			passCheck();
		}		
		public static void passCheck()
		{
			if (username.equals("Ally") && password.equals("Perlman"))
			{
				System.out.println("You are granted access!");
			}
			else if (username.equals("Ally") && !password.equals("Perlman"))
			{
				System.out.println("Password is incorrect!");
			}
			else if (!username.equals("Ally") && password.equals("Perlman"))	
			{
				System.out.println("Username is incorrect!");
			}
			else 
			{
				System.out.println("Both username and password are incorrect!");
			}
		}
}				