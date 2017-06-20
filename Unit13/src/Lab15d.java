//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{

		Scanner food = new Scanner(new File("lab15d.dat"));
		int lines = food.nextInt();
		for(int i =0; i< lines; i++ ) {
			FancyWords wurd = new FancyWords(food.nextLine()+food.nextLine());
			System.out.println(wurd);
		}



	}
}