
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("/Users/liaiwei/Desktop/Unit12-2016/Unit12-Assignments/lab18d/lab18d.dat"));

		int size = file.nextInt();
		Word[] wurds = new Word[size];
		for (int i = 0; i < size; i++) {
			wurds[i] = new Word(file.next());
		}

		Word smol = new Word(wurds[0].getw());
		for (int h = 0; h < size-1; h++) {
			int start =h;
			for (int i = h+1; i < size; i++) {
				if(wurds[i].compareTo(wurds[start])<0) start =i;
			}
			Word fun =wurds[start];
			wurds[start]=wurds[h];
			wurds [h]=fun;
		}


		String wurd = "";
		for (int t = 0; t < size; t++) {
			wurd = wurd + wurds[t] + "\n";
		}
		System.out.println(wurd);
	}

}
