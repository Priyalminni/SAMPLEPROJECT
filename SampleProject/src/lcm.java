import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enetr the  first number ");
        int first= input.nextInt();
        System.out.println("Enetr the  second  number ");
        int second= input.nextInt();
        int Lcm = lcm(first,second);
        System.out.println("lcm is "+Lcm);    
    }
    public static int lcm(int first, int second ){
        int i =1;
        while(i<=second){
            int factor=first*i;
            if (factor %second ==0){
                return factor;
            }
            i++;
        }
        return 0;

    }
}
