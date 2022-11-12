package com.DesignPattern.SingletonDesignPattern.doubleChecking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Driver {
    public static void main(String args[]){

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(()-> TvSet.getInstance());
        executor.execute(()-> TvSet.getInstance());
        executor.execute(()-> TvSet.getInstance());
        executor.execute(()-> TvSet.getInstance());
        executor.execute(()-> TvSet.getInstance());



    }
}
