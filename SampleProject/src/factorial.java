import java.io.IOException;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enetr the any number");
            int num= input.nextInt();
            long fact=factor(num);
            System.out.println("factorial of "+num+ "is"+fact);
        }
    }
    public static long factor(int num) {
    if(num<2){
            return 1;
        }
        long fact=1;
        int i =2;
        while(i<=num){
            fact*= i;
        i++;
        }
        return fact;
    }
}
