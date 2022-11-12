package com.DesignPattern.SingletonDesignPattern.doubleChecking;

public class TvSet {

    private static TvSet tvsetInstance = null;

    private TvSet(){
        System.out.println("Instance has been initialized");
    }
    //we should not make overhead by creating a method synchronised.
    public static TvSet getInstance(){

        //Instead we will use the synchronized block;
        if(tvsetInstance == null){
            synchronized (TvSet.class){
                if(tvsetInstance == null){
                    tvsetInstance = new TvSet();
                }
            }
        }
        return tvsetInstance;
    }
}
