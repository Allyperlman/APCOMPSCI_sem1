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
		System.out.println(name + " is a wonderful name ");
		
		//prompt for user input
		System.out.println("What do you do for fun? ");
		keyboard.nextLine();
		//search for the next integer that the user enters
		String vb = keyboard.nextLine();
		
		//print the results...
		System.out.println(vb + " Sounds so fun! ");
		
		//prompt for user input
		System.out.println("What kind of music do you like? ");
		keyboard.nextLine();
		//search for the next integer that the user enters
		String r = keyboard.nextLine();
		
		//print the results...
		System.out.println(r + " My favorite too. ");
		
		//prompt for user input
		System.out.println("How many siblings do you have? ");
		keyboard.nextLine();
		//search for the next integer that the user enters
		int sib = keyboard.nextInt();
		
		//print the results...
		System.out.println(sib + " Oh, that's cool. ");
		
		//prompt for user input
		System.out.println("What do you want to be when you grow up? ");
		keyboard.nextLine();
		//search for the next integer that the user enters
		String idk = keyboard.nextLine();
		
		//print the results...
		System.out.println(" Interesting. ");
		
		
		
		
	}
}