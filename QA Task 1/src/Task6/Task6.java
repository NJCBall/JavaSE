package Task6;

import java.util.Scanner;

public class Task6 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Paint CheapoMax = new Paint((float)19.99, 10, 20);
		Paint AverageJoes = new Paint((float)17.99, 11, 15);
		Paint DuluxourousPaints = new Paint((float)25.0, 20, 10);
		
		System.out.println("Enter size of room (m^2)");
		int input = scanner.nextInt();
		
		float paint1cost, paint2cost, paint3cost;
		float paint1no, paint2no, paint3no;
		
		paint1no = (((float)input/(CheapoMax.coverage)));
		
		if (paint1no%1 >0 )
			paint1no = (int)((paint1no/1)+1);
		
		paint2no = (((float)input/(AverageJoes.coverage)));
		
		if (paint2no%1 >0 )
			paint2no = (int)((paint2no/1)+1);
		
		paint3no = (((float)input/(DuluxourousPaints.coverage)));
		
		if (paint3no%1 >0 )
			paint3no = (int)((paint3no/1)+1);
		
		paint1cost = (paint1no * CheapoMax.cost);
		paint2cost = (paint2no * AverageJoes.cost);
		paint3cost = (paint3no * DuluxourousPaints.cost);
		
		if (paint1cost < paint2cost && paint1cost < paint3cost)
			System.out.println("CheapoMax is cheapest");
		else if (paint2cost < paint1cost && paint2cost < paint3cost)
			System.out.println("AverageJoes is cheapest");
		else if (paint3cost < paint1cost && paint3cost < paint2cost)
			System.out.println("DuluxourousPaints is cheapest");
		
		float paint1waste, paint2waste, paint3waste;
		
		paint1waste = (((paint1no*CheapoMax.coverage)-input) / CheapoMax.coverage);
		paint2waste = (((paint2no*AverageJoes.coverage)-input) / AverageJoes.coverage);
		paint3waste = (((paint3no*DuluxourousPaints.coverage)-input) / DuluxourousPaints.coverage);
		
		if (paint1waste < paint2waste && paint1waste < paint3waste){
			System.out.print("CheapoMax only wastes ");
			System.out.print(paint1waste);
			System.out.print("% of a tin");}
		else if (paint2waste < paint1waste && paint2waste < paint3waste){
			System.out.print("AverageJoes only wastes ");
			System.out.print(paint2waste);
			System.out.print("% of a tin");}
		else if (paint3waste < paint1waste && paint3waste < paint2waste){
			System.out.print("DuluxourousPaints only wastes ");
			System.out.print(paint3waste);
			System.out.print("% of a tin");}
		else if (paint1waste == paint3waste && paint1waste < paint2waste)
			System.out.println("CheapoMax and Duluxourous are equally efficient");
		
		scanner.close();
	}
}