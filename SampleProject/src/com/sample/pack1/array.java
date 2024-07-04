package com.sample.pack1;
public class array {
   public static void main(String[] args) {
    int[][] a = new int[3][3];
    for (int i = 0; i < a.length; i++) {
       for (int j = 0; j < a.length; j++) {
            a[i][j] = i+j;
       } 
    }
    System.out.println(a[2][1]);
   }

}
//The nested loops initialize the matrix with values i + j,
// where i is the row index and j is the column index. So, matrix[2][1] will be 2 + 1, which is 3

