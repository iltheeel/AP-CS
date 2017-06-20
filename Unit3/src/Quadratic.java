
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.math.*;

public class Quadratic {
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic(int quadA, int quadB, int quadC) {
		setEquation(quadA, quadB, quadC);
		calcRoots();
	}

	public void setEquation(int quadA, int quadB, int quadC) {
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void calcRoots() {
		double myquad = sqrt(pow(b, 2) - 4 * a * c);
		rootOne = (-b + myquad) / (2 * a);
		rootTwo = (-b - myquad) / (2 * a);
	}

	public String toString() {
		return ("Enter a :: " + a + "\nEnter b :: " + b + "\nEnter c :: " + c + "\n\nrootone :: "
				+ String.format("%.2f", rootOne) + "\nroottwo :: " + String.format("%.2f \n", rootTwo) + "\n\n\n");

	}
}