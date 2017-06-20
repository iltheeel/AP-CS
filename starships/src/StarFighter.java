//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;

public class StarFighter extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public StarFighter()
	{
		super("STARFIGHTER");
		setSize(WIDTH,HEIGHT);

		OuterSpace theGame = new OuterSpace();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
	}

	public static void main( String args[] )
	{
		StarFighter run = new StarFighter();
	}
}


/*	public boolean Collide(Ship ship) {
for (int j = 0; j < ammo.size(); j++) {
	Ammo al = ammo.get(j);
	if ((ship.getX() >= al.getX() && ship.getX() <= al.getX() + 60)
			|| (ship.getX() + 10 >= al.getX() && ship.getX() + 10 <= al.getX() + 10)) {
		if ((ship.getY() >= al.getY() && ship.getY() <= al.getY() + 60)
				|| (ship.getY() + 10 >= al.getY() && ship.getY() + 10 <= al.getY() + 60)) {
			return true;
		}
	}
}
return false;
} */