package prct;

public class pattern1 {
    
    //1. Property 
    //2. Functions 
    int x;
    int y;

    public void pattrn1(int n ){
        for (int row = 1; row <=n; row++) {
            for (int col = row; col <=n; col++) {
                System.out.print("* ");        
            }
            System.out.println(); 
        }
    }

    static void pattrn(int n ){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");          
            }
            System.out.println();     
        }
    }

    public static void main(String[] args) {
        /**
         * Rule 1: Koi bhi function ya variable access us class ke object se hota hain.
         * Rule 2: Ab agar koi function tabhi call hoga jab uska object ho toh fir java program start krne ke liye 
         *         main() method chahiye, but sabse start mein koi object toh bana nhi hoga, toh fir java program start kaise hoga !???
         * 
         *         Is liye static jaisa special feature aaya, jiske help se koi bhi method bina object ke bhi (sirf Class name se)
         *         bhi call ho jaaye.
         *         
         *         Is liye main() method ko entry point method bhi kehte hain.
         * 
         * */      
        pattern1 obj = new pattern1();
        obj.pattrn1(0);

        pattrn(4);
        //pattrn1(5);
    }
    
}
/*
*
**
***
****
*/