
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word> {
	private String word;

	public Word(String s) {
		word = s;

	}

	public String getw() {
		return word;
	}

	public int compareTo(Word rhs) {

		if (this.getw().equals(rhs.getw())) {
			return this.getw().compareTo(rhs.getw());
		}
		return rhs.getw().length() - this.getw().length();

	}

	public String toString() {
		return word;
	}
}