
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort {
	private ArrayList<String> list;

	public InsertionSort() {
		list = new ArrayList<String>();

	}

	// modfiers
	public void add(String word) throws Exception {
		if (!list.contains(word))
			list.add(word);
	}

	public void remove(String word) {

		list.remove(word);
	}

	public String toString() {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (list.get(i).compareTo(list.get(j - 1)) < 0) {
					String temp = list.get(j);
					String temp2 = list.get(j - 1);
					list.set(j - 1, temp);
					list.set(j, temp2);
				}
			}
		}

		String output = "";
		for (int i = 0; i < list.size(); i++) {
			output = output + " " + list.get(i);
		}
		return output;
	}
}