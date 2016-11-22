package Task11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library 
{
	Scanner scanner = new Scanner(System.in);
	List<Item> items = new ArrayList<Item>();
	List<Person> people = new ArrayList<Person>();
	itemFactory factory = new itemFactory(); 
	int ID = 0;
	
	public void checkOut(int id)
	{
		for (int i = 0; i < items.size(); i++)
		{
			if (items.get(i).getID() == id)
			{
				items.get(i).checkedOut = true;
				System.out.println("Item has been checked out.");
			}
		}
	}
	
	public void checkIn(int id)
	{
		for (int i = 0; i < items.size(); i++)
		{
			if (items.get(i).getID() == id)
			{
				items.get(i).checkedOut = false;
				System.out.println("Item has been checked in.");
			}
		}
	}
	
	public void addItem(String type)
	{
		System.out.println("When was it published? e.g. 01/01/2000");
		String datePublished = scanner.next();
		System.out.println("What is the title?");
		String title = scanner.next();
		items.add(factory.getItem(ID, type, datePublished, title));
		ID++;
		System.out.println("Item has been added.");
	}
	
	public void removeItem(int id)
	{
		for (int i = 0; i < items.size(); i++)
		{
			if (items.get(i).getID() == id)
			{
				items.remove(i);
				System.out.println("Item has been removed.");
			}
		}
	}
	
	public void updateItem(int id)
	{
		for (int i = 0; i < items.size(); i++)
		{
			if (items.get(i).getID() == id)
			{
				String type = items.get(i).getClass().getSimpleName();
				
				items.remove(i);
				items.add(i, factory.updateItem(id,type));
				System.out.println("Item has been updated.");
			}
		}
	}
	
	public void addPerson(String name)
	{
		Address address = new Address("","","",""); 
		String email = "";
		String phonenum = "";
		people.add(new Person(name, address, email, phonenum));
		System.out.println("Person added.");
	}
	
	public void deletePerson(String name)
	{
		for (int i = 0; i <= people.size(); i++)
		{
			if (people.get(i).getName() == name)
			{
				people.remove(i);
				System.out.println("Person deleted.");
			}
		}
	}
	
	public void updatePerson(String name)
	{
		Address address = new Address("","","",""); 
		String email = "";
		String phonenum = "";
		
		for (int i = 0; i < people.size(); i++)
		{
			if (people.get(i).getName() == name)
			{
				people.remove(i);
				people.add(new Person(name, address, email, phonenum));
				System.out.println("Person updated");
			}
		}
	}
}