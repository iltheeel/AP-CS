
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas {
	public Robot() // constructor method - sets up the class
	{
		setSize(8010, 600);
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void paint(Graphics window) {
		window.setColor(Color.BLUE);
		window.drawString("Robot LAB ", 35, 35);

		// call head method
		Robot.head(window);
		// call other methods
		Robot.upperBody(window);
		Robot.lowerBody(window);
		Robot.eyes(window);
		Robot.mouth(window);
		Robot.arms(window);
		Robot.coverarc(window);
		Robot.nose(window);
	}

	public static void head(Graphics window) {
		window.setColor(Color.YELLOW);
		window.fillOval(300, 100, 180, 100);
		// add more code here
	}

	public static void nose(Graphics window) {
		window.setColor(Color.BLACK);
		window.fillOval(375, 145, 30, 20);
	}

	public static void eyes(Graphics window) {
		window.setColor(Color.GREEN);
		window.fillOval(410, 130, 20, 20);
		window.fillOval(350, 130, 20, 20);
	}

	public static void mouth(Graphics window) {
		window.setColor(Color.RED);
		window.fillArc(350, 160, 75, 30, 0, -180);
		// window.fillArc(x, y, width, height, startAngle, arcAngle);
	}

	public static void coverarc(Graphics window) {
		window.setColor(Color.YELLOW);
		window.fillArc(353, 157, 69, 30, 0, -180);
	}

	public static void arms(Graphics window) {
		window.setColor(Color.BLACK);
		window.drawLine(340, 220, 260, 180);
		window.drawLine(440, 220, 520, 180);
		window.drawLine(340, 430, 260, 470);
		window.drawLine(440, 430, 520, 470);
	}

	public static void upperBody(Graphics window) {
		window.setColor(Color.BLUE);
		window.fillRect(340, 220, 100, 100);
		// add more code here
	}

	public static void lowerBody(Graphics window) {
		// add more code here
		window.setColor(Color.GRAY);
		window.fillRect(340, 330, 100, 100);
	}
}