package Task11;


public class Map extends Item 
{
	String region;
	protected Map(int iD, String published, String title, Boolean checkedOut, String region) 
	{
		super(iD, published, title, checkedOut);
		this.region = region;
	}
}