package prct;

public class pattern2 {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(5);
    }
    static void pattern2(int n){
        for (int row=0;row<n;row++){
            for (int col=5;col>row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row=0;row<=n;row++){
            for (int col=row;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
/*

 *****
 ****
 ***
 ** 
 */