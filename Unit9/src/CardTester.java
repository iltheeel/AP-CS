/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card ace = new Card("ACE", "SPADES", 1);
		Card queen = new Card("QUEEN", "HEARTS", 12);
		Card otherqueen = new Card("QUEEN", "HEARTS", 12);
		System.out.println(ace);
		System.out.println(ace.matches(queen));
		System.out.println(queen.matches(otherqueen));
		
	}
}
