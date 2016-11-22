import java.util.ArrayList;
import java.util.List;

public class Task7 
{
	public static void main(String[] args)
	{	
		int max = 3000000;
		List<Integer> primes = new ArrayList<>();
		Boolean flag;
		primes.add(2);
		for (int i = 3; i < max ; i++)
		{
			flag = true;
			for (int j = 0; j < primes.size()/2; j++)
			{
				if (i % primes.get(j) == 0)
				{
					flag = false;
					break;
				}
			}
			if (flag == true)
				primes.add(i);
		}
		System.out.print(primes.size());
	}
}