package com.oops.Abstraction;

public class Test {
    public static void main(String args[]){
        Shape shape1 = new Circle(2);
        Shape shape2 = new Rectangle(2, 4);
                      
        shape1.calculateArea();
        shape2.calculateArea(); 
        
        System.out.println("Area of circle is " + shape1.printResult());
        System.out.println("Area of rectangle is " + shape2.printResult());
    }
}

//output
//Area of circle is 12.566370614359172
//Area of rectangle is 8.0