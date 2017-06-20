import java.util.Scanner; //this is a prewritten class! which means you can be lazy :DDDDD

public class unitZero { //this is a class
	public static void main (String[] args) { //this is the method
		System.out.println("i can print things"); //prints
		System.out.print("i can print things on a new line"); //prints on new line
		//System.out.printf(null, null); //prints things according to specs, don't worry about it
		
		System.out.println("hi\nbye"); //new line
		System.out.println("hi\tbye"); //tabs
		System.out.println("hi\rbye"); //carriage return
		System.out.println("hi\bbye"); //backspace
		System.out.println("\\"); // \
		System.out.println("\""); // "
		System.out.println("\'"); // '
		
		//a reference var stores the memory address of an object
		//Robot m = new Robot;
		// m stores the address of a Robot
		
		
		
		//variable types
		byte a; //8 bit
		short b; //16
		int c; //32
		long d; //64
		float f = 3.14f; //32
		double g;  //64
		char h='h'; //16 unsigned
		int cc = h;
		System.out.println(cc);
		//ref var is unsigned
		//useful ascii things
		// A-65, a-97, 0-48
		//it is nice to use
		System.out.println(Short.MIN_VALUE);
		//etc to find max data storage
		
		//reading things
		Scanner scan/*reference variable*/ = new Scanner/*object instantiation*/(System.in);
		//some methods include nextInt(), next(), nextLong(), nextLine(), etc
		String yourName = scan/*ref var*/.next();//method call
		System.out.println("Hi! Nice to meet you "+yourName);
		//you can use the Integer.parseInt(scan.readLine()) method to read something then convert into int
	}
	
}
