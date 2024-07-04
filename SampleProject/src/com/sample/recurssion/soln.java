package com.sample.recurssion;

public class soln {

        public static boolean arraySortedOrNot(int []arr, int n){
    
           // Base case: An array with 0 or 1 element is considered sorted
            if (n <= 1) {
                return true;  
            }
            
            // Check if the last two elements are in sorted order
            if (arr[n - 1] < arr[n - 2]) {
                return false;  // Array is not sorted
            }
            
            // Recursively check the rest of the array
            return arraySortedOrNot(arr, n - 1);
        }
        public static void main(String[] args) {
            int []arr={10,20,30,40,50};
            System.out.println(arraySortedOrNot(arr,5));
        }
    }

