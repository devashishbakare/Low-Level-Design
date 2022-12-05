package problems.OnlineDatingApp.Models;

public class Match {
    private int matchId;
    private User user1;
    private User user2;

    public Match(int matchId, User user1, User user2) {
        this.matchId = matchId;
        this.user1 = user1;
        this.user2 = user2;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }
}
