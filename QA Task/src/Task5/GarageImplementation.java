package Task5;

public class GarageImplementation 
{
	public static void main(String[] args)
	{
		Garage g = new Garage();
		while (true)
		{
			System.out.println("-------GARAGE-------");
			System.out.println("(1) to add a new vehicle");
			System.out.println("(2) to remove a vehicle by ID");
			System.out.println("(3) to remove a vehicle by type");
			System.out.println("(4) to fix a vehicle");
			System.out.println("(5) to empty the garage");
			String input = g.scanner.next();
			switch(input) 
			{
			case "1":
				g.Add();
				break;
			case "2":
				g.RemoveID();
				break;
			case "3":
				g.RemoveType();
				break;
			case "4":
				g.fix();
				break;
			case "5":
				g.empty();
				break;
			}
		}
	}
}
