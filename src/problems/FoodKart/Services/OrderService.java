package problems.FoodKart.Services;

import problems.FoodKart.Dio.SystemDio;
import problems.FoodKart.Models.Order;
import problems.FoodKart.Models.Restaurant;
import problems.FoodKart.Models.User;

public class OrderService {

    private static OrderService orderServiceInstance = null;

    private OrderService(){

    }

    public static OrderService getOrderServiceInstance(){
        if(orderServiceInstance == null){
            orderServiceInstance = new OrderService();
            return orderServiceInstance;
        }else{
            return orderServiceInstance;
        }
    }

    SystemDio systemDio = SystemDio.getSystemDioInstance();

    public Order placeOrder(String restroName, int quantity){
        if(restroName.isEmpty() || quantity <= 0 ){
            System.out.println("Unable to place order, please check details again ");
            return null;
        }else{
            return systemDio.placeOrder(restroName, quantity);
        }
    }


}
