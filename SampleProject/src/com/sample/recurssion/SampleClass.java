package com.sample.recurssion;

import java.util.ArrayList;
import java.util.List;


public class SampleClass<T>{

    T x; //

    public static void main(String[] args) {
        // SampleClass s1 = new SampleClass();

        // Object s2 = new SampleClass();

        // List<String> l = new ArrayList<String>(); //<--- a, b, c
        // l.add("a");
        // l.add("b");
       
        // Object o = l.get(0);
        
        // Integer x = (Integer) o;

        SampleClass<String> c1 = new SampleClass<>();
        c1.x = "abc";

        SampleClass<Integer> c2 = new SampleClass<>();
        c2.x = 123;

        System.out.println("First case: "+c1.x);

        System.out.println("Second case: "+c2.x);
    }
}