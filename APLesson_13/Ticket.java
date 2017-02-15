import java.lang.Math;
public abstract class Ticket
{
	int serialNo;
	
	public Ticket()
	{
		this.serialNo = (int)(Math.random()*10000000 + 1);
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo()
				+ "\nPrice: " + getPrice();
	}
}