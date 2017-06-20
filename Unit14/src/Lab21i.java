
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i {
	public static void main(String args[]) throws IOException {
		Scanner read = new Scanner(new File("lab21i.dat"));
		int size =0;
		String readme = "";
		while(read.hasNextLine()) {
			size = read.nextInt();
			readme = read.nextLine()+ read.nextLine();
			Maze test = new Maze(size, readme);
			System.out.println(test);
		}
	}
}