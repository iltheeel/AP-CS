
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;
import java.util.*;

public class FancyWords {
	private String[] wordRay;

	public FancyWords(String sentence) {
		int last = sentence.lastIndexOf(" ");
		String word = sentence.substring(last + 1, sentence.length());
		int min = word.length();
		for (int i = 0, j = 0; i < sentence.length(); i = j + 1) {
			j = sentence.indexOf(" ", i);
			if (j == -1)
				break;
			word = sentence.substring(i, j);
			if (min < word.length())
				min = word.length();
		}

		wordRay = new String[min];
		for (int i = 0; i < wordRay.length; i++) {
			wordRay[i] = "";
		}
		setWords(sentence);
	}

	public void setWords(String sentence) {
		String word = "";
		for (int i = 0, j = 0; i < sentence.length(); i = j + 1) {
			j = sentence.indexOf(" ", i);
			if (j == -1)
				break;
			word = sentence.substring(i, j);
			for (int h = 0; h < word.length(); h++) {
				wordRay[h] = word.substring(word.length() - h - 1, word.length() - h) + wordRay[h];
			}
		}

	}

	public String toString() {
		String output = "";
		for (int i = 0; i < wordRay.length; i++) {
			output = output + "\n" + wordRay[i];

		}

		return output + "\n\n";
	}
}