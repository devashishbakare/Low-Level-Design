package problems.FoodKart.Models;
import problems.FoodKart.Constants.Gender;

import java.util.*;
public class User {

        private int userId;
        private String userName;
        private long phoneNumber;
        private Gender gender;
        private String pincode;
        private List<Restaurant> restaurantList;
        private List<Order> orderList;


    public User(int userId, String name, long phoneNumber, Gender gender, String pincode) {
        this.userId = userId;
        this.userName = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.pincode = pincode;
        restaurantList = new ArrayList<>();
        orderList = new ArrayList<>();
    }

    public int getId() {
        return userId;
    }

    public void setId(int id) {
        this.userId = userId;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
