import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr the any number");
        int num=input.nextInt();
        int add= sumofDigit(num);
        System.out.println("sum of digit is "+add);

    }
    public static int sumofDigit(int num){
        int sum =0;
        while(num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        return sum;
    }
}
