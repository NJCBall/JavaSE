package Task5;

public abstract class Vehicle 
{ 
	int ID;
	String type;
	String colour;
	String license;

	public Vehicle()
	{
		
	}
	
	public Vehicle(int id, String type, String colour, String license)
	{
		this.ID = id;
		this.type = type;
		this.colour = colour;
		this.license = license;
	}
	
	public String getType()
	{
		return "";
	}
}
