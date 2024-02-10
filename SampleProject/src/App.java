import java.util.Scanner;

public class App {
    public static void main(String[] args)  
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first numer");
        float first=s.nextFloat();
        System.out.println("Enter Second numer");
        float Second = s.nextFloat();
        float product=first * Second;
        System.out.println("product"+ product );

    }
}
