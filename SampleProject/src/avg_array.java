import java.util.Scanner;

public class avg_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the size of array ");
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<=size;i++){
            System.out.println("please enter the values elment :");
            nums[i]=sc.nextInt();
        }
        for(int num:nums){
            System.out.println(num);
        }

    }
}
