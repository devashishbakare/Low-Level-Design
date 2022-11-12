package com.Inheritance.Heirarchical;

public class Flipkart {

    public static void main(String args[]){

        Intern intern = new Intern(123, "diwali sale", "flipkart", "devashish bakare", 88);
        SDE sde = new SDE("ala-cart", 876, "flipkart", "piyush agarwal", 43);

        intern.classInfo();
        sde.classInfo();

        //inter and sde extended the employee class, so they can acess all the things in employee class

        System.out.println(intern.name);
        System.out.println(sde.name);




    }


}
