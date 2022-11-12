package com.DesignPattern.SingletonDesignPattern.OneLock;

public class Driver {

    public static void main(String args[]){

        TvSet tvsetInstance1 = TvSet.getTvSetInstance();
        TvSet tvsetInstance2 = TvSet.getTvSetInstance();

        System.out.println(tvsetInstance1); //TvSet@3f0ee7cb
        System.out.println(tvsetInstance2); //TvSet@3f0ee7cb

    }

}
