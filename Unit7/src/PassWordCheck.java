//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
		password = "hi";

	}

	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
		String input;
		do {
			System.out.println("Enter the password:: ");
			input = keyboard.next();
			if (!input.equals(password)) {
				System.out.println("INVALID");
			}
		} while (!input.equals(password));

		System.out.println("VALID");



	}
}