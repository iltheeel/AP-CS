
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes {
	public static void main(String[] args) {
		// System.out.print("print");
		StarsAndStripes();
	}

	public static void StarsAndStripes() {
		out.println("StarsAndStripes\n\n");
		printASmallBox();
		printTwoBlankLines();
		printABigBox();
	}

	public static void printTwentyStars() {
		System.out.println("********************");
	}

	public static void printTwentyDashes() {
		System.out.println("--------------------");
	}

	public static void printTwoBlankLines() {
		System.out.println("\n");
	}

	public static void printASmallBox() {
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
	}

	public static void printABigBox() {
		printASmallBox();
		printASmallBox();
	}
}