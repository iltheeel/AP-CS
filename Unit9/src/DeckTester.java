/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"hearts", "clubs", "spades", "diamonds"};
		int[] pointos = {1,2,3};
		String[] suitos = {"prince philip", "prince andrew"};
		int[] puntos = {4,5,6};
		
		Deck deck1 = new Deck(ranks, suits, pointos);
		deck1.deal();
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		
		Deck deck2 = new Deck(ranks, suitos, puntos);
		deck2.deal();
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		
		Deck deck3 = new Deck(ranks, suitos, pointos);
		deck3.deal();
		System.out.println(deck3.isEmpty());
		System.out.println(deck3.size());
		
	}
}
