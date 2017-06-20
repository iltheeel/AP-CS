
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

/* TODO: PROMPT for boundaries
 * CALCULATE a random int
 * CHECK if num matches
 * RECORD number of guesses 
 * CALCULATE percentage error
 * toString
 * */

public class GuessingGame {

	private int upperBound;
	private int totalGuesses;
	private int randpick;
	private int guess;
	private boolean checkMatch = false;
	private int wrongguess;

	public GuessingGame() {

	}

	public GuessingGame(int stop) {
		upperBound = stop;
	}

	public void setbound(int stop) {
		upperBound = stop;
	}

	public void playGame() {
		randpick = (int) Math.round(upperBound * Math.random());
		Scanner keyboard = new Scanner(System.in);
		while (!checkMatch) {
			System.out.println("Enter a number between 1 and " + upperBound);
			guess = keyboard.nextInt();
			if (guess >= 1 && guess <= upperBound) {
				check(guess);
			} else {
				System.out.println("Number out of range!");
			}
		}
		wrongguess = 100 - 100 / totalGuesses;
		checkMatch = false;
	}

	public void check(int i) { // check if match
		if (randpick == i) {
			checkMatch = true;
		} else {
			checkMatch = false;
		}
		totalGuesses++;
	}

	public String toString() {
		String output = "\nIt took " + totalGuesses + " guesses to guess " + randpick + ". You guessed wrong "
				+ wrongguess + " percent of the time.\n";
		totalGuesses = 0;
		return output;
	}
}