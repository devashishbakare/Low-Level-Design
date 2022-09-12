package com.oops.Abstraction;

class Rectangle extends Shape{
 
    public double length;
    public double width;
    public double ans;


    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        ans = 0;
    }

    @Override
    public void calculateArea(){
        ans = length * width;
    }
    
    @Override
    public double printResult(){
        return ans;
    }
}
