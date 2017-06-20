
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance {
	private int xOne, yOne, xTwo, yTwo;
	private double distance;

	public Distance() {
		setCoordinates(0, 0, 0, 0);
	}

	public Distance(int x1, int y1, int x2, int y2) {
		// setCoordinates
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2) {
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance() {
		distance = Math.sqrt(Math.pow((xOne - xTwo), 2) + Math.pow((yOne - yTwo), 2));
	}


	public String toString() {
		return ("Enter X1 :: " + xOne + "\nEnterY1 :: "+ yOne + "\nEnter X2 :: "+xTwo +"\nEnter Y2 :: "+ yTwo
				+ "\ndistance :: "+String.format("%.3f", distance)+"\n");

	}
}