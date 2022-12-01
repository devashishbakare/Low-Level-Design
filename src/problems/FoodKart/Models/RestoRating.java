package problems.FoodKart.Models;

public class RestoRating {

    private String restoName;
    private int rating;
    private int numberOfPeopleRated;

    public RestoRating(String restoName, int rating, int numberOfPeopleRated) {
        this.restoName = restoName;
        this.rating = rating;
        this.numberOfPeopleRated = numberOfPeopleRated;
    }

    public String getRestoName() {
        return restoName;
    }

    public void setRestoName(String restoName) {
        this.restoName = restoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNumberOfPeopleRated() {
        return numberOfPeopleRated;
    }

    public void setNumberOfPeopleRated(int numberOfPeopleRated) {
        this.numberOfPeopleRated = numberOfPeopleRated;
    }
}