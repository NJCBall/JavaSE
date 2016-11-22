package task12;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class BattleshipsImplementation 
{
	static Scanner scanner = new Scanner(System.in);
	
	static Boolean setup(Grid playergrid)
	{
		Boolean reFlag = true;
		
		int x = 0,y = 0;
		int numPatrol = 2;
		int numBattle = 2;
		int numDestroy = 1;
		int numCarrier = 1;
		int numSubmarine = 1;
		String orientation = "";
		
		
		for (int i = 0; i < numPatrol; i++)
		{
			System.out.println("Input x position for patrol ship: ");
			x = scanner.nextInt()-1;
		
			System.out.println("Input y position for patrol ship: ");
			y = scanner.nextInt()-1;
		
			System.out.println("Input orientation patrol ship: ");
			orientation = scanner.next();
		
			playergrid.space[x][y] = new patrol(orientation);
			if (playergrid.addShip(x, y, orientation) == false)
				reFlag = false;
		}
		
		for (int i = 0; i < numBattle; i++)
		{
			System.out.println("Input x position for battleship: ");
			x = scanner.nextInt()-1;
		
			System.out.println("Input y position for battleship: ");
			y = scanner.nextInt()-1;
		
			System.out.println("Input orientation for battleship: ");
			orientation = scanner.next();
		
			playergrid.space[x][y] = new battleship(orientation);
			if (playergrid.addShip(x, y, orientation) == false)
				reFlag = false;
		}

		for (int i = 0; i < numDestroy; i++)
		{
			System.out.println("Input x position for destroyer: ");
			x = scanner.nextInt()-1;
		
			System.out.println("Input y position for destroyer: ");
			y = scanner.nextInt()-1;
		
			System.out.println("Input orientation for destroyer: ");
			orientation = scanner.next();
		
			playergrid.space[x][y] = new destroyer(orientation);
			if (playergrid.addShip(x, y, orientation) == false)
				reFlag = false;
		}

		for (int i = 0; i < numSubmarine; i++)
		{
			System.out.println("Input x position for submarine: ");
			x = scanner.nextInt()-1;
		
			System.out.println("Input y position for submarine: ");
			y = scanner.nextInt()-1;
		
			System.out.println("Input orientation for submarine: ");
			orientation = scanner.next();
		
			playergrid.space[x][y] = new submarine(orientation);
			if (playergrid.addShip(x, y, orientation) == false)
				reFlag = false;
		}

		for (int i = 0; i < numCarrier; i++)
		{
			System.out.println("Input x position for carrier: ");
			x = scanner.nextInt()-1;
		
			System.out.println("Input y position for carrier: ");
			y = scanner.nextInt()-1;
		
			System.out.println("Input orientation for carrier: ");
			orientation = scanner.next();
		
			playergrid.space[x][y] = new carrier(orientation);
			if (playergrid.addShip(x, y, orientation) == false)
				reFlag = false;
		}
		return reFlag;
	}
	
	public static void main(String[] args) 
	{
		Boolean flag = false;
		Boolean gameover = false;
		Grid playergrid = new Grid(12);
		
		while (flag == false)
			{
				System.out.println("PLAYER 1");
				flag = setup(playergrid);
				if (flag == false)
				{
					playergrid = new Grid(12);
					System.out.println("Error. Ship placement invalid.");
				}
			}
		System.out.println("SUCCESS");
		
		Grid targetgrid = new Grid(12);
		flag = false;
		
		while (flag == false)
			{
				System.out.println("PLAYER 2");
				flag = setup(targetgrid);
				if (flag == false)
				{
					targetgrid = new Grid(12);
					System.out.println("Error. Ship placement invalid.");
				}
			}
		System.out.println("SUCCESS");
		System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");
		
	/*	while (gameover == false)
		{
			int targetx = 0, targety = 0;
			System.out.println("PLAYER 1: Pick an x-coordinate.");
			targetx = scanner.nextInt()-1;
			System.out.println("PLAYER 1: Pick a y-coordinate.");
			targety = scanner.nextInt()-1;
			if (targetgrid.space[targetx][targety] != null)
			{																							!!!!Excluded due to errors!!!!
				System.out.println(targetgrid.space[targetx][targety].hit());
				if (targetgrid.space[targetx][targety].hit() == "HIT")
					targetgrid.space[targetx][targety] = null;
				else if (targetgrid.space[targetx][targety].hit() == "DEAD")
					System.out.println("TARGET DESTROYED");
			}
			else System.out.println("MISSED");
		} */
			
			scanner.close();
	}
}