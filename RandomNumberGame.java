import java.util.Random;
import java.util.Scanner;

/* 
 * We are going to keep it simple for our first introduction to Java for many of you:
 * a small program to take input and produce output to the console using Scanners 
 * in the same way input() is used in Python.
 * We are going to generate a random number and have the user guess numbers, giving them 
 * higher or lower until they guess the number.
 */
public class RandomNumberGame {
	// To read input from the console, we need a Scanner object
	// Here we initialise the scanner object under the name readInput
	static Scanner readInput = new Scanner(System.in);
	
	// We also initialise a Random object, which will let us generate our random numbers
	static Random rand = new Random();
	
	// Main method of our class - it is the first bit of code that runs when we run our program
	public static void main(String[] args) { 
		System.out.println("Random number guessing game!");
		int score = game();
		System.out.println("Congratulations! You guessed the right number in " + score + " turns!");
		
	}
	
	public static int getLimit() {
		int n = 20;	
		return n;
	}
	
	public static int game() {
		
		int limit = getLimit();
		int num = rand.nextInt(limit);
		int guess = -1;
		int turns = 1;
		
		while (guess != num) {
			
			System.out.println("Make a guess : ");
			
			// readInput.hasNextInt(); - returns boolean whether next line is int
			guess = readInput.nextInt(); // Make guess variable what is read bv scanner
			readInput.nextLine(); // Need to clear the scanner after reading
			
			if (guess > num) {
				System.out.println("Too high!");
				turns++;
			}else if (guess < num) {
				System.out.println("Too low!");
				turns++;
			}
		}
		return turns;		
	}
}
