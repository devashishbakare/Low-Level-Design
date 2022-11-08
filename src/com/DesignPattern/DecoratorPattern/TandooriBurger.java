package com.DesignPattern.DecoratorPattern;

public class TandooriBurger extends Burger{


    @Override
    public String getDescription(){
        return "Tandoori Burger";
    }

    @Override
    public double getCost(){
        return 160.0;
    }


}
