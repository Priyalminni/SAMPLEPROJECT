package com.sample.recurssion;

public class GenericMethodExample {

    <T> void display(T t){
        System.out.println("Value of T:"+t);
    }

    public static void main(String[] args) {
        GenericMethodExample g = new GenericMethodExample();
        g.display("Hello World");
        g.display(123);
    }

}
