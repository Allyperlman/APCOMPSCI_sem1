public class StudentAdvance extends Advance
{
	int daysLeft;
	
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int daysLeft) 
	{
		super(daysLeft);
		this.daysLeft = daysLeft;
    }

	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return super.toString() + "\nSTUDENT ID REQUIRED";
	}
}