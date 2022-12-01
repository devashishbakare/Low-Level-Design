package problems.FoodKart.Dio;

import problems.FoodKart.Constants.Gender;
import problems.FoodKart.Models.*;
import problems.FoodKart.Util.IdGenerator;
import problems.FoodKart.Util.SortByHighestRate;

import java.util.*;

public class SystemDio {

    private static SystemDio systemDioInstance = null;
    private SystemDio(){
    }

    public static SystemDio getSystemDioInstance(){
        if(systemDioInstance == null){
            systemDioInstance = new SystemDio();
            return systemDioInstance;
        }else{
            return systemDioInstance;
        }
    }


    User userLoggedIn = null;
    Map<Long, User> userMapToPhone = new HashMap<>();
    Map<User, List<Order>> userMapToOrder = new HashMap<>();
    Map<String, Restaurant> restaurantMapToName = new HashMap<>();
    Map<String, RestoRating> restroMapToRating = new HashMap<>();
    Map<String, Review> restroMapToReview = new HashMap<>();

    public User regiserUser(String userName, Gender gender, long phoneNumber, String pincode){

        if(userMapToPhone.containsKey(phoneNumber)){
            System.out.println("user is already register with user id "+userMapToPhone.get(phoneNumber)+" and phone number as "+phoneNumber);
            return userMapToPhone.get(phoneNumber);
        }else{
            User newUser = new User(IdGenerator.getId(), userName, phoneNumber, gender, pincode);
            userMapToPhone.put(phoneNumber, newUser);
        }

        return userMapToPhone.get(phoneNumber);
    }

    public boolean loginUser(long phoneNumber){

        if(userMapToPhone.containsKey(phoneNumber)){
            userLoggedIn = userMapToPhone.get(phoneNumber);
            System.out.println(userLoggedIn.getName()+" logged in successfully! ");
            return true;
        }else{
            System.out.println("Login failed, please try again!! ");
            return false;
        }
    }

    public void getUserHistory(User user){

        if(userMapToOrder.containsKey(user)){
            List<Order> allOrders = userMapToOrder.get(user);
            for(Order order : allOrders){
                System.out.println("You order from "+order.getRestoName()+" Quantity "+order.getQuantity()+" DishName "+restaurantMapToName.get(order.getRestoName()).getFoodItem());
            }
        }else{
            System.out.println("User not present in database ");
        }

    }

    public Restaurant registerRestaurant(String restroName, List<String> pincode, String foodItem, double price, int quantity){

        if(restaurantMapToName.containsKey(restroName)){
            System.out.println("Restourant is already exist ");
            return restaurantMapToName.get(restroName);
        }else{
            Restaurant restaurant = new Restaurant(restroName, pincode, foodItem, price, quantity);
            restaurantMapToName.put(restroName, restaurant);
            return restaurant;
        }
    }

    public boolean updateQuantity(String restoName, int quantity){
       if(restaurantMapToName.containsKey(restoName)==false){
           System.out.println("Unable to update the Restaurant is not present ");
           return false;
       }else{
           Restaurant restaurant = restaurantMapToName.get(restoName);
           restaurant.setQuantity(quantity);
           restaurantMapToName.put(restoName, restaurant);
           return true;
       }

    }

    public boolean userReveiw(String restoName, int rating, String comment){
        if(restaurantMapToName.containsKey(restoName) == false){
            System.out.println("Restaurant Name not present, please refill the details ");
            return false;
        }
        Review review  = new Review(restoName, rating, comment);
        restroMapToReview.put(restoName, review);

        if(restroMapToRating.containsKey(restoName)==false){
            RestoRating restoRating = new RestoRating(restoName, rating, 1);
            restroMapToRating.put(restoName, restoRating);
        }else{
            RestoRating restoRating = restroMapToRating.get(restoName);
            int updatePeopleWhoRated = restoRating.getNumberOfPeopleRated()+1;
            int currentRating = restoRating.getRating();
            int updatedRating = (currentRating + rating)/updatePeopleWhoRated;
            restroMapToRating.put(restoName, new RestoRating(restoName,updatedRating, updatePeopleWhoRated));
        }
        System.out.println("your review, has been submitted, thanks for reviewing ");
        return true;
    }

    public void showRestaurantListWithRating(){
        List<RestoRating> allRestroInfo = new ArrayList<>(restroMapToRating.values());
        Collections.sort(allRestroInfo, new SortByHighestRate());
        int size = allRestroInfo.size();
        for(RestoRating restoRating : allRestroInfo){
            System.out.println("Name: "+restoRating.getRestoName()+" Rating "+restoRating.getRating());
        }
    }
    public Order placeOrder(String restroName, int quantity){

        Restaurant restaurant = restaurantMapToName.get(restroName);
        if(restaurant.getQuantity() < quantity){
            System.out.println("quantity are not in uff to fulfill your wish, sorry for inconvenience ");
            return null;
        }

        Order order = new Order(IdGenerator.getId(), restroName, quantity);
        userMapToOrder.computeIfAbsent(userLoggedIn, v-> new ArrayList<>()).add(order);
        System.out.println("Your order has been successful ");
        return order;
    }

}
