package com.Inheritance.Heirarchical;

public class SDE extends Employee{

    public String teamName;
    public int taskId;

    public SDE(String teamName, int taskId, String orgName, String myName, int myId){
        super(orgName, myName, myId);
        this.teamName = teamName;
        this.taskId = taskId;
    }

    public void classInfo(){
        System.out.println("SDE class");
    }

}
