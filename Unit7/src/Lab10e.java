
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e {
	/*
	 * TODO: PROMPT for boundaries CALCULATE a random int CHECK if num matches
	 * RECORD number of guesses CALCULATE percentage error toString
	 */
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String agree = new String("y");
		GuessingGame game = new GuessingGame();
		do {
			System.out.println("Guessing Game - how many numbers?");
			game.setbound(keyboard.nextInt());
			game.playGame();
			System.out.println(game);
			System.out.println("Do you want to play again?");
			agree = keyboard.next();
		} while (agree.equals("y"));

	}

}