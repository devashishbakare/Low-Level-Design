package com.DesignPattern.ObserverPattern.CricketMatch;

public class AvarageScore implements MiddleMan {

    private float runRate;
    private int predictedScore;

    public int runs;
    public int wickets;
    public float overs;
    @Override
    public void update(int runs, int wickets, float overs)
    {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        this.runRate = (float)runs/overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }

    public void display()
    {
        System.out.println("\nAverage Score Display:\n" +
                "Run Rate: " + runRate +
                "\nPredictedScore: " + predictedScore);
    }
}
