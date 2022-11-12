package com.Inheritance.single;

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}  
class Dog extends Animal{  
    void bark(){
        System.out.println("dog is animal and he is barking...");
    }
}  
class TestInheritance{  
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}