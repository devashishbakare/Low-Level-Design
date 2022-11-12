package com.DesignPattern.ObserverPattern.CricketMatch;

public class Driver {

    public static void main(String args[]){

        AvarageScore avarageScore = new AvarageScore();
        CurrentScore currentScore = new CurrentScore();

        LiveScoreTracker liveScoreTracker1 = new LiveScoreTracker(150, 3, 16.3f, avarageScore, currentScore);
        LiveScoreTracker liveScoreTracker2 = new LiveScoreTracker(200, 5, 20.0f, avarageScore, currentScore);


    }

}
