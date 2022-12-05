package problems.OnlineDatingApp.Dio;
import problems.OnlineDatingApp.Models.User;
import problems.OnlineDatingApp.Sevices.UserService;
import problems.OnlineDatingApp.constants.Gender;
import java.util.*;
import java.util.HashMap;

public class SystemDio {

    private static SystemDio systemDioInstance = null;
    private SystemDio(){

    }
    public static SystemDio getSystemDioInstance(){
        if(systemDioInstance == null){
            systemDioInstance = new SystemDio();
            return systemDioInstance;
        }
        return systemDioInstance;
    }

    Map<Integer, User> userMap= new HashMap<>();
    Map<Integer, Set<User>> userMatch = new HashMap<>();


    public User createAccount(int id, String name, int x, int y, int age, Gender gender, Long phoneNumber) {
        User user = new User(id, name, x, y, gender, age, phoneNumber);
        userMap.put(id, user);
        return user;
    }

    public boolean deleteAccount(User user) {

        if(userMap.containsKey(user) == false){
            System.out.println("user is not present ");
            return false;
        }
        userMap.remove(user);
        return true;
    }

    public void liked(User user1, User user2){
        int user1Id = user1.getUserId();
        int user2Id = user2.getUserId();
        userMatch.computeIfAbsent(user1Id, v->new HashSet<>()).add(user2);
        userMatch.computeIfAbsent(user2Id, v->new HashSet<>()).add(user1);
        return;
    }

    public void ignore(User user1, User user2){

        Set<User> userList = userMatch.get(user1.getUserId());
        if(userList.contains(user2)){
            userList.remove(user2);
        }else{
            System.out.println(user2.getUserName()+" not present in "+user1.getUserName()+" list");
        }


        Set<User> userList1 = userMatch.get(user2.getUserId());
        if(userList1.contains(user1)){
            userList1.remove(user1);
        }else{
            System.out.println(user1.getUserName()+" not present in "+user2.getUserName()+" list");
        }

        return;
    }

    public void showMatches(User user){
        int id = user.getUserId();
        if(userMatch.containsKey(id)==false){
            System.out.println("user not found");
        }
        Set<User> list = userMatch.get(id);
        for(User connection : list) {
            System.out.println(connection.getUserName() + " " + connection.getGender() + " " + connection.getAge());
        }
    }

    public void showAllMatches(){

        for(int userid : userMatch.keySet()){
            Set<User> listOfMatch = userMatch.get(userid);
            System.out.println(userMap.get(userid).getUserName()+" has following connections ");
            for(User connection : listOfMatch){
                System.out.print(connection.getUserName()+" "+connection.getGender()+" "+connection.getAge());
            }
            System.out.println("----");
        }


    }

}

