package problems.SnakeLadder.Models;

public class Snake {
    private int startPossition;
    private int endPossition;

    public Snake(int startPossition, int endPossition) {
        this.startPossition = startPossition;
        this.endPossition = endPossition;
    }

    public int getStartPossition() {
        return startPossition;
    }

    public void setStartPossition(int startPossition) {
        this.startPossition = startPossition;
    }

    public int getEndPossition() {
        return endPossition;
    }

    public void setEndPossition(int endPossition) {
        this.endPossition = endPossition;
    }
}
