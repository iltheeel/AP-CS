
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.nio.file.Files;

public class MadLib {
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String story;

	public MadLib() {
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName) {
		// load stuff
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();

		loadNouns();
		loadAdjectives();
		loadVerbs();
		try {
			Scanner file = new Scanner(
					new File(fileName));
			story = file.nextLine();
		} catch (Exception e) {
			out.println("Houston we have a problem!");
		}

	}

	public void loadNouns() {
		try {
			Scanner file = new Scanner(
					new File("/Users/liaiwei/Desktop/Unit10-2016/Unit10-Assignments/Lab16d/nouns.dat"));
			while (file.hasNextLine()) {
				nouns.add(file.nextLine());
			}
		} catch (Exception e) {
			out.println("Houston we have a problem!");
		}

	}

	public void loadVerbs() {
		try {
			Scanner file = new Scanner(
					new File("/Users/liaiwei/Desktop/Unit10-2016/Unit10-Assignments/Lab16d/verbs.dat"));
			while (file.hasNextLine()) {
				verbs.add(file.nextLine());
			}
		} catch (Exception e) {
			out.println("Houston we have a problem!");
		}

	}

	public void loadAdjectives() {
		try {
			Scanner file = new Scanner(
					new File("/Users/liaiwei/Desktop/Unit10-2016/Unit10-Assignments/Lab16d/adjectives.dat"));
			while (file.hasNextLine()) {
				adjectives.add(file.nextLine());
			}
		} catch (Exception e) {
			out.println("Houston we have a problem!");
		}

	}

	public String getRandomVerb() {
		int getme = (int) (Math.random() * verbs.size());
		return verbs.get(getme);
	}

	public String getRandomNoun() {
		int getme = (int) (Math.random() * nouns.size());
		return nouns.get(getme);
	}

	public String getRandomAdjective() {
		int getme = (int) (Math.random() * adjectives.size());
		return adjectives.get(getme);
	}

	public String toString() {

		while (story.contains("#")) {
			int death = story.indexOf("#");
			story = story.substring(0, death) + getRandomNoun() + story.substring(death + 1, story.length());
		}
		while (story.contains("@")) {
			int death = story.indexOf("@");
			story = story.substring(0, death) + getRandomVerb() + story.substring(death + 1, story.length());
		}
		while (story.contains("&")) {
			int death = story.indexOf("&");
			story = story.substring(0, death) + getRandomAdjective() + story.substring(death + 1, story.length());
		}
		return story + "\n\n\n";
	}
}