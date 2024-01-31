package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount? ");
		double startAmount = in.nextDouble();
		
		System.out.println("What is the probability that you will win? ");
		double winChance = in.nextDouble();
		
		System.out.println("What is your limit for the day? ");
		double winLimit = in.nextDouble();
		
		System.out.println("The number of days you'll simulate : ");
		int totalSimulations = in.nextInt();
		
		
		
	for(int i = 0; i < totalSimulations; i ++)
	{
		double balance = startAmount;
		while (balance > 0 && balance < winLimit) 
		{
		if (Math.random()<= winChance)
		{
			balance = balance +1;
			
		}
		else
		{
			balance = balance -1;
		
		}
		}
		
		if (balance == 0)
		{
			System.out.println("Day " + (i +1) + ": Lose");
		}
		else 
		{
			System.out.println("Day " + (i +1) + ": Win");
		}
		
	}
		
		
		
		
	}

}
