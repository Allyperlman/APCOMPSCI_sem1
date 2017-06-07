/**
 * This is a class that tests the Card class.
 */
public class CardTester 
{

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card c1 = new Card("Heart", "9", 9);
		Card c2 = new Card("Heart", "9", 9);
		Card c3 = new Card("Heart", "Jack", 11);
		
		System.out.println(c3.toString());
		System.out.println("Card 1 and Card 2 match: " + c2.matches(c1));
		System.out.println("Card 2 and Card 3 match: " + c2.matches(c3));
	}
}
