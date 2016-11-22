package Task11;

import java.util.Scanner;

public class itemFactory 
{
	Scanner scanner = new Scanner(System.in);
	public Item getItem(int id, String itemType, String datePublished, String title)
	{
		if (itemType == null)
			return null;
		
		else if (itemType.equalsIgnoreCase("BOOK"))
		{
			System.out.println("author?");
			String author = scanner.next();
			System.out.println("genre?");
			String genre = scanner.next();
			
			return new Book(id, datePublished, title, false, author, genre);
		}
		
		else if (itemType.equalsIgnoreCase("MAP"))
		{
			System.out.println("region?");
			String region = scanner.next();
			return new Map(id, datePublished, title, false, region);
		}
		
		else if (itemType.equalsIgnoreCase("NEWSPAPER"))
		{
			System.out.println("issue?");
			int issue = scanner.nextInt();
			return new Newspaper(id, datePublished, title, false, issue);
		}
		
		else return null;
	}
	
	public Item updateItem(int id, String itemType)
	{
		if (itemType == null)
			return null;
		else if (itemType.equalsIgnoreCase("BOOK"))
			return new Book(id, "01/01/2000", "", false, "", "");
		else if (itemType.equalsIgnoreCase("MAP"))
			return new Map(id, "01/01/2000", "", false, "");
		else if (itemType.equalsIgnoreCase("NEWSPAPER"))
			return new Newspaper(id, "01/01/2000", "", false, 0);
		else return null;
	}
}