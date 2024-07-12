package com.sample.recurssion;

import java.util.Scanner;

public class permu {
static void permut(char[] ar,int fi){
if (fi==ar.length-1){
 System.out.println(ar);
 return;
}
for(int i =fi;i<ar.length;i++){
    swap(ar,i,fi);
    permut(ar, fi+1);
    swap(ar,i,fi);
}
}
static void swap(char[] ar,int i,int fi){
    char temp=ar[i];
    ar[i]=ar[fi];
    ar[fi]=temp;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    permut(s.toCharArray(), 0);
}
}