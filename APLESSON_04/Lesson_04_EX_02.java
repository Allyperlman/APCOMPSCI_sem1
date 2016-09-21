import java.util.Scanner; //import.Statement

public class Lesson_04_EX_02
{
	public static void main(String[]args)
	{
		Lesson_04_EX_02 card = new Lesson_04_EX_02();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String fn = keyboard.nextLine();
		System.out.println("Enter you last name");
		String ln = keyboard.nextLine();

		keyboard.nextLine();
		System.out.println("Enter your title:");
		String t = keyboard.nextLine();
		System.out.println("Enter the school site:");
		String ss = keyboard.nextLine();
		
		keyboard.nextLine();
		System.out.println("Enter the school year:");
		String sy = keyboard.nextLine();
		System.out.println("Enter grade level:");
		String gl = keyboard.nextLine();
		
		System.out.println("***********************************");
		card.format(ss, sy);
		card.format(fn, ln);
		card.format(t, gl);
		System.out.println("\n\n");
		System.out.println("***********************************");
	}	
		public void format(String item, String word)
	{
		System.out.printf("\n*%20s %20s *", item, word);
		
	}
	
	
}