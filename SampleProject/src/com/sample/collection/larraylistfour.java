package com.sample.collection;

import java.util.*;

public class larraylistfour {
public static void main(String[] args) {
    List <String> li=new ArrayList<String>();
    List <Integer> li2=new ArrayList<>();
    li2.add(93);
    li2.add(36);
    li2.add(34);
    li2.add(63);
    li2.add(32);
    li2.add(4);
    li.add("red");
    li.add("blue");
    li.add("white");
    li.add("pink");
    li.add("navi blue");
    System.out.println("Before-->"+li);

    li.set(1, "black");
    
    System.out.println("after-->"+li);
    System.out.println(li.remove(3));
    System.out.println(li.contains("red"));
    Collections.sort(li);
    System.out.println("list after sorting -->"+li);
    //Collections.copy(li,li2);    
}
}
/*1.Write a Java program to update an array element by the given element 
 *2.Write a Java program to remove the third element from an array list
 3.. Write a Java program to search for an element in an array list.
 4.Write a Java program to sort a given array list.
 5.Write a Java program to copy one array list into another.
*/