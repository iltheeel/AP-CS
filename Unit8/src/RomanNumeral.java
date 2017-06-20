
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral {
	private Integer number;
	private String roman;

	private final static int[] NUMBERS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	private final static String[] LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public RomanNumeral(String str) {
		setRoman(str);
		setNumber(-1);
	}

	public RomanNumeral(Integer orig) {
		setNumber(orig);
		setRoman("");
	}

	public void setNumber(Integer num) {
		number = num;
	}

	public void setRoman(String rom) {
		roman = rom;
	}

	public String getNumber() {
		int die = number;
		String transrom = "";
		if (number >= 0) {
			for (int i = 0; i < NUMBERS.length; i++) {
				while (die >= NUMBERS[i]) {
					die -= NUMBERS[i];
					transrom = transrom + LETTERS[i];
				}
			}
		}
		if (roman.length() >= 1) {
			int transrome = 0;
			for (int i = 0; i < LETTERS.length; i++) {
				while (roman.contains(LETTERS[i]) && roman.indexOf(LETTERS[i]) == 0) {
					int loc = LETTERS[i].length();
					roman = roman.substring(loc, roman.length());
					transrome = transrome + NUMBERS[i];
				}
			}
			transrom = Integer.toString(transrome);
		}
		return transrom;
	}

	public String toString() {
		return getNumber() + "\n";
	}
}