package com.sample.recurssion;

public class ratmaze {
    public static void main (String[] args){
        int row=3;
        int col=4;
        int [][] arr={{1,0,1,1},
                      {1,1,1,1},
                      {1,1,0,1}};
               print(0,0,row-1,col-1,"",arr);
    }

    public static void print(int sr,int sc,int er,int ec,String s,int[][]arr){
      if(sr<0||sc<0) return ;
      if(sr>er||sc>ec) return ;
      if(sr==er&&sc==ec){ 
      System.out.println(s);
      return;
    }
    if(arr[sr][sc]==0)return;
    if(arr[sr][sc]==-1) return;
    arr[sr][sc]=-1;
    print(sr+1,sc,er,ec,s+"D",arr);
    print(sr,sc-1,er,ec,s+"L",arr);
    print(sr,sc+1,er,ec,s+"R",arr);
    print(sr-1,sc,er,ec,s+"U",arr);
    arr[sr][sc]=1;
}

}