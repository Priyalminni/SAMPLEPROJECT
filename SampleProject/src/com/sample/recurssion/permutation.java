package com.sample.recurssion;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class permutation {
    
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(permute(nums));
    }

        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            backtrack(list, nums, 0);
            list.sort(new CustomComparator());
            return list;
        }
    
        public static void backtrack( List<List<Integer>> res, int[] nums, int index){
            if(index==nums.length){
                res.add(toList(nums));
            }
            else{
                for(int i=index;i<nums.length;i++){
                    swap(index,i,nums);
                    backtrack(res,nums,index+1);
                    swap(index,i,nums);
                }
            }
        }
        public static List<Integer> toList(int[] nums){
            ArrayList<Integer> l=new ArrayList<>();
            for(int n: nums){
                l.add(n);
            }
            return l;
        }
        public static void swap(int m,int n,int[] nums){
            int temp=nums[m];
            nums[m]=nums[n];
            nums[n]=temp;
        }
    }
    
    class CustomComparator implements Comparator<List<Integer>> {
        public int compare(List<Integer> list1, List<Integer> list2) {
            for (int i = 0; i < list1.size(); i++) {
                if (i >= list2.size()) {
                    // List 2 is shorter, so List 1 comes after List 2
                    return 1;
                } else if (list1.get(i).equals(list2.get(i))) {
                    // Values are the same, continue to the next element
                    continue;
                } else {
                    // Values are different, compare them
                    return list1.get(i).compareTo(list2.get(i));
                }
            }
            // All elements are the same until this point
            if (list1.size() < list2.size()) {
                // List 1 is shorter, so List 1 comes before List 2
                return -1;
            } else if (list1.size() > list2.size()) {
                // List 2 is shorter, so List 1 comes after List 2
                return 1;
            }
            // Lists are identical
            return 0;
        }
    }




//     public static void main(String[] args) {
//         int nums[]={1,2,3};
//         System.out.println(permute(nums));
//     }

//     public static List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> res = new ArrayList<>();
//          boolean[] visited = new boolean[nums.length];
//          backtrack(res ,nums,new ArrayList(),visited);
//          return res;
//     }
    
//     static void  backtrack(List<List<Integer>> res,int[] nums,List<Integer> curr, boolean[] visited){
//                 if(curr.size()==nums.length){
//                  res.add(new ArrayList(curr));
//                     return;
//                 }

//                 for(int i=0;i<nums.length;i++){
//                     if(visited[i]==true)continue;
//                     curr.add(nums[i]);
//                     visited[i] = true;
//                     backtrack(res,nums, curr,visited);
//                     curr.remove(curr.size()-1);
//                     visited[i] = false;
//                 } 
//         }
// }