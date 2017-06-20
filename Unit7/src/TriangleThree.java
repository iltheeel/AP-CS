//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle("",0);
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		size=sz;
		letter=let;
	}
	

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for (int h = size; h > 0; h--) {
			for (int i = 0; i < h; i++) {
				output = letter+ output;
			}
			output = "\n" + output;
		}
		
		return output+"\n";
	}
}