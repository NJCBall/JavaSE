package task12;

public class Grid 
{
	int size = 0;
	Ship[][] space;
	
	public Grid(int size)
	{
		this.size = size;
		this.space = new Ship[size][size];
		for (int i = 0; i < this.size; i++)
		{
			for (int j = 0; j < this.size; j++)
			{
				this.space[j][i] = null;
			}
		}
	}
	
	public Boolean addShip(int x, int y, String orient)
	{
		if (this.space[x][y].getOrientation().equalsIgnoreCase("down"))
		{
			for (int i = 0; i < this.space[x][y].getSize(); i++)
			{
				if (i > 0 && this.space[x][y+i] != null)
				{
					System.out.println("Error. Ship in path.");
					System.out.println(this.space[x][y+i]);
					this.space[x][y] = null;
					return false;
				}
				if (y+i <= this.size)
				{
					this.space[x][y+i] = this.space[x][y];
				}
				else 
				{
					System.out.println("Error. Out of bounds.");
					this.space[x][y] = null;
					return false;
				}
			}
		}
		
		else if (this.space[x][y].getOrientation().equalsIgnoreCase("right") == true)
		{
			for (int i = 0; i < this.space[x][y].getSize(); i++)
			{
				if (i > 0 && this.space[x+i][y] != null)
				{
					System.out.println("Error. Ship in path.");
					System.out.println(this.space[x+i][y]);
					this.space[x][y] = null;
					return false;
				}
				if (x+i <= this.size)
				{
					this.space[x+i][y] = this.space[x][y];
				}
				else 
				{
					System.out.println("Error. Out of bounds.");
					this.space[x][y] = null;
					return false;
				}
			}
		}
		
		else if (this.space[x][y].getOrientation().equalsIgnoreCase("up"))
		{
			for (int i = 0; i < this.space[x][y].getSize(); i++)
			{
				if (i > 0 && this.space[x][y-i] != null)
				{
					System.out.println("Error. Ship in path.");
					System.out.println(this.space[x][y-i]);
					this.space[x][y] = null;
					return false;
				}
				if (y-i <= this.size)
				{
					this.space[x][y-i] = this.space[x][y];
				}
				else 
				{
					System.out.println("Error. Out of bounds.");
					this.space[x][y] = null;
					return false;
				}
			}
		}
		
		else if (this.space[x][y].getOrientation().equalsIgnoreCase("left"))
		{
			for (int i = 0; i < this.space[x][y].getSize(); i++)
			{
				if (i > 0 && this.space[x-i][y] != null)
				{
					System.out.println("Error. Ship in path.");
					System.out.println(this.space[x-i][y]);
					this.space[x][y] = null;
					return false;
				}
				if (y+i <= this.size)
				{
					this.space[x-i][y] = this.space[x][y];
				}
				else 
				{
					System.out.println("Error. Out of bounds.");
					this.space[x][y] = null;
					return false;
				}
			}
		}
		else return false;
		return true;
	}
}
