
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class {
	private String name;
	private static List<Student> studentList;
	private int count;

	public Class() {
		name = "";
		studentList = new ArrayList<Student>();
	}

	public Class(String nam, int stuCount) {
		studentList = new ArrayList<Student>();
		name = nam;
		
	}

	public void addStudent(int stuNum, Student s) {
		studentList.add(stuNum, s);
	}

	public String getClassName() {
		return name;
	}

	public double getClassAverage() {
		double classAverage = 0.0;
		for (int i =0; i<studentList.size();i++) {
			classAverage = classAverage + studentList.get(i).getAverage();
		}
		return classAverage/studentList.size();
	}

	public double getStudentAverage(int stuNum) {
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName) {
		for (int i =0; i<studentList.size(); i++) {
			if (stuName.equals(studentList.get(i).getName())){
				return studentList.get(i).getAverage();
			}
		}
		
		return 0;
	}

	public String getStudentName(int stuNum) {
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage() {
		Collections.sort(studentList);
		return studentList.get(studentList.size()-1).getName();
	}

	public String getStudentWithLowestAverage() {
		Collections.sort(studentList);
		return studentList.get(0).getName();
	}

	public String getFailureList(double failingGrade) {
		String output = "";
		for (int i = 0; i<studentList.size(); i++) {
			if (studentList.get(i).getAverage()<failingGrade) {
				output = output + " "+ studentList.get(i).getName();
			}
		}
		return output;
	}

	public String toString() {
		Collections.sort(studentList);
		String output = "";
		for (Student me: studentList) {
			output = output + me + " " + String.format("%.2f", me.getAverage())+ "\n";
		}
		return output;
	}
}