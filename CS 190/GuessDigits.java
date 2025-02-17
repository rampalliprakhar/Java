/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 10/08/21
 * Last Updated: 10/08/21
 *
 * Compilation: javac GuessDigits.java
 * Execution: java GuessDigits
 *
 * Description:
 * The program will ask the player to guess a random letter generated by the computer. The player is allowed the same fixed number of guesses in each round of play. 
 * If the letter is not correctly guessed within that number of guesses the computer reports the random letter to the player and asks if the player wishes to play again. 
 * The player enters ‘y’ to continue or ‘n’ to exit the game. If the letter is guessed correctly the computer reports the random letter to the player along with the 
 * number of guesses made. The computer then asks if the player wishes to play again. On exiting the game the player should receive a “Thank you” message.
 * 
 * Sample Output:
 * Guess the random letter
 * You get 10 guesses
 * My guess is: a
 * My guess is: u
 * My guess is: e
 * My guess is: d
 * My guess is: b
 * My guess is: c
 * My guess is: f
 * My guess is: g
 * My guess is: k
 * My guess is: x
 * Too bad. The letter was q
 * Play again?
 * Enter 'y' to continue, 'n' to exit game n
 -------------------------------------------------*/
import java.util.Scanner;
public class GuessDigits{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int guessCount = 0;	 // keeps tracks of guess inputs
		int guessesAllowed = 10; // total guess allowed is 10
		String userEntry= "";    // user input
		while(true){
			System.out.println("Guess the random letter");
			System.out.println("You get 10 guesses");
			char comp = (char)('a'+ Math.random()*26); // generates characters from a - z

			for(guessCount = 0; guessCount < guessesAllowed; guessCount++)
			{
				System.out.print("My guess is: ");
				userEntry = input.next();
				if(userEntry.charAt(0)==comp) // if input given by the user matches computer's random letter then break
				{
					break;
				}
			}		

			if(guessCount==10) // if guess input is equal to total guess
			{
				System.out.println("Too bad. The letter was " + comp); // displays the random letter
			}
			else               // if guess input matches random letter generated by the computer
			{
				System.out.println("The letter was " +comp+ "! You got it in " + ++guessCount+ " guesses.");
			}
			System.out.println("Play again?");
			System.out.print("Enter 'y' to continue, 'n' to exit game ");
			userEntry = input.next();
			if(userEntry.charAt(0) == 'n')break; // if user inputs n, then close the program
   			else
			{
   				System.out.println("Play again?");
   			}
		}
	}
}
