import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName
	 *            the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height
	 *            the height of the desired picture
	 * @param width
	 *            the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture
	 *            the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image
	 *            the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName,
	 *         height and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}
	
	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	/** method to keep only blue **/
	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void keepOnlyRed() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void keepOnlyGreen() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setBlue(0);
			}
		}
	}

	/** negate method **/
	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int gray = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen()) / 3;
				pixelObj.setRed(gray);
				pixelObj.setGreen(gray);
				pixelObj.setBlue(gray);
			}
		}
	}

	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}

	public void fixUnderwater() {
		// ill fix it later rip
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				if (pixelObj.getRed() < 19) {
					pixelObj.setRed(pixelObj.getRed() + 200);
				}

			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of
	 * the picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}

	public void mirrorHorizontal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int width = pixels.length;
		for (int col = 0; col < pixels[0].length; col++) {
			for (int row = 0; row < width / 2; row++) {
				topPixel = pixels[row][col];
				botPixel = pixels[width - 1 - row][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorHorizontalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int width = pixels.length;
		for (int col = 0; col < pixels[0].length; col++) {
			for (int row = 0; row < width / 2; row++) {
				topPixel = pixels[row][col];
				botPixel = pixels[width - 1 - row][col];
				topPixel.setColor(botPixel.getColor());
			}
		}
	}

	public void mirrorDiagonal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int square = 0;
		int root = 0;

		if (pixels.length > pixels[0].length)
			square = pixels[0].length;
		else
			square = pixels.length;

		for (int i = 0; i < square; i++) {
			for (int j = (int) Math.sqrt(i); j < square; j++) {
				topPixel = pixels[i][j];
				botPixel = pixels[j][i];
				topPixel.setColor(botPixel.getColor());
			}
		}

	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {
				count++;
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
		System.out.println(count);
	}

	public void mirrorArms() {
		Pixel topPixel = null;
		Pixel botPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		int mir = 202;

		for (int row = 158; row < mir; row++) {
			for (int col = 103; col < 170; col++) {
				topPixel = pixels[row][col];
				botPixel = pixels[mir - row + mir][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
		
		for(int row = 171; row< mir; row++) {
			for(int col = 239; col<290; col++) {
				topPixel = pixels[row][col];
				botPixel = pixels[mir-row+mir][col];
				botPixel.setColor(topPixel.getColor());
			}
		}

	}

	public void mirrorGull() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int mirror = 360;

		for (int row = 0; row < pixels.length; row++) {
			for (int col = 70; col < 360; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][648 + 68 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in
	 * the current picture
	 * 
	 * @param fromPic
	 *            the picture to copy from
	 * @param startRow
	 *            the start row to copy to
	 * @param startCol
	 *            the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	// copied thing
	public void copyy(Picture fromPic, int startRow, int startCol, int endRow, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();

		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < endCol; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	public void myCollage() {
		Picture one = new Picture("images/marth.jpg");
		Picture two = new Picture("images/swan.jpg");
		Picture three = new Picture("images/whiteFlower.jpg");
		one.keepOnlyBlue();
		this.copy(one, 0, 0);
		two.mirrorVertical();
		this.copyy(two, 340, 0, 360, 20);
		three.mirrorDiagonal();
		this.copy(three, 0, 400);
		this.write("images/newcollage.jpg");

	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("images/flower1.jpg");
		Picture flower2 = new Picture("images/flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("images/collage.jpg");
	}

	public void createCollageagain() {
		Picture flower1 = new Picture("images/flower1.jpg");
		Picture flower2 = new Picture("images/flower2.jpg");
		this.copyy(flower1, 0, 0, 50, 50);
		this.copyy(flower2, 100, 0, 160, 70);
		this.copyy(flower1, 200, 0, 209, 50);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copyy(flowerNoBlue, 300, 0, 320, 100);
		this.copyy(flower1, 400, 0, 470, 90);
		this.copyy(flower2, 500, 0, 5, 4);
		this.mirrorVertical();
		this.write("images/collage.jpg");
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist
	 *            the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel bottomPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color leftColor = null;

		for (int row = 0; row < pixels.length - 1; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				leftColor = leftPixel.getColor();
				rightPixel = pixels[row][col + 1];
				bottomPixel = pixels[row + 1][col];

				if (bottomPixel.colorDistance(leftColor) > edgeDist || bottomPixel.colorDistance(leftColor) > edgeDist)
					leftPixel.setColor(Color.black);
				else
					leftPixel.setColor(Color.white);

			}

		}
	}
	/**
	 * Method to blur an image
	 */
	public void blur(int x, int y, int w, int h) {
		Pixel[][] pixels = this.getPixels2D();
		Pixel pix = null;
		Pixel rightpix = null;
		Pixel botpix = null; 
		Pixel leftpix = null;
		Pixel toppix = null;
		int blue;
		int green;
		int red;
		
		for(int row =y+1; row<y+h-2; row++){
			for(int col = x+1; col<x+w-2; col++) {
				pix = pixels[row][col];
				rightpix = pixels[row][col+1];
				botpix = pixels[row+1][col];
				toppix = pixels[row-1][col];
				leftpix = pixels[row][col-1];
				blue = (toppix.getBlue()+leftpix.getBlue()+rightpix.getBlue()+botpix.getBlue())/4;
				green = (toppix.getGreen()+leftpix.getGreen()+rightpix.getGreen()+botpix.getGreen())/4;
				red = (toppix.getRed()+leftpix.getRed()+rightpix.getRed()+botpix.getRed())/4;
				pix.setBlue(blue);
				pix.setGreen(green);
				pix.setRed(red);			
			}
		}
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		Picture beach = new Picture("images/beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this
