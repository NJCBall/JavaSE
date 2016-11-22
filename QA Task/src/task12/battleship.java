package task12;

public class battleship extends Ship 
{
	protected battleship(String orient) 
	{
		this.setSize (3);
		this.orientation = orient;
	}
}