
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker {
	private String word;

	public StringChecker() {

	}

	public StringChecker(String s) {
		word = s;
	}

	public void setString(String s) {                        
		word = s;
	}

	public boolean findLetter(char c) {
		int doescontain = word.indexOf(c);
		if (doescontain > -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean findSubString(String s) {
		int containstring = word.indexOf(s);
		if (containstring > -1) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return word + "\n\n";
	}
}