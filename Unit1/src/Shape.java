//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width= wid;
		height= ht;
		color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      window.setColor(Color.CYAN);
      window.fillRoundRect(xPos+10, yPos+2, width/2, height/2, 23, 30);
      window.drawLine(xPos, yPos, xPos-10, yPos+100);
      window.setColor(Color.magenta);
      window.fillArc(xPos, yPos+100, width+40, height, 0, 180);
      //draw whatever you want
      //fyi these things turn out to look like hideous tadpoles please don't judge my artistic ability
   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}