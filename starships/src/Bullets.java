import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets {
	private List<Ammo> ammo;
	private String direction;

	public Bullets() {
		ammo = new ArrayList<Ammo>();
	}


	public void draw(Graphics window) {
		for (Ammo a : ammo)
			a.draw(window);
	}

	public void move() {
		for (Ammo al : ammo) {
			al.move(direction);
		}
	}

	public void cleanEmUp() {
		for (int i = 0; i < ammo.size(); i++) {
			//System.out.print("Checking if need to destroy ammo... ");
			//System.out.println("bullet location: " + ammo.get(i).getY());
			if (ammo.get(i).getY() < -20) {
				ammo.remove(i);
				//System.out.println("destroying ammo");
			}
		}
	}


	
	public List<Ammo> getList() {
		return ammo;
	}

	public String toString() {
		return "" + ammo;
	}

	public void add(Ammo al, String d) {
		// TODO Auto-generated method stub
		ammo.add(al);
		direction = d;

	}
}
