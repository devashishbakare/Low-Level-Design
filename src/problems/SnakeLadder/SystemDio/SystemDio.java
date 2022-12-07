package problems.SnakeLadder.SystemDio;
//logic : we are creating board as map
//why map? : coz when every player get into new position, base on that position, we return the position(whether its snake or ladder)
import problems.SnakeLadder.Constants.Result;
import problems.SnakeLadder.Constants.Status;
import problems.SnakeLadder.Models.*;
import problems.SnakeLadder.Services.BoardService;

import java.util.*;

public class SystemDio {
    private static SystemDio systemDioServiceInstance = null;
    Board board = new Board();
    List<Player> allPlayer;
    HashMap<Integer, Integer> boardMap = new HashMap<>();
    Queue<Player> queue;

    Scanner sc = new Scanner(System.in);
    private SystemDio(){
        allPlayer = new ArrayList<>();
        queue = new LinkedList<>();
    }

    public static SystemDio getSystemDioServiceInstance(){
        if(systemDioServiceInstance == null){
            systemDioServiceInstance = new SystemDio();
        }
        return systemDioServiceInstance;
    }
    public void buildBoard(int size) {
        System.out.println("systemDioBoardService ans size "+size);
        for(int i = 1; i <= size; i++){
            boardMap.put(i, i);
            System.out.println(boardMap.get(i));
        }
    }

    public void addSnake(Snake snake) {
        boardMap.put(snake.getStartPossition(), snake.getEndPossition());
    }

    public void addLadder(Ladder ladder) {
        boardMap.put(ladder.getStartPosition(), ladder.getEndPossition());
    }

    public void addPlayer(List<Player> allPlayer) {

        for(Player player : allPlayer){
            this.allPlayer.add(player);
            queue.add(player);
        }
    }

    public void startGame() {
        board.setStatus(Status.RUNNING);
        while(queue.size() > 0){

            Player player = queue.remove();

            if(makeMove(player)){
                break;
            };
            queue.add(player);
        }
    }

    public boolean makeMove(Player player){
        System.out.println("enter any character to roll the dice ");
        char ch = sc.next().charAt(0);

        Dice dice = new Dice();
        int diceCount = dice.roll();
        System.out.println(player.getUserName()+" dice count is "+diceCount);

        int currPosition = player.getPlayerPosstion().getCurrPossition();
        int updatedPosition = currPosition;
        if( currPosition + diceCount < 101){
            int val = currPosition + diceCount;
            updatedPosition = boardMap.get(val);
            System.out.println("your position after dice "+updatedPosition);
        }else{
            System.out.println("out of bound, you current position "+updatedPosition);
        }
        if(updatedPosition == 100){
            player.setResult(Result.WIN);
            return true;
        }
        player.setPlayerPosstion(new Position(updatedPosition));
        return false;
    }


    public void winner(List<Player> allPlayers) {
        for(Player player : allPlayers){
            if(player.getResult() == Result.WIN){
                System.out.println(player.getUserName()+" won the game");
            }
        }
    }


}
