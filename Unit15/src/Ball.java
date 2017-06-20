
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200, 10, 10);
		xSpeed = 3;
		ySpeed = 1;
	}

	// add the other Ball constructors
	public Ball(int x, int y) {
		super(x, y, 10, 10);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c, int xs, int ys) {
		super(x, y, w, h, c);
		xSpeed = xs;
		ySpeed = ys;
	}

	// add the set methods
	public void setXSpeed(int s) {
		xSpeed = s;
	}
	public void setYSpeed(int s) {
		ySpeed = s;
	}

	public void moveAndDraw(Graphics window) {
		draw(window);
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);
		draw(window, this.getColor());
	}

	public boolean equals(Object obj) {
		Ball bl = (Ball) obj;
		if (bl.getX() == this.getX() && bl.getY() == this.getY() && bl.getHeight() == this.getHeight()
				&& bl.getWidth() == this.getWidth() && bl.getXSpeed() == this.getXSpeed()
				&& bl.getYSpeed() == this.getYSpeed())
			return true;
		return false;
	}

	// add the get methods
	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		Ball ball = (Ball) obj;
		if(ball.getX()<10) return true;
		return false;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		Ball ball = (Ball) obj;
		if(ball.getX()>780) return true;
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		Ball ball = (Ball) obj;
		if(ball.getY()<10) return true;
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		Ball ball = (Ball) obj;
		if(ball.getY()>550) return true;
		return false;
	}
	
	
	public String toString() {
		return this.getX() + " " + this.getY() + " " + this.getHeight() + " " + this.getWidth() + " " + this.getColor()
				+ " " + xSpeed + " " + ySpeed;
	}
	// add a toString() method
}
