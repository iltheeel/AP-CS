import java.awt.color.*;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {

	private List<Alien> aliens;

	public AlienHorde(int size) {
		aliens = new ArrayList<Alien>();
		for (int i = 1; i < size+1; i++) {
			if (i < 11) {
				add(new Alien(65 * i, 0, 3));
			} else {
				add(new Alien(65 * (i - 10), 70, 3));
			}

		}
	}
	
	public List<Alien> getAList() {
		return aliens;
	}

	public void add(Alien al) {
		aliens.add(al);
	}

	public void draw(Graphics window) {
		for (Alien a : aliens)
			a.draw(window);
	}

	public void move() {
		for (Alien al : aliens) {
			// al.move("DOWN");

			if (al.getX() > 0 && al.getX() < 800 && al.getSpeed() > 0) {
				al.move("RIGHT");
			} else if (al.getX() > 0 && al.getX() < 800 && al.getSpeed() < 0) {
				al.move("LEFT");
			} else {
				al.setY(al.getY()+80);
				al.setSpeed(-al.getSpeed());
				al.setX(al.getX() + al.getSpeed());
			}

		}
	}

	public void removeDeadOnes(List<Ammo> shots) {
		for (int i = 0; i < shots.size(); i++) {
			Ammo am = shots.get(i);
			for (int j = 0; j < aliens.size(); j++) {
				Alien al = aliens.get(j);
				if ((am.getX() >= al.getX() && am.getX() <= al.getX() + 60)
						|| (am.getX() + 10 >= al.getX() && am.getX() + 10 <= al.getX() + 60))
					if ((am.getY() >= al.getY() && am.getY() <= al.getY() + 60
							|| (am.getY() + 10 >= al.getY() && am.getY() + 10 <= al.getY() + 60))) {
						aliens.remove(j);
						shots.remove(i);
						break;
					}
			}
		}
	}

	public boolean Collide(Ship ship) {
		for (int j = 0; j < aliens.size(); j++) {
			Alien al = aliens.get(j);
			if ((ship.getX() >= al.getX() && ship.getX() <= al.getX() + 60)
					|| (ship.getX() + 10 >= al.getX() && ship.getX() + 10 <= al.getX() + 10)) {
				if ((ship.getY() >= al.getY() && ship.getY() <= al.getY() + 60)
						|| (ship.getY() + 10 >= al.getY() && ship.getY() + 10 <= al.getY() + 60)) {
					return true;
				}
			}
		}
		return false;
	}

	public String toString() {
		return "" + aliens;
	}

}
