import java.util.Scanner; //import.Statement

public class Lesson_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How old are you? ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Wow! " + num + " is perfect. You're pretty. ");
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		//search for the next integer that the user enters
		String name = keyboard.next();
		
		//print the results...
		System.out.println(name + " is a wonderful name. ");
		keyboard.nextLine();
		
		//prompt for user input
		System.out.println("What do you do for fun? ");
		
		//search for the next integer that the user enters
		String vb = keyboard.nextLine();
		
		//print the results...
		System.out.println(vb + " sounds so fun! ");
		
		//prompt for user input
		System.out.println("What kind of music do you like? ");
		
		//search for the next integer that the user enters
		String r = keyboard.nextLine();
		
		//print the results...
		System.out.println(r + " is my favorite too. ");
			
		//prompt for user input
		System.out.println("How many siblings do you have? ");
		//search for the next integer that the user enters
		int sib = keyboard.nextInt();
		
		//print the results...
		System.out.println(" Oh, that's cool. ");
		keyboard.nextLine();
		//prompt for user input
		System.out.println("What do you want to be when you grow up? ");
		//search for the next integer that the user enters
		String idk = keyboard.nextLine();
		
		//print the results...
		System.out.println(" Interesting. ");
		
		
		
		
	}
}