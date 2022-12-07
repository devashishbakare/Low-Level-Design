package problems.SnakeLadder.Models;

import problems.SnakeLadder.Constants.Result;

import java.security.interfaces.RSAKey;

public class Player {
    private String userName;
    Position playerPosstion;

    private Result result;



    public Player(String userName, Position playerPosstion, Result result) {
        this.userName = userName;
        this.playerPosstion = playerPosstion;
        this.result = result;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Position getPlayerPosstion() {
        return playerPosstion;
    }

    public void setPlayerPosstion(Position playerPosstion) {
        this.playerPosstion = playerPosstion;
    }
    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
