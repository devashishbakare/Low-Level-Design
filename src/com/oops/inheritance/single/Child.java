package com.oops.inheritance.single;

class Child extends Parent{
    
    public String schoolName;
    public int phoneNo;
    
    public Child(int houseNo, int numberOfRooms, String address, String schoolName, int phoneNo) {
        super(houseNo, numberOfRooms, address);
        this.schoolName = schoolName;
        this.phoneNo = phoneNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void childInfo(){
        super.parentMethod();
        System.out.println("school Name " +schoolName);
        System.out.println("Phone No " +phoneNo);

    }
    
    
    

    
}
