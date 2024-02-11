public class pattern {
    public static void main(String[] args) {
        upperpattern();
        System.out.println("");
        lowerpattern();
    }
    public static void upperpattern(){
        int rows=0;
        while(rows<5){
            
            int i=0;
            while (i<rows) {
                System.out.print("*"); 
                i++;
            }
            System.out.println("*");
            rows++;
        }
    
    }
    public static void lowerpattern(){
        int rows = 5;

        // Outer loop for the number of rows
        for (int i = 0; i < rows; i++) {
            // Inner loop for printing '*' characters
        for (int j = rows - i; j > 0; j--) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
    }
}
}
