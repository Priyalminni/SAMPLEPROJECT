package com.sample.pack1;
import java.util.Scanner;

public class sumofoddno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr the any number");
        int num=input.nextInt();
        int sum = sumofoddnum(num);
        System.out.println("sum of odd no "  +  sum);
    }
    public static int sumofoddnum( int num) {
        int sum =0;
        int i=1;
        while (i<=num) {
            sum+=i;
            i+=2;
            i++;
        }
        return sum;
        
    }
}
