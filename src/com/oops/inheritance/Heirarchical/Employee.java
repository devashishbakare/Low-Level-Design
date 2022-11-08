package com.oops.inheritance.Heirarchical;

public class Employee {

    public String orgName;
    public String name;
    public int id;

    public Employee(String orgName, String name, int id){
        this.orgName = orgName;
        this.name = name;
        this.id = id;
    }

    void getInfo(){
        System.out.println("In Employee class");
    }

}
