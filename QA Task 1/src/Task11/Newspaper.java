package Task11;


public class Newspaper extends Item 
{
	int issue;
	protected Newspaper(int iD, String published, String title, Boolean checkedOut, int issue) 
	{
		super(iD, published, title, checkedOut);
		this.issue = issue;
	}
}