package com.DesignPattern.DecoratorPattern;

public class ExtraaCheese extends BurgerDecorator{

    private Burger burger;

    public ExtraaCheese(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription(){
        return burger.getDescription() + " with extra cheese";
    }

    @Override
    public double getCost(){
        return burger.getCost() + 30.0;
    }

}
