package problems.OnlineDatingApp.Sevices;

import problems.OnlineDatingApp.Dio.SystemDio;
import problems.OnlineDatingApp.Models.User;
import problems.OnlineDatingApp.Util.IdGenerator;
import problems.OnlineDatingApp.constants.Gender;

public class UserService {

    private static UserService userServiceInstance = null;
    private UserService(){

    }

    public static UserService getUserServiceInstance(){
        if(userServiceInstance == null){
            userServiceInstance = new UserService();
            return userServiceInstance;
        }
        return userServiceInstance;
    }

    SystemDio systemDioInstance = SystemDio.getSystemDioInstance();
    //createAccount("Devashish Bakare", 1, 2, 24,Gender.MALE, "98763424");
    public User createAccount(String name, int x, int y, int age, Gender gender, long phoneNumber){

        if(name.isEmpty() || x < 0 || y <0 || phoneNumber <= 0){
            return null;
        }

        return systemDioInstance.createAccount(IdGenerator.getId(), name, x, y, age, gender, phoneNumber);
    }

    public boolean deleteAccount(User user){
        if(user == null){
            System.out.println("user is null ");
            return false;
        }

        return systemDioInstance.deleteAccount(user);
    }

}
