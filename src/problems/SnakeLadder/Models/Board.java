package problems.SnakeLadder.Models;

public class Board {
    private int size;
    private Enum status;

    public Board(){

    }
    public Board(int size, Enum status) {
        this.size = size;
        this.status = status;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }
}
