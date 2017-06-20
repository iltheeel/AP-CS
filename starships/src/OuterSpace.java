
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class OuterSpace extends Canvas implements KeyListener, Runnable {
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private AlienHorde horde; 
	private boolean runner = true;
	
	private int shoot;
	
	//private Ammo bullet;

	private AlienHorde aliens; 
	private Bullets shots;
	private AlienBullets ashots;

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace() {
		setBackground(Color.black);

		keys = new boolean[5];

		// instantiate other stuff

		this.addKeyListener(this);
		new Thread(this).start();
		ship = new Ship(300,500,5);
		aliens = new AlienHorde(20);
		shots = new Bullets();
		ashots = new AlienBullets();
		shoot =0;
		setVisible(true);
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		// set up the double buffering to make the game animation nice and
		// smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			// StarFighter.HEIGHT = this.getheight ;
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		ship.draw(graphToBack);
		aliens.draw(graphToBack);
		
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50);
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0, 0, 800, 600);

		
		//see if the ship needs to be moved
		if (keys[0] == true) {
			ship.move("LEFT");
			ship.draw(graphToBack);
		}

		// add code to move stuff
		if (keys[1] == true) {
			ship.move("RIGHT");
			ship.draw(graphToBack);
		}

		if (keys[2] == true) {
			ship.move("UP");
			ship.draw(graphToBack);
		}

		if (keys[3] == true) {
			ship.move("DOWN");
			ship.draw(graphToBack);
		}

		if (keys[4] == true) {
			ship.move("SPACE");
			shots.add(new Ammo((ship.getX()+20), ship.getY(), 5), "UP");
			shoot++;
			for (int i =0; i<shoot; i++) {
			int rng = (int) (Math.random()*600);
			ashots.add(new Ammo(rng, 10, 3), "DOWN");
			}
			keys[4] = false;
			
		}
		repaint();
		// add in collision detection
		// see if bullet has hit an an alien
		
		//see if ship has hit an alien
		
		int killer = (int) (Math.random()*aliens.getAList().size());
		//System.out.println(killer);
		int rng = (int) (Math.random()*100);
		if(rng>97) {
			//System.out.println(rng);
			
			ashots.add(new Ammo(aliens.getAList().get(killer).getX(), aliens.getAList().get(killer).getY(), 3), "DOWN");
		}
		ashots.move();
		ashots.draw(graphToBack);
		ashots.move();
		
		shots.move();
		shots.draw(graphToBack);
		shots.move();
		
		
		
		ship.draw(graphToBack);
		
		
		aliens.move();
		aliens.draw(graphToBack);
		aliens.move();
		
		//apparently this is collision detection
		shots.cleanEmUp();
		ashots.cleanEmUp();
		
		if(aliens.Collide(ship)||ashots.Collide(ship)) {
			// draw game over
			graphToBack.clearRect(0, 0, 800, 600);
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("GAME OVER", 400, 200);
			setBackground(Color.WHITE);
			runner = false;
			
		}
		aliens.removeDeadOnes(shots.getList());


		twoDGraph.drawImage(back, null, 0, 0);
		back = null;
	}

	   public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e) {

	}

	public void run() {
		/*ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(new Runnable()
        {
            public void run()
            {
                repaint();
            }
        }, 0, 1, TimeUnit.SECONDS);
	
		*/
		try {
			while (runner) {
				Thread.currentThread().sleep(2);
				repaint();
			}
			//System.out.println("stopped");
			ship.setImage("rip.png");
		} catch (Exception e) {
			System.out.println("error game could not run");
		}
		//System.out.println("does it ever get here");*/
	}
}
