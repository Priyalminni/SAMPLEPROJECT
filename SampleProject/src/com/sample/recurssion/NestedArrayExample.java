package com.sample.recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NestedArrayExample {

    // 1. data / property
    // 2. method
    
    public static void main(String[] args) {
        List<String> example  = Arrays.asList("a", "b", "c");
        List<String> a = new ArrayList<>(Arrays.asList("a", "b", "c"));

        List<String> b = new ArrayList<>();
        b.addAll(example);
        System.out.println(b);

        

        // List<String> innerList = new ArrayList<>();
        // innerList.add("a");
        // innerList.add("b");
        // innerList.add("c");

        // List< List<String> > outerList = new ArrayList<>();
        // outerList.add(innerList);

        // List<List<List<String>>> outermostList = new ArrayList<>();
        // outermostList.add(outerList);

        // System.out.println("innerList => " +innerList);
        // System.out.println("outerList => " +outerList);
        // System.out.println("outermostList => " +outermostList);

        

        
    }

}
