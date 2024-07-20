package com.sample.array;

import java.util.ArrayList;

public class max_absolute_diff {
    public int maxArr(ArrayList<Integer> A) {
   	 //You can code here
    int arr1=Integer.MIN_VALUE;
    int arr2=Integer.MAX_VALUE;

    int arr3=Integer.MIN_VALUE;
    int arr4=Integer.MAX_VALUE;

    for (int i =0;i<A.size();i++){
      arr1=Math.max (arr1, A.get(i)+i);
      arr2=Math.min (arr2, A.get(i)+i);
      
      arr3=Math.max(arr3,A.get(i)-i);
      arr4=Math.min(arr4,A.get(i)-i);
    
    }
    return Math.max((arr1-arr2),(arr3-arr4));
    
  }
}
/*
 * You are given an array of N integers, A1, A2 ,..., AN. 
 * Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N. f(i, j) is defined as |A[i] - A[j]| + |i - j|, 
 * where |x| denotes absolute value of x.
 */