package problems.FoodKart.Models;
import java.util.*;
public class Restaurant {

    private int restroId;
    private String restroName;
    private List<String> listOfPincode;
    private String foodItem;
    private double price;
    private int quantity;

    private List<Review> restroReview;

    private int overAllRating;

    public Restaurant(String restroName, List<String> listOfPincode, String foodItem, double price, int quantity) {
        this.restroName = restroName;
        this.listOfPincode = listOfPincode;
        this.foodItem = foodItem;
        this.price = price;
        restroReview = new ArrayList<>();
        this.quantity = quantity;
        listOfPincode = new ArrayList<>(listOfPincode);
    }

    public int getRestroId() {
        return restroId;
    }

    public void setRestroId(int restroId) {
        this.restroId = restroId;
    }

    public String getRestroName() {
        return restroName;
    }

    public void setRestroName(String restroName) {
        this.restroName = restroName;
    }

    public List<String> getLostOfPincode() {
        return listOfPincode;
    }

    public void setLostOfPincode(List<String> lostOfPincode) {
        this.listOfPincode = lostOfPincode;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
