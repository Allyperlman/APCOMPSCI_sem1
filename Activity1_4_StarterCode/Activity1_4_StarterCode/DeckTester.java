/**
 * This is a class that tests the Deck class.
 */
public class DeckTester 
{
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] rank1 = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suit1 = {"Hearts", "Spades", "Diamonds", "Clubs"};
		int[] value1 = {1,2,3,4,5,6,7,8,9,10,10,10,10};
	    Deck deck1 = new Deck(rank1, suit1, value1);
	    System.out.println(deck1);
		 System.out.println(deck1.deal());
		  System.out.println(deck1.deal());
		   System.out.println(deck1.deal());
		    System.out.println(deck1);
	}
}