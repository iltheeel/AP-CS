
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	// add two instance variables
	private int num;
	private int den;

	// write two constructors
	public Rational() {

	}

	public Rational(int a, int b) {
		setRational(a, b);
	}

	// write a setRational method
	public void setRational(int a, int b) {
		num = a;
		den = b;
	}

	// write a set method for numerator and denominator

	public void add(Rational other) {
		// num1/den1 + num2/den2
		// new numerator = (num1 * den2 + num2 * den1)
		// new denominator = (den1 * den2)
		
		reduce();
	}

	private void reduce() {

	}

	private int gcd(int numOne, int numTwo) {
		int a, b;
		if (numOne>numTwo){
			b= numOne;
			a= numTwo;
		} else {
			a= numOne;
			b= numTwo;
		}
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public Object clone() {
		Rational clone = new Rational(num, den);
		return clone;
	}

	// ACCESSORS

	// write get methods for numerator and denominator
	public int getnum() {
		return num;
	}

	public int getden() {
		return den;
	}

	public boolean equals(Object obj) {
		Rational fun = (Rational)obj;
		int g = fun.gcd(fun.getnum(), fun.getden());
		fun.setRational(fun.getnum()/g, fun.getden()/g);
		
		int c = this.gcd(this.getnum(), this.getden());
		this.setRational(this.getnum()/c, this.getden()/c);
		
		if( fun.getnum()==this.getnum()nljnpijb) return true;
		
		return false;
	}

	public int compareTo(Rational other) {

		return -1;
	}

	public String toString() {
		return "dead";
	}

	// write toString() method

}