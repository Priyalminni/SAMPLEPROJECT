package com.sample.array;

public class multiroatebyk {
    public static void main(String[] args) {
        int a[] = {6, 1, 2, 9, 4, 7};
        int b[] = {2, 4};
       int ans[][] = multipleRotations(a, b);

       for(int e[] : ans) {
           printArray(e);
           System.out.println();
       }
    }
    static int[][] multipleRotations(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int ans[][] = new int[m][n];

        int temp[] = new int[2*n];
        for(int i = 0; i<n; i++) {
            temp[i] = a[i];
            temp[i+n] = a[i];
        }

        for(int i = 0; i<m; i++) {
            int offset = (b[i])%n;
            for(int j = 0; j<n; j++) {
                ans[i][j] = temp[j+offset];
            }
        }
        return ans;
    }


    static void printArray(int a[]) {
        for(int e: a) {
            System.out.print(e+" ");
        }
    }
}

/*
 * public class Solution {
    public int[][] multipleLeftRotation(int[] A, int[] B) {
        int ans[][] = rotation(A, B);
        for (int e[] : ans) {
            printArray(e);
            System.out.println();
        }
        return ans;
    }

    static int[][] rotation(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int ans[][] = new int[n][m];
    
        int temp[] = new int[2 * m];
        for (int i = 0; i < m; i++) {
            temp[i] = A[i];
            temp[m + i] = A[i];
        }

        for (int i = 0; i < n; i++) {
            int offset = (B[i] % m);
            for (int j = 0; j < m; j++) {
                ans[i][j] = temp[j + offset];
            }
        }

        return ans;
    }

    static void printArray(int a[]) {
        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}
 */