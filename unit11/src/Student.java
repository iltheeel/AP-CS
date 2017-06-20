//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable <Student>
{
	private String myName;
	private Grades myGrades;
	private double average; 
	
	public Student()
	{
		myGrades = new Grades();
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		this.myGrades = new Grades(gradeList);
		setName(name);

	}
	
	public void setName(String name)
	{
		this.myName = name;

	}	
	
	public void setGrades(String gradeList)
	{
		myGrades.setGrades(gradeList);
	
	}
	
	public void setGrade(int spot, double grade)
	{
		//i still have no idea what this is for

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		this.average = getSum()/getNumGrades();
		return average;
	}

	public double getAverageMinusLow()
	{
		return (getSum()-getLowGrade())/(getNumGrades()-1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();	
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();
	}
	@Override
	public int compareTo(Student c) {
		return Double.compare(this.getAverage(), c.getAverage());

	}
	
	public String toString()
	{
		return myName + " = " +myGrades.toString();
	}	
}