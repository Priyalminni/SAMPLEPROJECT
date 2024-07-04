package com.sample.recurssion;

public class recursionbasic {
    public static void main(String[] args) {
        bar(3);
    }
    static void bar(int n){
        if(n>0){
            System.out.println(n);
            bar(n-1);
            bar(n-1);
        }
    }
}
