
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover {
	private String sentence;
	private char lookFor;

	public LetterRemover() {
		// call set
		sentence = "";
		lookFor = '0';
	}

	// add in second constructor
	public LetterRemover(String s) {
		sentence = s;
	}

	public void setRemover(String s, char rem) {
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters() {
		String cleaned = sentence;
		String lookingfor = Character.toString(lookFor);
		while (cleaned.contains(lookingfor)) {
			int dead = cleaned.indexOf(lookingfor);
			if (dead >0) {
				cleaned = cleaned.substring(0, dead) 
						+ cleaned.substring(dead+1, cleaned.length());
			}
		}

		return cleaned;
	}

	public String toString() {
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}