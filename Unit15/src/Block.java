
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		setPos(100, 150);
		setw(10);
		seth(10);
		setColor(Color.WHITE);
	}

	// add other Block constructors - x , y , width, height, color

	public Block(int x, int y) {
		setPos(x, y);
		setw(10);
		seth(10);
		setColor(Color.WHITE);
	}
	
	public Block(int x, int y, int w, int h) {
		setPos(x, y);
		setw(w);
		seth(h);
		setColor(Color.WHITE);
	}

	public Block(int x, int y, int w, int h, Color z) {
		setPos(x, y);
		setw(w);
		seth(h);
		setColor(z);
	}

	// add the other set methods
	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}

	public void setw(int w) {
		width = w;
	}

	public void seth(int h) {
		height = h;
	}

	public void setColor(Color col) {
		color = col;
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public Color getColor() {
		return color;
	}

	public void draw(Graphics window) {
		window.setColor(Color.WHITE);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public boolean equals(Object obj) {
		Block bl = (Block) obj;
		if (bl.getX() == this.getX() && bl.getY() == this.getY() && bl.getHeight() == this.getHeight()
				&& bl.getWidth() == this.getHeight())
			return true;
		return false;
	}

	// add the other get methods
	public String toString()  {
		return xPos + " " + yPos + " " + width+ " " + height + " " + color;
	}
	// add a toString() method - x , y , width, height, color
}