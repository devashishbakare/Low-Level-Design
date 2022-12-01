package problems.FoodKart.Services;

import problems.FoodKart.Dio.SystemDio;
import problems.FoodKart.Models.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestaurantService {

    private static RestaurantService restaurantInstance = null;

    private RestaurantService(){

    }

    public static RestaurantService getRestaurantServiceInstance(){

        if(restaurantInstance == null){
            restaurantInstance = new RestaurantService();
            return restaurantInstance;
        }else{
            return restaurantInstance;
        }
    }

    SystemDio systemDio = SystemDio.getSystemDioInstance();

    public Restaurant registerRestaurant(String restauranceName, String pincode, String foodItem, double price, int quantity){

        if(restauranceName.isEmpty() || foodItem.isEmpty() || pincode.isEmpty() || price <= 0 || quantity <= 0){
            System.out.println("Failed to add restaurant, please insert details properly ");
            return null;
        }else{
            List<String> pincodeList = Arrays.asList(pincode.trim().split("/"));
            return systemDio.registerRestaurant(restauranceName, pincodeList, foodItem, price, quantity);
        }
    }

    public boolean updateQuantity(String name, int updatedQuantity){
        if(name.isEmpty() || updatedQuantity <= 0) {
            System.out.println("Unable to update data, please check data again ");
            return false;
        }else{
            return systemDio.updateQuantity(name, updatedQuantity);
        }
    }

    //yet to be implemented
    public void showRestaurantListWithRating(){
        systemDio.showRestaurantListWithRating();
    }


}
