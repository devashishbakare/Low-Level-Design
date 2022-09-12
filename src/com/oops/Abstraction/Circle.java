package com.oops.Abstraction;

class Circle extends Shape {
    
    public double redius;
    public double ans;

    public Circle(double redius){
        this.redius = redius;    
        ans = 0;
    }
    
    @Override
    public void calculateArea(){
        ans = Math.PI * Math.pow(redius, 2);
    }
    @Override
    public double printResult(){
        return ans;
    }
}
