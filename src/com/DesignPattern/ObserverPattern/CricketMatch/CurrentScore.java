package com.DesignPattern.ObserverPattern.CricketMatch;

public class CurrentScore implements MiddleMan {

    public int runs;
    public int wickets;
    public float overs;
        @Override
        public void update(int runs, int wickets, float overs)
        {
            this.runs = runs;
            this.wickets = wickets;
            this.overs = overs;
            display();
        }

        public void display()
        {
            System.out.println("\nCurrent Score Display: \n" +
                    "Runs: " + runs +"\nWickets:"
                    + wickets + "\nOvers: " + overs);
        }
    }



