package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
		
	protected Board getBoard() {
		return board;
	}

	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}
	
	public abstract boolean [][] possibleMove();
	
	public boolean [][] possibleMove(Position position) {
		return null;
	}
	
}
