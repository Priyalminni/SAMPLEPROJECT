package prct;

public class pattern3 {
    public static void main(String[] args) {
        pattern(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
    }
    static void pattern(int n){
        for (int row=1;row<=n;row++) {
            for (int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
     static void pattern4(int n ){
        for(int row=1;row<=n;row++){
            for (int col = row;col <=n; col++) {
                System.out.print(" ");
                
            }
            for(int i= 1;i<=row;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n ){
        for(int row=1;row<=n;row++){
            for (int col = 1;col <=row; col++) {
                System.out.print(" ");
                
            }
            for(int i= row;i<=n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
}}

/*

1
12
123
1234
12345

     *
    **
   ***
  ****
 *****


 *****
  ****
   ***
    **
     *

 */