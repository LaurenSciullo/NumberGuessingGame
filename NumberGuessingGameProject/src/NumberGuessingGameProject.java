import java.util.Scanner;

public class NumberGuessingGameProject
	{

		public static void main(String[] args)
			{
			Scanner userInput = new Scanner(System.in);
				System.out.println("Welcome to the Number Guessing Game! Enter your name: ");
				
				String name = userInput.nextLine();
				
				boolean playAgain = true;
				
		while 	(playAgain) 
			{
				boolean answer = true;
				System.out.println(name + " how big of a range would you like? ");
				
				int range = userInput.nextInt();
				int randomNumber = (int)(Math.random()*range+1);
				
				
		while (answer)
			{
				
				System.out.println("Enter your guess: ");
				int guess = userInput.nextInt();
				
				if (guess < randomNumber)
					{
						System.out.println(guess + " too low, try again");
						
					}
				else if  (guess > randomNumber) 
				{
					System.out.println(guess + " too high, try again");
					
				}
			
		
				else 
					{
						int counter = 0;
						System.out.println(guess + " is right!");
					
						System.out.println("Congrats!");
						counter ++;
						System.out.println("It took you " + counter + " time(s).");
						answer = false;
						
				}
				

			}	
			
			System.out.println("\nWant to play again " + name + "(1)Yes or (2)No.");
			int response = userInput.nextInt();
			
			if (response == 2)
				{
				System.out.println("Thanks for playing!");
				playAgain = false;
				}
			else if (response ==1)
				{
					System.out.println("Good choice!");
				}
			}

			}

	}
