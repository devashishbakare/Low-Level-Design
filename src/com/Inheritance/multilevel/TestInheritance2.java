package com.Inheritance.multilevel;

class TestInheritance2{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
        //babydog extends dog and dog extends animal
        //Animal <- Dog <- Babydog

}}  