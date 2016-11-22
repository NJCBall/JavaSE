public class Task4 
{
	public static void main(String[] args) 
	{
		String string = ("string");
		String reverse = "";
		int length = string.length();
		System.out.println(string);
		for (int i = length - 1; i >= 0; i--)
		{
			reverse = reverse + string.charAt(i);
		}
		System.out.print(reverse);
	}
}