package Task6;

public class Paint 
{
	float cost;
	int coverage;
	int capacity;
	
	public Paint() 
	{
		// TODO Auto-generated constructor stub
	}
	public Paint(float cost, int cover, int cap)
	{
		this.cost = cost;
		this.capacity = cap;
		this.coverage = cover * cap;
		
	}

}