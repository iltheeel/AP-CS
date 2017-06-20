
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

	public String getword() {
		return word;
	}
	private int numVowels() {
		String vowels = "AEIOUaeiou";
		int vowelCount = 0;
		for (int i = 0; i < word.length()-1; i++) {
			String temp = word.substring(i, i+1);
			for (int j = 0; j < vowels.length(); j++) {
				if(vowels.substring(j,j+1).equals(temp)) vowelCount++;
			}
		}

		return vowelCount;
	}

	public int compareTo(Word rhs) {
		if(this.numVowels()==rhs.numVowels()) {
			 return this.getword().compareTo(rhs.getword());
		}
		return this.numVowels()-rhs.numVowels();
	}

	public String toString() {
		return word;
	}
}