package com.oops.interfaces;

class LarningInterace {
      
    public static void main (String[] args) {
      
        //other calss should have implement the interface and those who implements they should write all the methods
        //creating object of bicycle class and access all the method those need to implement from the interface
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
          
        System.out.println("Bicycle present state :");
        bicycle.printStates();
          
        // creating instance of the bike as well
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
          
        System.out.println("Bike present state :");
        bike.printStates();
    }
}