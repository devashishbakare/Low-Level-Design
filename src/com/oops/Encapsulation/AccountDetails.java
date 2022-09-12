package com.oops.Encapsulation;

public class AccountDetails {
    // declaring data member as private
    private String name;
    private String accNumber;
    private float amount;

    // using getter and setter to access

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAccNumber(){
        return accNumber;
    }

    public void setAccNumber(String accNumber){
        this.accNumber = accNumber;
    }

    public float getAmount(){
        return amount;
    }

    public void setAmount(float amount){
        this.amount = amount;
    }


    public static void main(String args[]){
        AccountDetails hdfc = new AccountDetails();

        // using setter to account details
        hdfc.setName("devashish bakare");
        hdfc.setAccNumber("hdfc12345");
        hdfc.setAmount(90000);

        // displaying accout details using getter methods

        System.out.println("Account holder name : "+ hdfc.getName());
        System.out.println("Acount Number : " + hdfc.getAccNumber());
        System.out.println("Acount has total amount : " + hdfc.getAmount());

    }

    /*
    Output :
    Account holder name : devashish bakare
    Acount Number : hdfc12345
    Acount has total amount : 90000.0
     */
}
