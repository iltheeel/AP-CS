//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class Circle {
	private double radius;
	private double area;

	public Circle (double rad) {
		setRadius(0);

	}
	public void setRadius(double rad) {
		radius = rad;

	}

	public void calculateArea() {
		area = Math.pow(radius, 2) * Math.PI;

	}

	public String toString() {
		return ("The area is :: " + String.format("%.4f", area) + "\n");
	}
}