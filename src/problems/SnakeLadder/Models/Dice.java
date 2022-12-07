package problems.SnakeLadder.Models;

import java.util.Random;

public class Dice {
    public int min;
    public int max;

    public Dice(){}
    public Dice(int min, int max)
    {
        this.min = min;
        this.max = max;
    }


    public int roll()
    {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
