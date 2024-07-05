package com.sample.collection;
import java.util.*;

public class learnarraylist{
public static void main(String[] args) {
    List <String> li= new ArrayList<>();
    li.add("red");
    li.add("blue");
    li.add("white");
    for (String string : li) {
        System.out.println("for each string in li"+string);
    }
}

}
/*Write a Java program to create an array list, add some colors (strings) and print out the collection. */