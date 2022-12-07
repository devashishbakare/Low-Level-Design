package problems.SnakeLadder.Models;

public class Ladder {
    private int startPosition;
    private int endPossition;

    public Ladder(int startPosition, int endPossition) {
        this.startPosition = startPosition;
        this.endPossition = endPossition;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getEndPossition() {
        return endPossition;
    }

    public void setEndPossition(int endPossition) {
        this.endPossition = endPossition;
    }

}
