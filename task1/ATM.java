package task1;

import java.util.Scanner;

public class ATM
{
	public ATM()
	{
	}
	
	public void enterPIN()
	{
		Scanner scanner = new Scanner(System.in);
		int input;
		
		try
		{
			for (int i = 0; i < triesCount; ++i)
			{
				System.out.print("PIN > ");
				input = scanner.nextInt();
				
				if ((2 == i) && (input != PIN))
					throw new Exception("3 incorrect PIN attempts.");
				
				else if ((2 > i) && (input != PIN))
					System.out.println("Wrong PIN. Please, try again.");
				
				else if (input == PIN)
				{
					System.out.println("Input is correct.");
					break;
				}
				else
					throw new Exception("An error occured.");
			}
		}		
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	private int triesCount = 3;
	private int PIN = 1230;
}
