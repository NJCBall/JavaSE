package Task11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public abstract class Item implements itemInterface
{

	int ID;
	Calendar datePublished = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
	String title;
	Boolean checkedOut;
	
	protected Item(int iD, String published, String title, Boolean checkedOut) 
	{
		super();
		ID = iD;
		try {this.datePublished.setTime(sdf.parse(published));}
		catch (ParseException e) {            
	        e.printStackTrace();
	    } 
		this.title = title;
		this.checkedOut = checkedOut;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Calendar getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(String datePublished) {
		try { this.datePublished.setTime (sdf.parse(datePublished)); }
		catch (ParseException e) {            
	        e.printStackTrace();
	    } 
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}