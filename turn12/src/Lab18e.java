
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e {
	public static void main(String args[]) throws IOException {

		Scanner file = new Scanner(new File("/Users/liaiwei/Desktop/Unit12-2016/Unit12-Assignments/lab18d/lab18d.dat"));

		int size = file.nextInt();
		Word[] wurds = new Word[size];
		for (int i = 0; i < size; i++) {
			wurds[i] = new Word(file.next());
		}
				
		for(int i =0; i<wurds.length-1; i++) {
			int start =i;
			for(int j=i+1; j<wurds.length; j++) {
				if(wurds[j].compareTo(wurds[start])<0) start = j;
			}
			Word smol = wurds[start];
			wurds[start] = wurds[i];
			wurds[i] = smol;
		}
		String wurd = "";
		for (int t = 0; t < size; t++) {
			wurd = wurd + wurds[t] + "\n";
		}
		System.out.println(wurd);
	}
}