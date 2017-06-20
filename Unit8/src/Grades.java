//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private int assign;
	private float[] grades;
	
	//constructor
	public Grades() {
		
	}
	public Grades(int i, float[] j) {
		setGrades(i, j);
	}

	//set method
	public void setGrades(int i, float[] j){
		assign = i;
		grades = j;
	}


	private double getSum()
	{
		double sum=0.0;
		for (int i=0; i<assign; i++) {
			sum += grades[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/assign;
		return average;
	}

	//toString method
	public String toString(){
		String output= "";
		for (int i = 0; i<assign; i++){
			output += "grade "+i+" :: "+String.format("%.2f",grades[i] )+ "\n";
		}
		output+="\naverage = " +String.format("%.2f",getAverage())+"\n\n";
		return output;
	}


}