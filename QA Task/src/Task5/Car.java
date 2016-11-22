package Task5;
public class Car extends Vehicle 
{
	Boolean convertible;
	
	public Car()
	{
		
	}
	
	public Car(Boolean convert, int id, String type, String colour, String license)
	{
		super(id,type,colour,license);
		this.convertible = convert;
	}       
	
	public Boolean getConvert()
	{
		return convertible;
	}
	
	public String getType()
	{
		return "Car";
	}
} 