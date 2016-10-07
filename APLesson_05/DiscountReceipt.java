import java.util.Scanner; 
public class DiscountReceipt
{
		public static void main(String[]args)
		{
			Scanner keyboard = new Scanner(System.in);
			DiscountReceipt receipt = new DiscountReceipt();
			
			System.out.println("Enter the first item");
			String I1 = keyboard.nextLine();
			System.out.println("Enter the price");
			double P1 = keyboard.nextDouble();	
			System.out.println("Enter the second item");
			keyboard.nextLine();
			String I2 = keyboard.nextLine();
			System.out.println("Enter the price");
			double P2 = keyboard.nextDouble();
			System.out.println("Enter the third item");
			keyboard.nextLine();
			String I3 = keyboard.nextLine();
			System.out.println("Enter the price");
			double P3 = keyboard.nextDouble();
			System.out.println("Enter the fourth item");
			keyboard.nextLine();
			String I4 = keyboard.nextLine();
			System.out.println("Enter the price");
			double P4 = keyboard.nextDouble();
			double Subtotal = P1+P2+P3+P4;
			double newSubtotal, discount;
			newSubtotal = 0;
			discount = 0;
			boolean total = DiscountReceipt(Subtotal);
			 if (total){
				newSubtotal = Subtotal * 0.85;
				discount = Subtotal * .15;
			 } if (!total){
				newSubtotal = Subtotal;
				discount = 0;
			}
			System.out.println("<<<<<<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>>>>>");
			receipt.format(I1, P1);
			receipt.format(I2, P2);
			receipt.format(I3, P3);
			receipt.format(I4, P4);
			System.out.println("\n\n");
			receipt.format("Subtotal", Subtotal);
			receipt.format("Discount", discount);
			receipt.format("New Subtotal", newSubtotal);
			double Total = newSubtotal;
			System.out.println("\n\n");
			System.out.println("____________________________________________________");
			
		}
		static boolean total;
		public static boolean DiscountReceipt(double Subtotal)
		{
		
			if (Subtotal > 2000){
				total = true;
			} if(Subtotal < 2000){
				total = false;
			}
			return total;
		}
		public void format(String item, double number)
	{
		System.out.printf("\n*%20s........ %20.2f", item, number);
		
	}
}