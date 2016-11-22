package Task5;
public class Van extends Vehicle
{
	int capacity;
 
	public Van()
	{
	 
	}
 
	public Van(int capacity, int id, String type, String colour, String license)
	{
		super(id,type,colour,license);
		this.capacity = capacity;
	}
 
	public int getCapacity()
	{
		return capacity;
	}      
	
	public String getType()
	{
		return "Van";
	}
}