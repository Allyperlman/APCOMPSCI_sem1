import java.lang.Math;

public class InventoryItems
{
	private String Manufacturer, Name, Category;
	private int Price;
	private long UPC;
	
	public InventoryItems()
	{
		Manufacturer = "";
		Name = "";
		Category = "";
		UPC = 0;
		Price = 0;
	}
	
	public InventoryItems(String manu, String nam)
	{
		Manufacturer = manu;
		Name = nam;
		Category = "UNDEFINED";
		Price = 0;
		UPC = Math.abs((long)(Math.random() * 10000000000L) + 1);
	}
	
	public InventoryItems(String manu, String nam, String cat, int pri)
	{
		Manufacturer = manu;
		Name = nam;
		Category = cat;
		Price = pri;
		UPC = Math.abs((long)(Math.random() * 10000000000L) + 1);
	}
	
	public String toString()
	{
		return "\nInventory Items..." +
							"\nItem Name: " + Name +
							"\nManufacturer: " + Manufacturer +
                            "\nCategory: " + Category +
                            "\nUPC: " + UPC +
							"\nPrice: " + Price;
	}
	
	public String getManufacturer()
	{
		return Manufacturer;
	}
	public String getName()
	{
		return Name;
	}
	public String getCategory()
	{
		return Category;
	}
	public long getUPC()
	{
		return UPC;
	}
	public int getPrice()
	{
		return Price;
	}
}