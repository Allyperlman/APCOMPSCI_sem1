import java.util.Scanner;

public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("paint:");
		String ppaint = kb.nextLine();
		System.out.println("interior:");
		String iinterior = kb.nextLine();
		System.out.println("engine:");
		String eengine = kb.nextLine();
		System.out.println("tires:");
		String ttires = kb.nextLine();
		
		CarClass object = new CarClass(ppaint, iinterior, eengine, ttires);
		System.out.println("Your vehicle is ready...");
		System.out.println("Paint:\t\t" + object.getPaint());
		System.out.println("Interior:\t\t" + object.getInterior());
		System.out.println("Engine:\t\t" + object.getEngine());
		System.out.println("Tires:\t\t" + object.getTires());
	}
}