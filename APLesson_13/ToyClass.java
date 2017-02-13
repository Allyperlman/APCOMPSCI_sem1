public abstract class ToyClass
{
	private String name;
	private int count;
	
	public ToyClass()
	{
		name = "";
		count = 1;
	}
	
	public ToyClass(String input)
	{
		name = input;
		count = 1;
	}
	
	public String toString()
	{
	return  name + "," + count ;
	}
	
	public abstract String getType();
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setName(String inName)
	{
		name = inName;
	}
	
	public void setCount(int inCount)
	{
		count = inCount;
	}
}