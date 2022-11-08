package com.oops.inheritance.Heirarchical;

public class Intern extends Employee {

    public int teamId;
    public String featureName;

    public Intern(int teamId, String featureName, String orgName, String myName, int myId){
        super(orgName, myName, myId);
        this.teamId = teamId;
        this.featureName = featureName;
    }

    public void classInfo(){
        System.out.println("Intern class");
    }

}
