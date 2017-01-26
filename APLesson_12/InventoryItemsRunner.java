import java.util.Scanner;

public class InventoryItemsRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Item Name: ");
		String I = kb.nextLine();
		System.out.println("Manufacturer: ");
		String M = kb.nextLine();
		
		System.out.println("Are you entering item category and price? (y/n)");
		String response = kb.nextLine();
		
		if (response.equals("y"))
		{
			System.out.println("Category: ");
			String C = kb.nextLine();
			System.out.println("Item Price: ");
			int P = kb.nextInt();
			
			InventoryItems yre = new InventoryItems(M, I, C, P);
			System.out.println(yre);
		}
		if (response.equals("n"))
		{
			InventoryItems nre = new InventoryItems(M, I);
			System.out.println(nre);
		}
	}
}