package com.sample.prct;

public class pattern4 {

        public static void nStarTriangle(int n) {
            // Write your code here
            for(int row =1;row<=n;row++){
                for(int col=row;col<n;col++){
                    System.out.print(" ");
                }
                for(int i=1;i<=row;i++){
                    System.out.print("*");
                }
                for(int j=1;j<row;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args){
            nStarTriangle(3);
        }
    }

    /*
 Output: 

  *
 ***
*****

     */

