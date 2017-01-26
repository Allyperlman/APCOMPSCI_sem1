import java.util.Scanner;

public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Hair:");
		String hhair = kb.nextLine();
		System.out.println("Eyes:");
		String eeyes = kb.nextLine();
		System.out.println("Skin:");
		String sskin = kb.nextLine();
		
		HumanClass object = new HumanClass(hhair, eeyes, sskin);
		System.out.println("My info:");
		System.out.println("Hair:\t" + object.getHair());
		System.out.println("Eyes:\t" + object.getEyes());
		System.out.println("Skin:\t" + object.getSkin());
		
		object.setAttributes("black", "brown", "tan");
		System.out.println("\nFriend's info:");
		System.out.println("Hair:\t" + object.getHair());
		System.out.println("Eyes:\t" + object.getEyes());
		System.out.println("Skin:\t" + object.getSkin());
	}
}