import java.util.*;
public class ToyStore
{
	public ArrayList<ToyClass> toyList = new ArrayList<ToyClass>();
	
	public ToyStore()
	{
		this("");
	}
	
	public ToyStore(String input)
	{
		this.loadToys(input);
	}
	
	public void loadToys(String ts)
	{
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		for(int i = 0; i<list.size(); i += 2)
		{
			String name = list.get(i);
			String type = list.get(i + 1);
			ToyClass object = getThatToy(name);
			if(object == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new CarClass(name));
				}
				if(type.equals("AF"))
				{
					toyList.add(new AFigureClass(name));
				}
			}
			else
			{
				object.setCount(object.getCount() + 1);
			}
			
		}
	}
	
	public ToyClass getThatToy(String nm)
	{
		for(ToyClass toy : toyList)
		{
			if(toy.getName().equals(nm))
				return toy;
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = " ";
		int max = Integer.MIN_VALUE;
		for(ToyClass toy : toyList)
		{
			if(max < toy.getCount())
			{
				max = toy.getCount();
				name = toy.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(ToyClass toy : toyList)
		{
			if(toy.getType().equalsIgnoreCase("car"))
			{
				cars++;
			}
			if(toy.getType().equalsIgnoreCase("af"))
			{
				figures++;
			}
		}
		if(cars > figures)
		{
			return "Cars";
		}
		if(figures > cars)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	
	public String toString()
	{
		return "" + toyList;
	}
}