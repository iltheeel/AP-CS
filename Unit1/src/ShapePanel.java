//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);

		Shape blobone = new Shape(100, 300, 20, 42, Color.BLACK);
		blobone.draw(window);
		//instantiate a Shape
		//tell your shape to draw
		Shape blobtwo = new Shape(300, 200, 100, 70, Color.RED);
		blobtwo.draw(window);
		//instantiate a Shape
		//tell your shape to draw
		Shape blobthree = new Shape(400, 30, 76, 100, Color.YELLOW);
		blobthree.draw(window);
		//instantiate a Shape
		//tell your shape to draw
	}
}