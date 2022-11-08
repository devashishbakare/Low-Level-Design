package com.DesignPattern.DecoratorPattern;

public class extraMeyo extends BurgerDecorator{

    private Burger burger;

    public extraMeyo(Burger burger){
        this.burger = burger;
    }

    public String getDescription(){
        return burger.getDescription() + " with extra meyo";
    }

    public double getCost(){
        return burger.getCost() + 20.0;
    }





}
