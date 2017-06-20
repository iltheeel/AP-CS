
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples {
	private int number;

	public Triples() {
		setNum(0);
	}

	public Triples(int num) {
		setNum(num);
	}

	public void setNum(int num) {
		number = num;
	}

	private static int gcf(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b; 
			a = temp;
		}
		return a;
	}

	public String toString() {
		int a;
		int b;
		int c;
		String output = "";

		for (c = 0; c < number; c++) {
			for (b = 0; b < c; b++) {
				for (a = 0; a < b; a++) {
					if (Math.pow(a, 2) + Math.pow(b, 2) == c * c) {
						if (gcf(b, a) == 1 && gcf(c, b) == 1 && gcf(c, a) == 1) {
							if (c % 2 != 0 && ((a % 2 == 0 && b % 2 != 0) || (b % 2 == 0 && a % 2 != 0))) {
								output = output + "\n" + a + " " + b + " " + c;
							}
						}
					}
				}
			}
		}

		return output + "\n";
	}
}