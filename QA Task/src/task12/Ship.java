package task12;

public abstract class Ship 
{
	private 
	int size = 0;
	String orientation = "";
	int hits = 0;
	
	protected Ship(int size, String orient)
	{
		this.size = size;
		this.orientation = orient;
	}
	
	protected Ship()
	{
	}
	
	
	protected String hit()
	{
		this.hits++;
		if (this.hits == this.size)
			return "DEAD";
		else return "HIT";
	}
	
	
	protected int getSize() {
		return size;
	}
	protected void setSize(int size) {
		this.size = size;
	}
	protected String getOrientation() {
		return orientation;
	}
	protected void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	protected int getHits() {
		return hits;
	}
	protected void setHits(int hits) {
		this.hits = hits;
	}
}