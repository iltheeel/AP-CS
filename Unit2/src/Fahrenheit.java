//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit {
	private double fahrenheit;

	public void setFahrenheit(double fahren) {
		fahrenheit = fahren;
	}

	public double getCelsius() {
		double celsius = (fahrenheit - 32) * 5 / 9;
		// add code to convert fahrenheit to celsius
		return celsius;
	}

	public String toString() {
		return (String.format("%.2f", fahrenheit) + " degrees Fahrenheit == " + String.format("%.2f", getCelsius())
				+ " degrees Celsius \n\n");
	}
}