package problems.FoodKart.Models;

public class Review {

    private String restroName;
    private int rating;
    private String comment;

    public Review(String restroName, int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
        this.restroName = restroName;
    }
    public String getRestroName() {
        return restroName;
    }

    public void setRestroName(String restroName) {
        this.restroName = restroName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
