//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover hell = new LetterRemover();
		hell.setRemover("I am Sam I am", 'a');
		System.out.println(hell);
		hell.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(hell);
		hell.setRemover("abababababa", 'b');
		System.out.println(hell);
		hell.setRemover("abaababababa", 'x');
		System.out.println(hell);
		hell.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(hell);
		
					
	}
}