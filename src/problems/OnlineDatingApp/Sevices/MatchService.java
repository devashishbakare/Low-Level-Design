package problems.OnlineDatingApp.Sevices;

import problems.OnlineDatingApp.Dio.SystemDio;
import problems.OnlineDatingApp.Models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchService {
    private static MatchService matchServiceInstance = null;
    private MatchService(){
    }
    public static MatchService getMatchServiceInstance(){
        if(matchServiceInstance == null){
            matchServiceInstance = new MatchService();
            return matchServiceInstance;
        }
        return matchServiceInstance;
    }

    SystemDio systemDio = SystemDio.getSystemDioInstance();


//    public List<User> potentialMatch(User user){
//
//        if(user == null){
//            return new ArrayList<>();
//        }
//        return userDio.potentialMatch(user);
//    }

    public void liked(User user1, User user2){
        if(user1 == null || user2 == null){
            System.out.println("Invalid user");
            return;
        }
        systemDio.liked(user1, user2);
    }

    public void ignore(User user1, User user2){
        if(user1 == null || user2 == null){
            System.out.println("Invalid user");
            return;
        }
        systemDio.ignore(user1, user2);
    }

    public void showMatches(User user){
        if(user == null) return;
        systemDio.showMatches(user);
    }

    public void showAllMatches(){
       systemDio.showAllMatches();
    }

}
