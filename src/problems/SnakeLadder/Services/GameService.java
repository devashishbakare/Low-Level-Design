package problems.SnakeLadder.Services;

import problems.SnakeLadder.Models.Player;
import problems.SnakeLadder.SystemDio.SystemDio;

import java.util.List;

public class GameService {
    private static GameService gameServiceInstance = null;
    private GameService(){

    }
    public static GameService getGameServiceInstance(){
        if(gameServiceInstance == null){
            gameServiceInstance = new GameService();
        }
        return gameServiceInstance;
    }

    SystemDio systemDio = SystemDio.getSystemDioServiceInstance();
    public void addPlayer(List<Player> allPlayer) {
        if(allPlayer.size() == 0){
            System.out.println("There is no player please add players to start game");
        }
        systemDio.addPlayer(allPlayer);
    }

    public void startGame() {
        systemDio.startGame();
    }
    public void getResult(List<Player> allPlayers){
        systemDio.winner(allPlayers);
    }
}
