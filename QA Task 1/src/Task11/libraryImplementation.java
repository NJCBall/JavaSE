package Task11;

public class libraryImplementation 
{
	public static void main(String[] args) 
	{
		Library l = new Library();
		l.addItem("BOOK");
		l.addItem("MAP");
		l.addItem("NEWSPAPER");
		l.updateItem(0);
		l.removeItem(1);
		System.out.println(l.items.get(1).getID());
		l.checkOut(0);
		System.out.println(l.items.get(0).checkedOut);
		l.checkIn(0);
		System.out.println(l.items.get(0).checkedOut);
		l.addPerson("Dave");
		l.updatePerson("Dave");
		l.deletePerson("Dave");
	}

}
