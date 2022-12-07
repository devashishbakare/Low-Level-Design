package problems.SnakeLadder.Driver;

import problems.SnakeLadder.Constants.Result;
import problems.SnakeLadder.Constants.Status;
import problems.SnakeLadder.Models.*;
import problems.SnakeLadder.Services.BoardService;
import problems.SnakeLadder.Services.GameService;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String args[]){

        int size = 100;
        Board board = new Board(size, Status.NOT_STARTED_YET);

        Snake snake = new Snake(34, 5);
        Snake snake1 = new Snake(45, 11);
        Snake snake2 = new Snake(78, 40);
        Snake snake3 = new Snake(90, 9);
        Snake snake4 = new Snake(99, 89);

        Ladder ladder = new Ladder(10, 20);
        Ladder ladder1 = new Ladder(30, 50);
        Ladder ladder2 = new Ladder(60, 70);
        Ladder ladder3 = new Ladder(71, 80);
        Ladder ladder4 = new Ladder(91, 98);

        BoardService boardService = BoardService.getBoardServiceInstance();
        boardService.buildBoard(size);
        boardService.addSnake(snake);
        boardService.addSnake(snake1);
        boardService.addSnake(snake2);
        boardService.addSnake(snake3);
        boardService.addSnake(snake4);

        boardService.addLadder(ladder);
        boardService.addLadder(ladder1);
        boardService.addLadder(ladder2);
        boardService.addLadder(ladder3);
        boardService.addLadder(ladder4);

        Dice dice = new Dice(1,6);
        Player dev = new Player("Devashish Bakare", new Position(0), Result.NOT_YET_DEFINE);
        Player shubham = new Player("Shubham Khilari", new Position(0), Result.NOT_YET_DEFINE);
        Player chinu = new Player("Chinmay Dhole", new Position(0), Result.NOT_YET_DEFINE);

        List<Player> allPlayer = new ArrayList<>();
        allPlayer.add(dev);
        allPlayer.add(shubham);
        allPlayer.add(chinu);

        GameService gameService = GameService.getGameServiceInstance();
        gameService.addPlayer(allPlayer);

        gameService.startGame();
        gameService.getResult(allPlayer);

    }

}
