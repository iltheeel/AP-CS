
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ship extends MovingThing {
	private int speed;
	private Image image;

	public Ship() {
		this(0, 0, 0);
	}

	public Ship(int x, int y) {
		this(x, y, 0);
	}

	public Ship(int x, int y, int s) {
		super(x, y);
		speed = s;
		try {
			image = ImageIO.read(new File("ship.jpg"));
		} catch (Exception e) {
			// feel free to do something here
			System.out.println("error");
		}
	}

	public void setImage(String i) {
		try {
			image = ImageIO.read(new File(i));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
	}
	
	public void setSpeed(int s) {
		speed = s;
		// add more code
	}

	public int getSpeed() {
		return speed;
	}

	public void move(String m) {
		if (m.equals("RIGHT")) {
			setX(getX() + getSpeed());
		}
		if (m.equals("LEFT")) {
			setX(getX() - getSpeed());
		}
		if (m.equals("UP")) {
			setY(getY() - getSpeed());
		}
		if (m.equals("DOWN")) {
			setY(getY() + getSpeed());
		}
	}

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), 80, 80, null);

	}

	public String toString() {
		return super.toString() + getSpeed();
	}
}
