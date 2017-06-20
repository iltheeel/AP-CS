
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name {
	private String name;

	public Name() {

	}

	public Name(String s) {
		name = s;

	}

	public void setName(String s) {
		// sets the first and last name
		name = s;

	}

	public String getFirst() {

		int namecut = name.indexOf(" ");
		return name.substring(0, namecut);
	}

	public String getLast() {
		int namecut = name.indexOf(" ");
		return name.substring(namecut + 1, name.length());
	}

	public String toString() {
		return name + "\n";
	}
}