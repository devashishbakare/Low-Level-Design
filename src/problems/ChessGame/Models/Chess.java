package problems.ChessGame.Models;

import problems.ChessGame.Constants.GameStatus;

import java.util.List;

public class Chess {

	//A board in which we are playing
	ChessBoard chessBoard;
	//list of player which are playing right now
	Player[] player;

	Player currentPlayer;
	//List of move/history for this board
	List<Move> movesList;
	GameStatus gameStatus;

	//self-explanatory function
	//public boolean playerMove(CellPosition fromPosition, CellPositionb toPosition, Piece piece);
	//public boolean endGame();
	//private void changeTurn();

}