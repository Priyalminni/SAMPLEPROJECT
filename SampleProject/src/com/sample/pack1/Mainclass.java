package com.sample.pack1;
class Animals {
    void makeSound(){
        System.out.println("the cat says meaoo!");
    }
    
}
class Cat extends Animals{
    void makeSound(){
        System.out.println("dog is barking ");
    }
}
public class Mainclass{
    public static void main(String[] args) {
        Animals a=new Animals();
        Cat c=new Cat();
        a.makeSound();
        c.makeSound();
    }
}

// Write a Java program to create a class called Animal with a method called makeSound(). 
// Create a subclass called Cat that overrides the makeSound() method to bark.