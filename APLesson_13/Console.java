public abstract class Console extends GameSystem
{
	String Controller;
	
	public Console() 
	{
        super();
    }

    public Console(String p) 
	{
        super(p);
    }

    public abstract String getController();

    public String toString() 
	{
        return "Platform: " + getPlatform()
				+ "\nSerial #: " + super.getSerialNo()
				+ "\nController: " + getController();
    }
}