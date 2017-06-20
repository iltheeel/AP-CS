/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("images/beach.jpg");
		beach.zeroBlue();
		beach.explore();
	}

	public static void testKeepOnlyBlue() {
		Picture beach = new Picture("images/beach.jpg");
		beach.keepOnlyBlue();
		beach.explore();
	}
	
	public static void testKeepOnlyRed() {
		Picture beach = new Picture("images/beach.jpg");
		beach.keepOnlyRed();
		beach.explore();
	}
	
	public static void testKeepOnlyGreen() {
		Picture beach = new Picture("images/beach.jpg");
		beach.keepOnlyGreen();
		beach.explore();
	}
	
	public static void testKeepOnly() {
		Picture beach = new Picture("images/beach.jpg");
		beach.keepOnlyGreen();
		beach.explore();
	}
	
	public static void testNegate() {
		Picture beach = new Picture("images/beach.jpg");
		beach.negate();
		beach.explore();
	}

	public static void testGrayscale() {
		Picture beach = new Picture("images/beach.jpg");
		beach.grayscale();
		beach.explore();
	}

	public static void testFixUnderwater() {
		Picture beach = new Picture("images/water.jpg");
		beach.fixUnderwater();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("images/caterpillar.jpg");
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	public static void testMirrorVerticalRightToLeft() {
		Picture bug = new Picture("images/caterpillar.jpg");
		bug.mirrorVerticalRightToLeft();
		bug.explore();
	}

	public static void testMirrorHorizontal() {
		Picture pic = new Picture("images/redMotorcycle.jpg");
		pic.mirrorHorizontal();
		pic.explore();
	}

	public static void testMirrorHorizontalBotToTop() {
		Picture pic = new Picture("images/redMotorcycle.jpg");
		pic.mirrorHorizontalBotToTop();
		pic.explore();
	}

	public static void testMirrorDiagonal() {
		Picture pic = new Picture("images/beach.jpg");
		pic.mirrorDiagonal();
		pic.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("images/temple.jpg");
		temple.mirrorTemple();
		temple.explore();
	}

	public static void testMirrorArms() {
		Picture pic = new Picture("images/snowman.jpg");
		pic.mirrorArms();
		pic.explore();
	}

	public static void testMirrorGull() {
		Picture pic = new Picture("images/seagull.jpg");
		pic.mirrorGull();
		pic.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("images/640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	public static void testCollageAgain() {
		Picture canvas = new Picture("images/640x480.jpg");
		canvas.createCollageagain();
		canvas.explore();

	}
	public static void testNewCollageAgain() {
		Picture canvas = new Picture("images/640x480.jpg");
		canvas.myCollage();
		canvas.explore();

	}
	

	/** Method to test edgeDetection */
	public static void testEdgeDetection2() {
		Picture swan = new Picture("images/swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}
	
	public static void testEdgeDetection() {
		Picture swan = new Picture("images/swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}
	
	public static void testBlur(int x, int y, int w, int h)
	{
	   Picture redMoto = new Picture("images/beach.jpg");
	   for(int i =0; i< 10; i++) {
	    redMoto.blur(x,y,w,h);
	   }
	    redMoto.explore();
	}


	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorTemple();
		// testMirrorVerticalRightToLeft();
		// testMirrorHorizontal();
		// testMirrorHorizontalBotToTop();
		// testMirrorDiagonal();

		// testMirrorArms();
		// testMirrorGull();
		// testCollage();
		// testCollageAgain();
		// testNewCollageAgain();
		// testBlur(0, 0, 639, 479);
		// testEdgeDetection();
		// testEdgeDetection2();
		
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}