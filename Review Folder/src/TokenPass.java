
public class TokenPass {
	private int[] board;
	private int currentPlayer;

	public TokenPass(int playerCount) {
		board = new int[playerCount];
		for (int i = 0; i < playerCount; i++) {
			board[i] = (int) Math.ceil(Math.random() * 10);
		}
		currentPlayer = (int) Math.floor(Math.random() * playerCount);
	}

	public void distributeCurrentPlayerTokens() {
		int tokener = board[currentPlayer];
		int taken = 0;
		int indexer = currentPlayer++;
		while (tokener > 0) {
			if (indexer > board.length - 1)
				indexer = 0;
			if (indexer == currentPlayer)
				taken++;
			else
				board[indexer]++;
			tokener--;
			indexer++;
		}
		board[currentPlayer]=taken;
	}

}
