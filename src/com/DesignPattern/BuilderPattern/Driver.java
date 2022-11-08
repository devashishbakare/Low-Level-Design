package com.DesignPattern.BuilderPattern;

public class Driver {
    public static void main(String args[]){
        //as we created DogBuilder as the static class, so only call from class name
        //Note the order, order does matter to client to remember.
        Dog dog1 = new Dog.DogBuilder().setBreed("German Sheffered").setName("tom").setPrice(4500).setGender("Male").build();
        Dog dog2 = new Dog.DogBuilder().setBreed("Vodafone").setPrice(4500).setName("brownee").setGender("Male").build();
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        //This is how we solve the problem of backward compatibility.
    }
}
