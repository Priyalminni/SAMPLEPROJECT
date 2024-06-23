package prct;

public class pattern5 {
    public static void main(String[] args) {
        npattern(3);
    }
    public static void npattern(int n ){
        for (int i = 1; i <=n; i++) {
            for (int j =1; j <i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <=n ; k++) {
                System.out.print("*");
                
            }
            for( int m=i;m<n;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 Output: 

*****
 ***
  *

  */