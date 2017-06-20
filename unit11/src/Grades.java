//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

public class Grades
{
	private List<Double> grades;
	private int numgrades;

	public Grades() {
		grades = new ArrayList<Double>();
		setGrades("");
	}

	public Grades(String gradeList) {
		grades = new ArrayList<Double>();
		setGrades(gradeList);
	}

	public void setGrades(String gradeList) {
		// set grades here
		grades.clear();
		Scanner files = new Scanner(gradeList);
		int numgrades = files.nextInt();
		String dash = files.next();
		for (int i =0; i<numgrades; i++) {
		grades.add(i, files.nextDouble());
		}

	}

	public void setGrade(int spot, double grade) {
		//not really sure what this is supposed to do
	}

	public double getSum() {
		double sum = 0.0;
		for (int i = 0; i < grades.size(); i++) {
			sum = sum + grades.get(i);
		}
		return sum;
	}

	public double getLowGrade() {
		double low = Double.MAX_VALUE;
		for (int i = 0; i < grades.size(); i++) {
			double temp = grades.get(i);
			if (temp < low) {
				low = temp;
			}
		}

		return low;
	}

	public double getHighGrade() {
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.size(); i++) {
			double temp = grades.get(i);
			if (temp > high) {
				high = temp;
			}
		}

		return high;
	}

	public int getNumGrades() {
		return grades.size();
	}

	public String toString() {
		String output = "";
		for (int i =0;i <grades.size(); i++) {
			output = output + grades.get(i) + " ";
		}

		return output;
	}
}