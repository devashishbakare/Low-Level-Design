package problems.FoodKart.Driver;

import problems.FoodKart.Constants.Gender;
import problems.FoodKart.Models.User;
import problems.FoodKart.Services.OrderService;
import problems.FoodKart.Services.RestaurantService;
import problems.FoodKart.Services.UserService;

public class Driver {
    public static void main(String args[]){

        UserService userService = UserService.getUserServiceInstance();
        User user1  = userService.registerUser("devashish Bakare", 123456, "ABC", Gender.MALE);
        User user2  = userService.registerUser("Shubham Khilari", 56654, "CDS", Gender.MALE);

        userService.loginUser(123456);

        RestaurantService restaurantService = RestaurantService.getRestaurantServiceInstance();
        restaurantService.registerRestaurant("Hotel Sudhir", "ABC/CDS", "Paneer Chilly", 230.0, 2);
        restaurantService.registerRestaurant("Hotel Prasad", "ABC/CDS", "Soyabeen Chilly", 160.0, 2);

        OrderService orderService = OrderService.getOrderServiceInstance();
        orderService.placeOrder("Hotel Sudhir", 2);
        orderService.placeOrder("Hotel Prasad", 2);

        userService.userHistory(user1);

        restaurantService.updateQuantity("Hotel Sudhir", 2);
        userService.userReview("Hotel Sudhir", 3, "Service is poor");
        userService.userReview("Hotel Prasad", 4, "Service is Good, but test is ordinary");

        restaurantService.showRestaurantListWithRating();

        //output
        /*
            devashish Bakare logged in successfully!
            Your order has been successful
            Your order has been successful
            You order from Hotel Sudhir Quantity 2 DishName Paneer Chilly
            You order from Hotel Prasad Quantity 2 DishName Soyabeen Chilly
            your review, has been submitted, thanks for reviewing
            your review, has been submitted, thanks for reviewing
            Name: Hotel Prasad Rating 4
            Name: Hotel Sudhir Rating 3

        */

    }
}
