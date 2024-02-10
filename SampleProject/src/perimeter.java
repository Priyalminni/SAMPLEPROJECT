import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" enter any num1");
        int num1 =sc.nextInt();
        System.out.println(" enter any num2");
        int num2 =sc.nextInt();
        System.out.println(" enter any num3");
        int num3 =sc.nextInt();
        if (num2 >num1&& num2> num3)
        {
            System.out.println("num2 is greater ");
        }
       else if (num3>num1&& num3> num2){
        System.out.println("num3 is greater ");
       }
        else
    {
            System.out.println("num 1 is greater");
    }
    }
    

}
