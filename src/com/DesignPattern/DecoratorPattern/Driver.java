package com.DesignPattern.DecoratorPattern;

public class Driver {

    public static void main(String args[]){

        //we only store the child object in parent frame
        Burger zinger = new ZingerBurger();
        Burger tandoori = new TandooriBurger();

        //we brought base burger then we adding topping to it.
        zinger = new extraMeyo(zinger);
        tandoori = new ExtraaCheese(tandoori);
        tandoori = new extraMeyo(tandoori);

        System.out.println(zinger.getDescription() + " and cost is: " + zinger.getCost());
        System.out.println(tandoori.getDescription() + " and cost is: " + tandoori.getCost());

    }

}
