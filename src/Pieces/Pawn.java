package Pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {
	
	public Pawn(Board board, Color color) {
		super(board, color);
	}

	public String toString() {
		return "P";
	}
	
	@Override
	public boolean[][] possibleMove() {
		return null;
	}
	
}

