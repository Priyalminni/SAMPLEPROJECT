package com.sample.pack1;
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eneter the any number");
        int num = input.nextInt();
        multiplicationTable(num);

    }
    public static void multiplicationTable(int num){
        int i=1;
        while(i<=10){
            System.out.println(num +"X"+ i +"="+(num*i) );
            i++;
        }
    }
}
