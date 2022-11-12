package com.DesignPattern.ObserverPattern.CricketMatch;

public class LiveScoreTracker {

    public int runs, wickets;
    public float overs;
    AvarageScore avarageScore;
    CurrentScore currentScore;

    public LiveScoreTracker(int runs, int wickets, float overs, AvarageScore avarageScore, CurrentScore currentScore){
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        this.avarageScore = avarageScore;
        this.currentScore = currentScore;
        avarageScore.update(runs, wickets, overs);
        currentScore.update(runs, wickets, overs);

    }

    public AvarageScore getAvarageScore() {
        return avarageScore;
    }

    public void setAvarageScore(AvarageScore avarageScore) {
        this.avarageScore = avarageScore;
    }

    public CurrentScore getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(CurrentScore currentScore) {
        this.currentScore = currentScore;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public float getOvers() {
        return overs;
    }

    public void setOvers(float overs) {
        this.overs = overs;
    }








}
