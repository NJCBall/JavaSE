package Task5;
public class Motorbike extends Vehicle
{
	int engineclass;
	
	public Motorbike()
	{
		
	}
	
	public Motorbike(int engclass, int id, String type, String colour, String license)
	{
		super(id,type,colour,license);
		this.engineclass = engclass;
	}      
	
	public int getEngine()
	{
		return engineclass;
	}
	
	public String getType()
	{
		return "Motorbike";
	}
}