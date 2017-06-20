
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze {
	private int[][] maze;
	private int siz; 
	private boolean found;
	
	public Maze() {
		maze = new int[0][0];
	}

	public Maze(int size, String input) {
		// so ive theoretically made a maze. great
		Scanner food = new Scanner(input);
		siz = size;
		int ct = 0;
		maze = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				maze[i][j] = food.nextInt();
				ct++;
			}
		}

	}

	public boolean hasExitPath(int r, int c) {
		// now we go look in this possibly nonexistant maze
		if (maze[r][c] == 1) {
			maze[r][c] = 2;
			if (c == siz -1) {
				found = true; 
			}
			
			if (r < siz-1)
				hasExitPath(r + 1, c);

			if (r > 0)
				hasExitPath(r - 1, c);

			if (c < siz -1)
				hasExitPath(r, c + 1);

			if (c > 0)
				hasExitPath(r, c - 1);
			
		}

		return found;
	}

	public String toString() {
		String output = "";
		for(int i =0; i< siz; i++){
			for(int j =0; j<siz; j++) {
				output = output + maze[i][j];
			}
			output = output + "\n";
		}
		if(hasExitPath(0,0)) return output + "\nexit found";
		return output+ "\nexit not found";
	}
}