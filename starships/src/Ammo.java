//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		this(x,y,0);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x,y);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.yellow);
		window.drawOval(super.getX(), super.getY(), 5, 5);

		//add code to draw the ammo
	}

	public void move() {
		setY(super.getY()+speed);
	}
	
	public String toString()
	{
		return "";
	}
}

//arraylist of bullets
