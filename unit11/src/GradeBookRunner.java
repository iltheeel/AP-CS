
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.io.File;

public class GradeBookRunner {
	private static List<Class> classes;

	public static void main(String args[]) {
		out.println("Welcome to the Class Stats program!");
		Scanner read = new Scanner(System.in);
		int classes = read.nextInt();
		for (int j = 0; j < classes; j++) {
			String classname = read.nextLine();
			int kids = read.nextInt();
			Class test = new Class(classname, kids);
			for (int i = 0; i < kids; i++) {
				String name = read.next() + " " + read.next();
				String grade = read.nextLine() + read.nextLine();
				test.addStudent(i, new Student(name, grade));
			}

		}

	}
}