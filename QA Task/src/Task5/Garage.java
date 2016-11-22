package Task5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garage 
{
	 List<Vehicle> Garage = new ArrayList<>();
	 Scanner scanner = new Scanner(System.in);
	 String input = "";
	
	void Add()
	{
		scanner.reset();
		System.out.println("(1) for car");
		System.out.println("(2) for motorbike");
		System.out.println("(3) for van");
		input = scanner.next();
		switch(input)
		{
		case "1":
			Car car = new Car();
			System.out.println("Convertible? (true/false)");
			car.convertible = scanner.nextBoolean();
			System.out.println("ID? (number)");
			car.ID = scanner.nextInt();
			System.out.println("Type? (string)");
			car.type = scanner.next();
			System.out.println("Colour? (string)");
			car.colour = scanner.next();
			System.out.println("License? (string)");
			car.license = scanner.next();
			Garage.add(car);
			break;
		case "2":
			Motorbike bike = new Motorbike();
			System.out.println("Engine class? (string)");
			bike.engineclass = scanner.nextInt();
			System.out.println("ID? (int)");
			bike.ID = scanner.nextInt();
			System.out.println("Type? (string)");
			bike.type = scanner.next();
			System.out.println("Colour? (string)");
			bike.colour = scanner.next();
			System.out.println("License? (string)");
			bike.license = scanner.next();
			Garage.add(bike);
			break;
		case "3":
			Van van = new Van();
			System.out.println("Capacity? (int)");
			van.capacity = scanner.nextInt();
			System.out.println("ID? (number)");
			van.ID = scanner.nextInt();
			System.out.println("Type? (string)");
			van.type = scanner.next();
			System.out.println("Colour? (string)");
			van.colour = scanner.next();
			System.out.println("License? (string)");
			van.license = scanner.next();
			Garage.add(van);
			break;
		}
	}
	
	void RemoveID()
	{
		scanner.reset();
		System.out.println("ID? (number)");
		int ID = scanner.nextInt();
		for (int i=0; i<=Garage.size(); i++)
		{
			if (Garage.get(i).ID == ID)
			{
				Garage.remove(i);
				break;
			}
		}
	}
	
	void RemoveType()
	{
		scanner.reset();
		System.out.println("Type? (string)");
		String type = scanner.next();
		for (int i=0;i<=Garage.size();i++)
		{
			if (Garage.get(i).type == type)
			{
				Garage.remove(i);
			}
		}
	}
	
	void fix()
	{
		scanner.reset();
		
		for (int i = 0; i < Garage.size(); i++){
		String type = Garage.get(i).getType();
		switch(type)
		{
		case "Car":
			Boolean convert = (((Car) Garage.get(i)).getConvert());
			if (convert == true)
			{
				System.out.println("Repairs will cost £2,000.");
			}
			else
			{
				System.out.println("Repairs will cost £1,000.");
			}
			break;
		
		case "Motorbike":
			int engine = (((Motorbike) Garage.get(i)).getEngine());
			if (engine == 50)
			{
				System.out.println("Repairs will cost £200.");
			}
			else if (engine == 200)
			{
				System.out.println("Repairs will cost £750.");
			}
			else if (engine == 500)
			{
				System.out.println("Repairs will cost £1,500.");
			}
			break;
			
		case "Van":
			int capacity = (((Van) Garage.get(i)).getCapacity());
			System.out.print("Repairs will cost: £");
			System.out.println(capacity*10);
			break;
		}}
	}
	
	 void empty()
	{
		Garage.clear();
	}
	
}