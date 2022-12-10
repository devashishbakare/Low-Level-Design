package problems.ChessGame.Models;

public class Move {
	Player turn;
	Piece piece;
	Piece killedPiece;
	CellPosition startPosition;
	CellPosition endPosition;

	public Move(Player turn, Piece piece, Piece killedPiece, CellPosition startPosition, CellPosition endPosition) {
		this.turn = turn;
		this.piece = piece;
		this.killedPiece = killedPiece;
		this.startPosition = startPosition;
		this.endPosition = endPosition;
	}

	public Player getTurn() {
		return turn;
	}

	public void setTurn(Player turn) {
		this.turn = turn;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public Piece getKilledPiece() {
		return killedPiece;
	}

	public void setKilledPiece(Piece killedPiece) {
		this.killedPiece = killedPiece;
	}

	public CellPosition getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(CellPosition startPosition) {
		this.startPosition = startPosition;
	}

	public CellPosition getEndPosition() {
		return endPosition;
	}

	public void setEndPosition(CellPosition endPosition) {
		this.endPosition = endPosition;
	}
}
