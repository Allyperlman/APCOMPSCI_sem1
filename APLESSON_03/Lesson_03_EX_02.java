import java.util.Scanner; //import.Statement


public class Lesson_03_EX_02
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your weight? ");
		
		//search for the next double that the user enters
		double w = keyboard.nextDouble();
		
		//prompt for user input
		System.out.println("What is your height? ");
		
		//search for the next double that the user enters
		double h = keyboard.nextDouble();
		
		double bmi = 703* w /( h * h);
		
		//print the results...
		System.out.println("Your Body Mass Index is " + bmi );
		
		
		
	}
}