
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord {
	private char[][] mat;
	private boolean exempt;
	private char[] mats;
	private int key;
	private String output;

	public FancyWord() {

	}

	public FancyWord(String s) {
		key = (s.length() + 1) / 2;
		mats = new char[s.length()];
		mat = new char[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++) {
			mats[i] = s.charAt(i);
		}

		// TIME TO TIP THE SCALES
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				mat[i][j] = ' ';
			}
		}
		// giant mess
		if (s.length() > 2) {
			// front end
			for (int i = 0; i < s.length(); i++) {
				mat[0][i] = mats[i];
			}
			// backend
			for (int i = 0; i < s.length(); i++) {
				mat[s.length() - 1][i] = mats[i];
			}
			// leg
			for (int i = 1; i < key; i++) {
				mat[i][i] = mats[i];
			}
			// upper left leg
			int start = 1;
			for (int j = s.length() - 2; j > key - 1; j--) {
				mat[start][j] = mats[j];
				start++;
			}
			// something here is very dead i made a very sketchy edit
			start = s.length() - 3;
			for (int i = 1; i < key; i++) {
				mat[start + i][i] = mats[i];
				start = start - 2;
			}
			// lower left leg WORKS
			for (int j = s.length() - 2; j > key - 1; j--) {
				mat[j][j] = mats[j];
			}

			// don't touch
		} else if (s.length() == 2) {
			exempt = true;
			output = s + "\n" + s;
		} else {
			exempt = true;
			output = s;
		}
	}

	public String toString() {
		if (exempt)
			return output + "\n";
		output = "";
		for (int i = 0; i < mats.length; i++) {
			for (int j = 0; j < mats.length; j++) {
				output = output + Character.toString(mat[i][j]);
			}
			output = output + "\n";
		}

		return output;// + "\n\n";
	}
}