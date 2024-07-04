package com.sample.pack1;



class Shape{
    void getArea(){
        System.out.println("find tha area of shape");
    }
}
class Rectangle extends Shape{
    void getArea(){
        System.out.println("find the area of rectangle");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s=new Shape();
        Rectangle r=new Rectangle();
        
    }
}
// Write a Java program to create a class called Shape with a method called getArea().
// Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.