import java.util.Random;
import java.util.Scanner;

public class program1 
{

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerLimit = 1;
        int upperLimit = 100;
        int maxAttempts = 10;
        int totalAttempts = 0;
        boolean playAgain = true;

        while (playAgain) 
		{
            	  int targetNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
           	       System.out.println("\nLet's START" + " - Guess the number between " + lowerLimit + " and " + upperLimit);

         for (int attempt = 1; attempt <= maxAttempts; attempt++) 
			{
               		   System.out.print("Enter your guess: ");
                	   int userGuess = scanner.nextInt();

              		    if (userGuess == targetNumber)
     				 {
                   		     System.out.println("Congratulations! You guessed the correct number " + targetNumber + " in " + attempt + " attempts.");
                   		     totalAttempts += attempt;
                   		     break;
  				 } 
			    else if (userGuess < targetNumber)
				 {
                                     System.out.println("Too low! Try again.");
              		         }
			    else 
				 {
                                     System.out.println("Too high! Try again.");
              		         }

                            if (attempt == maxAttempts) 
                                 {
                                     System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber + ".");
                                 }
                        }
                 }
        }
}    
  
