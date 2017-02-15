public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket w = new Walkup();
		Ticket a = new Advance(10);
		Ticket sa = new StudentAdvance(10);
		
		System.out.println(w);
		System.out.println(a);
		System.out.println(sa);

	}
}