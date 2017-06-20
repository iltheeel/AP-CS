
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram {
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;
	private int lines;

	public Histogram() {
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName) {
		fileName = fName;
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		for (char demchars : values) {
			letters.add(demchars);
		}
		out.println("search letters = " + letters);
	}

	public void loadAndAnalyzeFile() throws IOException {
		Scanner file = new Scanner(new File(fileName));
		lines = Integer.parseInt(file.nextLine());
		int counts = 0;
		for (int j = 0; j < letters.size(); j++) {
			String lookfor = Character.toString(letters.get(j));
			Scanner files = new Scanner(new File(fileName));
			for (int i = 0; i < lines + 1; i++) {
				String sntc = files.nextLine();
				while (sntc.contains(lookfor)) {
					sntc = sntc.replaceFirst(lookfor, "0");
					counts++;
				}
			}
			count.add(counts);
			counts = 0;
		}
	}

	public char mostFrequent() throws FileNotFoundException {
		int max = count.get(0);
		char maxx = letters.get(0);
		for (int i = 1; i < count.size(); i++) {
			int temp = count.get(i);
			if (temp > max) {
				max = count.get(i);
				maxx = letters.get(i);
			}
		}
		return maxx;
	}

	public char leastFrequent() throws FileNotFoundException {
		int min = count.get(0);
		char minn = letters.get(0);
		for (int i = 1; i < count.size(); i++) {
			int temp = count.get(i);
			if (temp < min) {
				min = count.get(i);
				minn = letters.get(i);
			}
		}
		return minn;
	}

	public String toString() {
		return fileName + "\n" + letters + "\n" + count + "\n\n\n";
	}
}