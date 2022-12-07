package problems.SnakeLadder.Services;

import problems.SnakeLadder.Constants.Status;
import problems.SnakeLadder.Models.Board;
import problems.SnakeLadder.Models.Ladder;
import problems.SnakeLadder.Models.Snake;
import problems.SnakeLadder.SystemDio.SystemDio;

public class BoardService {

    private static BoardService boardServiceInstance = null;
    private BoardService(){
    }

    public static BoardService getBoardServiceInstance(){
        if(boardServiceInstance == null){
            boardServiceInstance = new BoardService();
        }
        return boardServiceInstance;
    }

    SystemDio systemDio = SystemDio.getSystemDioServiceInstance();
    public void addSnake(Snake snake) {
        if(snake == null){
            System.out.println("please insert position to add the snake in board");
        }
        systemDio.addSnake(snake);
    }

    public void addLadder(Ladder ladder) {
        if(ladder == null){
            System.out.println("please insert position to add the ladder in board");
        }
        systemDio.addLadder(ladder);
    }

    public void buildBoard(int size) {
        System.out.println("calling boardService");
        new Board(100, Status.NOT_STARTED_YET);
        systemDio.buildBoard(size);
    }
}
