package boardgame;

public class Position {
	private int row;
	private int column;

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public Position (int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public void setValues (int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public String toString() {
		return row + ", " + column;
	}
}
