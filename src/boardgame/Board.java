package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if (rows <1 || columns <1) {
			throw new BoardExcepetion("Numero de linha ou colunas invalido!");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Piece piece (int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardExcepetion("Posi��o n�o existe!");
		}
		return pieces [row] [column];
		
	}
	
	public Piece piece (Position position) {
		if (!positionExists(position)) {
			throw new BoardExcepetion("Posi��o n�o existe!");
		}
		return pieces [position.getRow()][position.getColumn()];
	}
	
	public void placePiece (Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardExcepetion("Ja existe uma pe�a na posi��o: " +position );
		}
		pieces [position.getRow()][position.getColumn()] = piece;
	}
	
	public Piece removePiece (Position position) {
		return null;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece (Position position) {
		if (!positionExists(position)) {
			throw new BoardExcepetion("Posi��o n�o existe!");
		}
		return piece(position) != null;
	}
}