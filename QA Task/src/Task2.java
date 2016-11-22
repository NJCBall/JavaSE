import java.util.Scanner;
public class Task2
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		for (int n = 0; n<=x; n++)
		{
			for (int m = 0; m<n; m++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		scanner.close();
	}
}