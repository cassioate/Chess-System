package Pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
	
	public Rook(Board board, Color color) {
		super(board, color);
	}

	public String toString() {
		return "R";
	}
	
	@Override
	public boolean[][] possibleMove() {
		return null;
	}
	
}
