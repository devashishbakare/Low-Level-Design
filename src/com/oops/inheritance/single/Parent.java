package com.oops.inheritance.single;

public class Parent {
    
    public int HouseNo;
    public int NumberOfRooms;
    public String address;

    public Parent(int HouseNo, int NumberOfRooms, String address){
        this.HouseNo = HouseNo;
        this.NumberOfRooms = NumberOfRooms;
        this.address = address;
    }

    public int getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(int houseNo) {
        HouseNo = houseNo;
    }

    public int getNumberOfRooms() {
        return NumberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        NumberOfRooms = numberOfRooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void parentMethod(){
        System.out.println("House no is "+HouseNo);
        System.out.println("No of rooms is "+NumberOfRooms);
        System.out.println("Address "+address);
    }
}
