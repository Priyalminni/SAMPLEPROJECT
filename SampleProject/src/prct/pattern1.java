package prct;

public class pattern1 {
    public static void main(String[] args) {
        pattern(4);
        pattern1(5);
    }
    static void pattern(int n ){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
    static void pattern1(int n ){
        for (int row = 1; row <=n; row++) {
            for (int col = row; col <=n; col++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
}
/*
*
**
***
****
*/