package Task11;


public class Book extends Item
{
	String author;
	String genre;
	
	protected Book(int iD, String published, String title, Boolean checkedOut, String author, String genre) 
	{
		super(iD, published, title, checkedOut);
		this.author = author;
		this.genre = genre;
	}
}