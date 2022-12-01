package problems.FoodKart.Services;

import problems.FoodKart.Constants.Gender;
import problems.FoodKart.Dio.SystemDio;
import problems.FoodKart.Models.Order;
import problems.FoodKart.Models.User;

import java.util.List;

public class UserService {

    private static UserService userServiceInstance = null;

    private UserService(){

    }

    public static UserService getUserServiceInstance(){
        if(userServiceInstance == null){
            userServiceInstance = new UserService();
            return userServiceInstance;
        }else{
            return userServiceInstance;
        }
    }

    SystemDio systemDio = SystemDio.getSystemDioInstance();

     public User registerUser(String name, long phoneNumber, String pincode, Gender gender){

            if(name == null || phoneNumber <= 0 || pincode.isEmpty()) {
                return null;
            }
            return systemDio.regiserUser(name, gender, phoneNumber, pincode);
     }

     public boolean loginUser(long phoneNumber){
         if(phoneNumber <= 0){
             System.out.println("invalid details, please check and retry once again");
             return false;
         }
         return systemDio.loginUser(phoneNumber);
     }
     public boolean userReview(String name, int rating, String comments){
         if(name.isEmpty() || (rating <= 0 && rating > 5) || comments.isEmpty()){
             System.out.println("Please fill details careFully");
             return false;
         }
         return systemDio.userReveiw(name, rating, comments);
     }
    public void userHistory(User user){
         systemDio.getUserHistory(user);
    }

}
