import java.util.Scanner; //import.Statement

public class Lesson_04_EX_01
{
	public static void main(String[]args)
	{
		Lesson_04_EX_01 receipt = new Lesson_04_EX_01();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter item 1");
		String cs = keyboard.nextLine();
		System.out.println("Enter the price");
		double p1 = keyboard.nextDouble();

		keyboard.nextLine();
		System.out.println("Enter item 2");
		String ff = keyboard.nextLine();
		System.out.println("Enter the price");
		double p2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Enter item 3");
		String s = keyboard.nextLine();
		System.out.println("Enter the price");
		double p3 = keyboard.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		receipt.format(cs, p1);
		receipt.format(ff, p2);
		receipt.format(s, p3);
		System.out.println("\n\n");
		double Subtotal = p1+p2+p3;
		double Tax = Subtotal*0.08;
		double Total = Subtotal+Tax;
		receipt.format("Subtotal:", Subtotal);
		receipt.format("Tax:", Tax);
		receipt.format("Total:", Total);
		
	}
	
	public void format(String item, double number)
	{
		System.out.printf("\n* %20s........ %20.2f", item, number);
		
	}
}


