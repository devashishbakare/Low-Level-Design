package problems.OnlineDatingApp.Driver;

import problems.OnlineDatingApp.constants.Gender;
import problems.OnlineDatingApp.Models.User;
import problems.OnlineDatingApp.Sevices.MatchService;
import problems.OnlineDatingApp.Sevices.UserService;

public class Driver {
    public static void main(String args[]){

        //need to call some function, we need to specify some input first
        UserService userService = UserService.getUserServiceInstance();

        User devashish_bakare = userService.createAccount("Devashish Bakare", 1, 2, 24, Gender.MALE, 98763424);
        User virat_kohli = userService.createAccount("Virat Kohli", 2, 4, 35, Gender.MALE, 45763424);
        User anushka_sharma = userService.createAccount("Anushka Sharma", 4, 5, 32, Gender.FEMALE, 45667);
        User angel_priya = userService.createAccount("Angel Priya", 3, 5, 20, Gender.FEMALE, 123455);
        User sanjay_singhaniya = userService.createAccount("Sanjay Singhaniya", 5, 6, 25, Gender.MALE, 123455);

        MatchService matchService = MatchService.getMatchServiceInstance();

//        matchService.potentialMatch(anushka_sharma);
//        matchService.potentialMatch(devashish_bakare);

        matchService.liked(virat_kohli, anushka_sharma);
        matchService.liked(anushka_sharma, virat_kohli);
        matchService.liked(sanjay_singhaniya, angel_priya);
        matchService.liked(angel_priya, sanjay_singhaniya);

        matchService.liked(sanjay_singhaniya, anushka_sharma);
        matchService.liked(anushka_sharma, sanjay_singhaniya);
        matchService.liked(devashish_bakare, anushka_sharma);

         //matchService.showMatches(anushka_sharma);
         matchService.ignore(anushka_sharma, devashish_bakare);
         //matchService.showMatches(anushka_sharma);
         matchService.ignore(anushka_sharma, sanjay_singhaniya);

        //matchService.showMatches(anushka_sharma);
        //matchService.showMatches(sanjay_singhaniya);

        matchService.showAllMatches();

    }
    //output
//    Devashish Bakare has following connections
//    ----
//    Virat Kohli has following connections
//    Anushka Sharma FEMALE 32----
//    Anushka Sharma has following connections
//    Virat Kohli MALE 35----
//    Angel Priya has following connections
//    Sanjay Singhaniya MALE 25----
//    Sanjay Singhaniya has following connections
//    Angel Priya FEMALE 20----

}
