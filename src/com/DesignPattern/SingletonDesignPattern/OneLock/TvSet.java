package com.DesignPattern.SingletonDesignPattern.OneLock;


public class TvSet {

    //we want to return the instance of this class
    private static TvSet tvsetInstance = null;
    //we want only one instance of this class, so make constructor a private
    private TvSet(){
        System.out.println("Tv set instance initialised!!");
    }

    //if our constructor is private then, how come we call this method to access the instance/object
    //So we make this method static so that we can call using class name
    public static TvSet getTvSetInstance(){
        if(tvsetInstance == null){
            tvsetInstance = new TvSet();
            return tvsetInstance;
        }else{
            return tvsetInstance;
        }
    }

}
