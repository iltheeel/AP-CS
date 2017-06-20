
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer {
	private char theChar;

	public CharacterAnalyzer() { // this is a default constructor
		setChar('0');
	}

	public CharacterAnalyzer(char c) { // this is an alt constructor
		setChar(c);
	}

	public void setChar(char c) {// this is a setter
		theChar = c;
	}

	public char getChar() {// this is a getter
		return theChar;
	}

	public boolean isUpper() {// CHECKS FOR UPPERCASE
		if (65 <= (int) theChar && (int) theChar <= 90) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isLower() {// CHECKS FOR LOWERCASE
		if (97 <= (int) theChar && (int) theChar <= 122) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isNumber() {// more getters
		if (48 <= (int) theChar && (int) theChar <= 57) {
			return true;
		} else {
			return false;
		}
	}

	public int getASCII() {// getter again
		return theChar;
	}

	public String toString() {// getter toString
		if (isUpper()) {
			return "" + getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		}
		if (isLower()) {
			return "" + getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		}
		if (isNumber()) {
			return "" + getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
		return null;
	}
}