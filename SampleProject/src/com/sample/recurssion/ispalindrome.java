package com.sample.recurssion;


public class ispalindrome {
    public static void main(String[] args) {
        String s="madam";
        System.out.println(palidrome(s, 0, s.length()-1));
    }
    static boolean palidrome(String s,int i,int j){
        if (s.charAt(i)!=s.charAt(j)) {
            return false;
        }
        if(i>=j){
            return true;
        }
        return palidrome(s, i+1, j-1);
    }
}

/*
 * package recursionLIVE;

public class MainClass {
    public static void main(String[] args) {
        double a = 5;
        int b = -2;
        int m = (int) (1e9+7);

        if(b < 0) a = 1/a;

        double res = powerFunction(Math.abs(a), Math.abs(b)); // O(n)
        double res2 = fastPower(Math.abs(a), Math.abs(b), m); // O(logn)
        if(a < 0) {
            res = -res;
            res2 = -res2;
        }

        System.out.println(res);
        System.out.println(res2);
//        int m = 2;
//        int n = 2;
//        System.out.println(matrixPaths(m, n));
    }

    static int matrixPaths(int m, int n) {
        if(m == 1 || n == 1) return 1;
        return matrixPaths(m, n-1) + matrixPaths(m-1, n);
    }

    static double fastPower(double a, int b, int m) {
        if(b == 0) return 1;
        if(b%2 == 0) return fastPower((a*a)%m, b/2, m);
        return (a * fastPower(a, b-1, m) % m) %m;
    }

    static double powerFunction(double a, int b) {
        if(b == 0) return 1;
        return powerFunction(a, b-1) * a;
    }
}

 */