//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		
		//instantiate an AtCounter
		AtCounter test = new AtCounter();
		//test the code
		test.countAts(0, 0);
		System.out.println(test);
		
		test.countAts(2, 5);
		System.out.println(test);
		
		test.countAts(5, 0);
		System.out.println(test);
		
		test.countAts(9, 9);
		System.out.println(test);
		
		test.countAts(3, 9);
		System.out.println(test);
	}
}