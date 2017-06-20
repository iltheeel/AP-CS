
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
import java.io.FileNotFoundException;

public class ClassTester {
	public static void main(String args[]) {
		try {
			Scanner read = new Scanner(new File("/Users/liaiwei/Desktop/Unit11-2016/Unit11-Assignments/Lab19b/gradebook.dat"));
			String classname = read.nextLine();
			int kids = read.nextInt();
			Class test = new Class(classname, kids);
			for (int i = 0; i < kids; i++) {
				String name = read.next() +" "+  read.next();
				String grade = read.nextLine() +read.nextLine();
				test.addStudent(i, new Student(name, grade));
				
			}
			out.println(test);
			out.println("Failure List = " + test.getFailureList(70));
			out.println("Highest Average = " + test.getStudentWithHighestAverage());
			out.println("Lowest Average = " + test.getStudentWithLowestAverage());
			out.println("Class Average = " +String.format("%.5f", test.getClassAverage()));
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}

	}
}