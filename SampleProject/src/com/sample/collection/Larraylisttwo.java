package com.sample.collection;

import java.util.*;

public class Larraylisttwo {
public static void main(String[] args) {
    List <String> li= new ArrayList<>();
    li.add("red");
    li.add("blue");
    li.add("white");
    for (String string : li) {
        System.out.println(string);
    }
    for (int i = 0; i < li.size(); i++) {
        System.out.println(" using for loop "+li.get(i));
    }
}
}
/* Write a Java program to iterate through all elements in an array list*/